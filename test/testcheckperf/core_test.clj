(ns testcheckperf.core-test
  (:require [clojure.test :refer :all]
            [clojure.test.check :as check]
            [clojure.test.check.clojure-test :refer [defspec]]
            [clojure.test.check.generators :as gen]
            [clojure.test.check.properties :as prop]))

(def simple-map-gen (gen/map gen/keyword gen/int))

(defspec merge-count
  100
  (prop/for-all [m1 simple-map-gen
                 m2 simple-map-gen]
    (let [merged (merge m1 m2)]
      (and (<= (count m1) (count merged))
           (<= (count m2) (count merged))))))
