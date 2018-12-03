(ns adventofcode.core
  (:require
    [clojure.spec.alpha :as s]
    [clojure.spec.test.alpha :as st]
    [expound.alpha :as expound]))


(s/check-asserts true)

(set! s/*explain-out* expound/printer)

(st/instrument)
