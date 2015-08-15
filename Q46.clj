;; 4Clojure Question 46
;;
;; Write a higher-order function which flips the order of the arguments of an input function.
;;
;; Use M-x 4clojure-check-answers when you're done!

(defn flip [f]
  (fn [& args]
    (apply f (reverse args))))

(= 3 ((flip nth) 2 [1 2 3 4 5]))

(= true ((flip >) 7 8))

(= 4 ((flip quot) 2 8))

(= [1 2 3] ((flip take) [1 2 3 4 5] 3))
