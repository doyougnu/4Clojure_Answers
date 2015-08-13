;; 4Clojure Question 26
;;
;; Write a function which returns the first X fibonacci numbers.
;;
;; Use M-x 4clojure-check-answers when you're done!

(defn fib [a b]
  (cons a (lazy-seq (fib b (+ a b)))))

(defn take-fib [n]
  (take n (fib 1 1)))

(= (take-fib 3) '(1 1 2));;pretty sure fib seq started at 0

(= (take-fib 6) '(1 1 2 3 5 8))

(= (take-fib 8) '(1 1 2 3 5 8 13 21))
