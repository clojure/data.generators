(ns clojure.data.generators-test
  (:require [clojure.data.generators :as gen]
            [clojure.test :refer (deftest is)]))

(deftest test-shuffle
  []
  (dotimes [_ 50]
    (let [coll (gen/vec gen/anything)
          shuf (gen/shuffle coll)]
      (is (= (into #{} coll)
             (into #{} shuf))))))

(deftest test-reservoir-sample-consistency
  []
  (dotimes [n 50]
    (let [coll (range 100)
          sample-1 (binding [gen/*rnd* (java.util.Random. n)]
                     (gen/reservoir-sample 10 coll))
          sample-2 (binding [gen/*rnd* (java.util.Random. n)]
                     (gen/reservoir-sample 10 coll))]
      (is (= sample-1 sample-2)))))
