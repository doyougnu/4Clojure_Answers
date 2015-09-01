;; 4Clojure Question 80
;;
;; A number is "perfect" if the sum of its divisors equal the number itself.  6 is a perfect number because 1+2+3=6.  Write a function which returns true for perfect numbers and false otherwise.
;;
;; Use M-x 4clojure-check-answers when you're done!

(defn perfects [n]
  (let [x (range 1 n)
        factors (filter #(zero? (mod n %)) x)
        factsum (reduce + factors)]
    (if (= n factsum) true false)))

(= (perfects 6) true)

(= (perfects 7) false)

(= (perfects 496) true)

(= (perfects 500) false)

(= (perfects 8128) true)
