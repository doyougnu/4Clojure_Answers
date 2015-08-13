;; 4Clojure Question 24
;;
;; Write a function which returns the sum of a sequence of numbers.
;;
;; Use M-x 4clojure-check-answers when you're done!

(defn mySum [x]
  (reduce + x))

(= (mySum [1 2 3]) 6)

(= (mySum (list 0 -2 5 5)) 8)

(= (mySum #{4 2 1}) 7)

(= (mySum '(0 0 -1)) -1)

(= (mySum '(1 10 3)) 14)
