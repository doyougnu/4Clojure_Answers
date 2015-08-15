;; 4Clojure Question 52
;;
;; Let bindings and function parameter lists support destructuring.
;;
;; Use M-x 4clojure-check-answers when you're done!

(= [2 4] (let [[a b c d e f g] (range)] [c e]))
