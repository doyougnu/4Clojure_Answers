;; 4Clojure Question 34
;;
;; Write a function which creates a list of all integers in a given range.
;;
;; Restrictions (please don't use these function(s)): range
;;
;; Use M-x 4clojure-check-answers when you're done!

(defn myRange [a b]
  (take b (iterate inc a)))

(= (myRange 1 4) '(1 2 3))

(= (myRange -2 2) '(-2 -1 0 1))

(= (myRange 5 8) '(5 6 7))
