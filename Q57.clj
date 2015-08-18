;; 4Clojure Question 57
;;
;; A recursive function is a function which calls itself.  This is one of the fundamental techniques used in functional programming.
;;
;; Use M-x 4clojure-check-answers when you're done!

(= [5 4 3 2 1] ((fn foo [x] (when (> x 0) (conj (foo (dec x)) x))) 5))
