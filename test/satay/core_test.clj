(ns satay.core-test
  (:require [clojure.test :refer :all]
            [satay.core :refer :all]))

; TODO having trouble starting.
; what is my base 0?
; how does the expression "a AND NOT b" break down into a simpler form?
; TODO converting the string to clojure can be a later exercise
; for now, manually converting to e.g (and true (not false)) will suffice.

; stages for evaluating a boolean expression
; 1. set variables (e.g a is true, b is true)
; 2. evaluate with values
; 3. if false then repeat steps, true then return until exhausted

; how to know which values to set in step 1? truth table?
; how can you compute all variations? by knowing the type of value? assume boolean unless otherwise stated.

(defn calculate-all-value-variations [a b]
  "each variation is calclated by changing one value in each iteration,
   you can't have a variation repeat"
  (let variations []
    )
  ; true true
  ; true false
  ; false false
  ; false true
  true
  )

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
