;; 4Clojure Question 83
;;
;; Write a function which takes a variable number of booleans.  Your function should return true if some of the parameters are true, but not all of the parameters are true.  Otherwise your function should return false.
;;
;; Use M-x 4clojure-check-answers when you're done!

;;this is merely an exclusive or

(defn xor [& coll]
  (if (reduce #(= %1 %2) coll) false true))

(= false (xor false false))

(= true (xor true false))

(= false (xor true))

(= true (xor false true false))

(= false (xor true true true))

(= true (xor true true true false))
