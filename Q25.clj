;; 4Clojure Question 25
;;
;; Write a function which returns only the odd numbers from a sequence.
;;
;; Use M-x 4clojure-check-answers when you're done!

(defn onlyOdd [x]
  (filter odd? x))

(= (onlyOdd #{1 2 3 4 5}) '(1 3 5))

(= (onlyOdd [4 2 1 6]) '(1))

(= (onlyOdd [2 2 4 6]) '())

(= (onlyOdd [1 1 1 3]) '(1 1 1 3))
