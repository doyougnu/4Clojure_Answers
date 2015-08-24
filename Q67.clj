;; 4Clojure Question 67
;;
;; Write a function which returns the first x
;;
;; number of prime numbers.
;;
;; Use M-x 4clojure-check-answers when you're done!

(defn sieve;; First attempt, this can be done better
  ([x] (sieve x (range 2 1000) (list)))
  ([x p acc]
   (lazy-seq
    (let [y (first p)
          divisible? (fn [e w] (zero? (mod e w)))
          helper (fn [a] (divisible? a y))
          check (some true? (map helper p))
          newList (filter (complement helper) p)]
      (if check
        (sieve x newList (reverse (conj acc y))
               (take x acc)))))))

(defn sieveTwo [x]
  (cons (first x)
        (lazy-seq
         (sieveTwo (filter (fn [a] (not= 0 (mod a (first x)))) (rest x))))))

(defn sieveHelper [x]
  (take x (sieveTwo (iterate inc 2))))

(= (__ 2) [2 3])

(= (__ 5) [2 3 5 7 11])

(= (last (__ 100)) 541)
