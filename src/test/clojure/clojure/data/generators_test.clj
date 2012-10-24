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
