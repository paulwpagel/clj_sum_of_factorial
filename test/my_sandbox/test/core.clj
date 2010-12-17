(ns my-sandbox.test.core
  (:use [my-sandbox.core] :reload)
  (:use [clojure.test]))

(deftest factorial_of_1
  (is (= 1 (factorial 1))))

(deftest factorial_of_2
  (is (= 2 (factorial 2))))

(deftest factorial_of_3
  (is (= 6 (factorial 3))))

(deftest factorial_of_5
  (is (= 120 (factorial 5))))

(deftest my_stringify_test
	(is (= "120" (stringify 120))))

(deftest my_intify
	(is (= 1 (intify "1")))   )	

(deftest sum_of_chars1
	(is (= 3 (sum_of_chars "120") )))

;(deftest split_into_digits_123
;	(is (= [1 2 3] (split-nums 123))))

;(deftest split_into_digits_987654321
;	(is ( [9 8 7 6 5 4 3 2 1] (split-nums 987654321, 1))))

;(deftest sum_of_factorial_1
;	(is 1 (sum_of_factorial 1)))
;
;(deftest sum_of_factorial_2
;	(is 2 (sum_of_factorial 2)))
;
;(deftest sum_of_factorial_5
;	(is 3 (sum_of_factorial 5)))
