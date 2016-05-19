(ns jepsen.chronos-test
  (:require [clojure.test :refer :all]
            [jepsen [core :as jepsen]]
            [jepsen.chronos :refer :all]))

(deftest install-test
  (is (:valid? (:results (jepsen/run! (simple-test "0.28.1-2.0.20.ubuntu1204"
                                            "2.4.0-0.1.20151007110204.ubuntu1204"))))))
