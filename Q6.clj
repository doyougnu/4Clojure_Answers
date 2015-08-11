;; 4Clojure Question 6
;;
;; Vectors can be constructed several ways.  You can compare them with lists.
;;
;; Use M-x 4clojure-check-answers when you're done!

(= [:a :b :c] (list :a :b :c) (vec '(:a :b :c)) (vector :a :b :c))
