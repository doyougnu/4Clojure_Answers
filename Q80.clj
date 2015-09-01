;; 4Clojure Question 80
;;
;; A number is "perfect" if the sum of its divisors equal the number itself.  6 is a perfect number because 1+2+3=6.  Write a function which returns true for perfect numbers and false otherwise.
;;
;; Use M-x 4clojure-check-answers when you're done!

(defn perfects [n]
  (let [x (range 1 n)
        factors (filter #(zero? (mod n %)) x)
        factsum (reduce + factors)]
    (= n factsum)))

(defn perfect2 [n];;noticed this could be done more cleanly
  (->> n
   (range 1)
   (filter #(zero? (mod n %)))
   (reduce +)
   (= n)))

(= (perfect2 6) true)

(= (perfect2 7) false)

(= (perfect2 496) true)

(= (perfect2 500) false)

(= (perfect2 8128) true)
