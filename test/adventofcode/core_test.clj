(ns adventofcode.core-test
  (:require
    [clojure.test :refer :all]
    [adventofcode.core]
    [adventofcode.day01 :as day01]))


(deftest day01-test
  (testing "part 01"
    (is (= 595 (day01/frequency)))))
