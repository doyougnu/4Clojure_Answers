;; 4Clojure Question 66
;;
;; Given two integers, write a function which
;;
;; returns the greatest common divisor.
;;
;; Use M-x 4clojure-check-answers when you're done!

(defn factors [n];;simple but expensive solution
  (filter (fn [a] (zero? (rem n a))) (range 1 n)))

(defn comDiv [x y]
  (let [a (factors y)];;don't need to calculate factors for both
    (last (filter (fn [w] (zero? (rem x w))) a))))

(= (comDiv 2 4) 2)

(= (comDiv 10 5) 5)

(= (comDiv 5 7) 1)

(= (comDiv 1023 858) 33)
