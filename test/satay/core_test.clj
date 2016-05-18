(ns satay.core-test
  (:require [clojure.test :refer :all]
            [satay.core :refer :all]))

; TODO having trouble starting.
; what is my base 0?
; how does the expression "a AND NOT b" break down into a simpler form?
; TODO converting the string to clojure can be a later exercise
; for now, manually converting to e.g (and true (not false)) will suffice.

(and :a (not :b))

; Case that a formula is satisfiable.
(deftest satisfiability
  (testing "whether a boolean formula can be satisfied."
    (is (= (satisfy ("a AND NOT b")) {:a 1 :b 1}))))

;(deftest a-test
;  (testing "Given all the votes for an election, can all voters be satisfied?"
;    (def voters
;      {:voter1 ["a" "b" "-c"]
;       :voter2 ["b" "c"]
;       :voter3 ["-b"]
;       :voter4 ["-a" "c"]})
;    (is (= (satisfy (vals voters)) ["a" "b" "-c"]))))
