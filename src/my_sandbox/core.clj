(ns my-sandbox.core)

(defn factorial [n]
	(if (= n 0)
		1
		(* n (factorial (- n 1)))))

(defn stringify [n]
	(Integer/toString n))

(defn charify [c]
	(Character/toString c))

(defn intify [n]
	(Integer/parseInt (charify n)))

(defn sum_of_chars [sequence]
	(+ (intify (first sequence)) (sum_of_chars (rest sequence))))
	
;(defn sum_of_factorial[n]
;	(sum (stringify (factorial n))))