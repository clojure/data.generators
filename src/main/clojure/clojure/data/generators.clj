;   Copyright (c) Rich Hickey, Stuart Halloway, and contributors.
;   All rights reserved.
;   The use and distribution terms for this software are covered by the
;   Eclipse Public License 1.0 (http://opensource.org/licenses/eclipse-1.0.php)
;   which can be found in the file epl-v10.html at the root of this distribution.
;   By using this software in any fashion, you are agreeing to be bound by
;   the terms of this license.
;   You must not remove this notice, or any other, from this software.

(ns ^{:author "Stuart Halloway"
      :doc "Data generators for Clojure."}
  clojure.data.generators
  (:refer-clojure :exclude [byte char long int short float double boolean string symbol keyword list vec set hash-map name rand-nth byte-array boolean-array short-array char-array int-array long-array float-array double-array shuffle bigint bigdec])
  (:require [clojure.core :as core]))

(set! *warn-on-reflection* true)

(def ^:dynamic ^java.util.Random
     *rnd*
     "Random instance for use in generators. By consistently using this
instance you can get a repeatable basis for tests."
     (java.util.Random. 42))

(defn- call-through
  "Recursively call x until it doesn't return a function."
  [x]
  (if (fn? x)
    (recur (x))
    x))

(defn reps
  "Returns sizer repetitions of f (or (f) if f is a fn)."
  [sizer f]
  (let [count (call-through sizer)]
    (if (fn? f)
      (repeatedly count f)
      (repeat count f))))

(defn geometric
  "Geometric distribution with mean 1/p."
  ^long [p]
  (core/long (Math/ceil (/ (Math/log (.nextDouble *rnd*))
                           (Math/log (- 1.0 p))))))

(defn uniform
  "Uniform distribution from lo (inclusive) to high (exclusive).
   Defaults to range of Java long."
  (^long [] (.nextLong *rnd*))
  (^long[lo hi] {:pre [(< lo hi)]}
         (clojure.core/long (Math/floor (+ lo (* (.nextDouble *rnd*) (- hi lo)))))))

(defn float
  "Generate a float between 0 and 1 based on *rnd*"
  ^double []
  (.nextFloat *rnd*))

(defn double
  "Generate a double between 0 and 1 based on *rnd*."
  ^double []
  (.nextDouble *rnd*))

(defn rand-nth
  "Replacement of core/rand-nth that allows control of the
   randomization basis (through binding *rnd*)."
  [coll]
  (nth coll (uniform 0 (count coll))))

(defn tuple
  "Generate a tuple with one element from each generator."
  [& generators]
  (into [] (map #(%) generators)))

(defn weighted
  "Given a map of generators and weights, return a value from one of
   the generators, selecting generator based on weights."
  [m]
  (let [weights   (reductions + (vals m))
        total   (last weights)
        choices (map vector (keys m) weights)]
    (let [choice (uniform 0 total)]
      (loop [[[c w] & more] choices]
        (when w
          (if (< choice w)
            (call-through c)
            (recur more)))))))

(defn one-of
  "Generates one of the specs passed in, with equal probability."
  ([& specs]
     (weighted (zipmap specs (repeat 1)))))

(def long
  "Returns a long based on *rnd*. Same as uniform."
  uniform)

(defn ratio
  "Generate a ratio, with numerator and denominator uniform longs
   or as specified"
  ([] (ratio long long))
  ([num-gen denom-gen] (/ (num-gen) (denom-gen))))

(defn int
  []
  "Returns a long based on *rnd* in the int range."
  (uniform Integer/MIN_VALUE (inc Integer/MAX_VALUE)))

(defn short
  []
  "Returns a long based on *rnd* in the short range."
  (uniform Short/MIN_VALUE (inc (core/long Short/MAX_VALUE))))

(defn byte
  "Returns a long based on *rnd* in the byte range."
  ^long []
  (uniform Byte/MIN_VALUE (inc (core/int Byte/MAX_VALUE))))

(defn boolean
  "Returns a bool based on *rnd*."
  []
  (.nextBoolean *rnd*))

(defn printable-ascii-char
  "Returns a char based on *rnd* in the printable ascii range."
  []
  (core/char (uniform 32 127)))

(defn char
  "Returns a character based on *rnd* in the range 0-65536."
  []
  (core/char (uniform 0 65536)))

(defn default-sizer
  "Default sizer used to run tests. If you want a specific distribution,
   create your own and pass it to a fn that wants a sizer."
  []
  (dec (geometric 0.02)))

(defn list
  "Create a list with elements from f and sized from sizer."
  ([f] (list f default-sizer))
  ([f sizer]
     (reps sizer f)))

(defmacro primitive-array
  [type]
  (let [fn-name (core/symbol (str type "-array"))
        factory-name (core/symbol (str "core/" fn-name))
        cast-name (core/symbol (str "core/" type))]
    `(defn ~fn-name
       "Create an array with elements from f and sized from sizer."
       ([~'f]
          (~fn-name ~'f default-sizer))
       ([~'f ~'sizer]
          (let [~'arr (~factory-name (call-through ~'sizer))]
            (dotimes [~'i (count ~'arr)]
              (aset ~'arr ~'i (~cast-name (call-through ~'f))))
            ~'arr)))))

(defmacro primitive-arrays
  [types]
  `(do ~@(map (fn [type] `(primitive-array ~type)) types)))

(primitive-arrays ["byte" "short" "long" "char" "double" "float" "int" "boolean"])

#_(defn byte-array
      ([f]
         (byte-array f default-sizer))
      ([f sizer]
         (let [arr (core/byte-array (call-through default-sizer))]
           (dotimes [i (count arr)]
             (aset arr i (core/byte (call-through f))))
           arr)))

;; TODO: sensible default distributions for bigint, bigdec
(defn bigint
  ^clojure.lang.BigInt []
  (loop []
    (let [i (try
             (BigInteger. ^bytes (byte-array byte))
             (catch NumberFormatException e :retry))]
      (if (= i :retry) (recur) (core/bigint i)))))

(defn bigdec
  []
  (BigDecimal. (.toBigInteger (bigint)) (geometric 0.01)))

(defn vec
  "Create a vec with elements from f and sized from sizer."
  ([f] (vec f default-sizer))
  ([f sizer]
     (into [] (reps sizer f))))

(defn set
  "Create a set with elements from f and sized from sizer."
  ([f] (set f default-sizer))
  ([f sizer]
     (into #{} (reps sizer f))))

(defn hash-map
  "Create a hash-map with keys from fk, vals from fv, and
   sized from sizer."
  ([fk fv] (hash-map fk fv default-sizer))
  ([fk fv sizer]
     (into {}
           (zipmap (reps sizer fk)
                   (reps sizer fv)))))

(defn string
  "Create a string with chars from v and sized from sizer."
  ([] (string printable-ascii-char))
  ([f] (string f default-sizer))
  ([f sizer] (apply str (reps sizer f))))

(def ^:private ascii-alpha
  (concat (range 65 (+ 65 26))
          (range 97 (+ 97 26))))

(def ^:private symbol-start
  (-> (concat ascii-alpha [\* \+ \! \- \_ \?])
      core/vec))

(def ^:private symbol-char
  (into symbol-start [\1 \2 \3 \4 \5 \6 \7 \8 \9 \0]))

;; cannot generate every legal prefix, but at least avoids
;; the illegal "-1"
(defn- name-prefix
  []
  (str (rand-nth [(core/char (rand-nth symbol-start)) ""])
       (core/char (rand-nth ascii-alpha))))

(defn- name-body
  [sizer]
  (string #(core/char (rand-nth symbol-char)) sizer))

(defn- name
  ([] (name default-sizer))
  ([sizer]
     (str (name-prefix)
          (name-body sizer))))

(defn symbol
  "Create a non-namepsaced symbol sized from sizer."
  ([] (symbol default-sizer))
  ([sizer] (core/symbol (name sizer))))

(defn keyword
  "Create a non-namespaced keyword sized from sizer."
  ([] (keyword default-sizer))
  ([sizer] (core/keyword (name sizer))))

(defn uuid
  "Create a UUID based on uniform distribution of low and high parts."
  []
  (java.util.UUID. (long) (long)))

(defn date
  "Create a date with geoemetric mean around base. Defaults to
   #inst \"2007-10-16T00:00:00.000-00:00\""
  ([] (date #inst "2007-10-16T00:00:00.000-00:00"))
  ([^java.util.Date base]
     (java.util.Date. (geometric (/ 1 (.getTime base))))))

(def scalars
  [(constantly nil)
   byte
   long
   boolean
   printable-ascii-char
   string
   symbol
   keyword
   uuid
   date
   ratio
   bigint
   bigdec])

(defn scalar
  "Returns a scalar based on *rnd*."
  []
  (call-through (rand-nth scalars)))

(def collections
  [[vec [scalars]]
   [set [scalars]]
   [hash-map [scalars scalars]]])

(defn collection
  "Returns a collection of scalar elements based on *rnd*."
  []
  (let [[coll args] (rand-nth collections)]
    (apply coll (map rand-nth args))))

(defn anything
  "Returns a scalar or collection based on *rnd*."
  []
  (one-of scalar collection))

(defn ^:private fisher-yates
  "http://en.wikipedia.org/wiki/Fisher–Yates_shuffle#The_modern_algorithm"
  [coll]
  (let [as (object-array coll)]
    (loop [i (dec (count as))]
      (if (<= 1 i)
        (let [j (uniform 0 (inc i))
              t (aget as i)]
          (aset as i (aget as j))
          (aset as j t)
          (recur (dec i)))
        (into (empty coll) (seq as))))))

(defn shuffle
  "Shuffle coll based on *rnd*"
  [coll]
  ;; using our own fischer-yates instead of core/shuffle so that
  ;; we'll get the same shuffle, given the same *rnd*.
  (fisher-yates coll))

(defn reservoir-sample
  "Reservoir sample ct items from coll, using *rnd*."
  [ct coll]
  (loop [result (transient (core/vec (take ct coll)))
         n ct
         coll (drop ct coll)]
    (if (seq coll)
      (let [pos (uniform 0 n)]
        (recur (if (< pos ct) 
                 (assoc! result pos (first coll)) 
                 result)
               (inc n)
               (rest coll)))
      (persistent! result))))




