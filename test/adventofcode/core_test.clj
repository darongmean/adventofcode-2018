(ns adventofcode.core-test
  (:require
    [clojure.test :refer :all]
    [adventofcode.core]
    [adventofcode.day01 :as day01]))


(deftest day01-test
  (testing "part 01"
    (is (= 595 (day01/part-one))))
  (testing "part 02"
    (is (= 0 (day01/part-two [1 -1])))
    (is (= 10 (day01/part-two [3 3 4 -2 -4])))
    (is (= 5 (day01/part-two [-6 3 8 5 -6])))
    (is (= 14 (day01/part-two [7 7 -2 -7 -4])))
    (is (= 80598 (day01/part-two day01/changes)))))
