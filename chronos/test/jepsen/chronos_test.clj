(ns jepsen.chronos-test
  (:require [clojure.test :refer :all]
            [jepsen [core :as jepsen]]
            [jepsen.chronos :refer :all]))

(deftest install-test
  (is (:valid? (:results (jepsen/run! (simple-test "0.28.1-2.0.20.debian81"
                                                   "2.4.0-0.1.20151007110204.debian81"))))))

(deftest single-cut-test
  (is (:valid? (:results (jepsen/run! (cut-test "0.28.1-2.0.20.debian81"
                                                       "2.4.0-0.1.20151007110204.debian81"))))))
