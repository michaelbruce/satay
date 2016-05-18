(ns satay.core-test
  (:require [clojure.test :refer :all]
            [satay.core :refer :all]))

(deftest a-test
  (testing "Given all the votes for an election, can all voters be satisfied?"
    (def voters
      {:voter1 ["a" "b" "-c"]
       :voter2 ["b" "c"]
       :voter3 ["-b"]
       :voter4 ["-a" "c"]})
    (is (= (satisfy (vals voters)) ["a" "b" "-c"]))))
