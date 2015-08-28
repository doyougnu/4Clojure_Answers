;; 4Clojure Question 75
;;
;; Two numbers are coprime if their greatest common divisor equals 1.  Euler's totient function f(x) is defined as the number of positive integers less than x which are coprime to x.  The special case f(1) equals 1.  Write a function which calculates Euler's totient function.
;;
;; Use M-x 4clojure-check-answers when you're done!

(defn primeFactors
  ([n] (prime-factors n 2))
  ([n candidate]
     (cond (<= n 1) ()
           (zero? (rem n candidate)) (cons candidate (lazy-seq (prime-factors (/ n candidate)
                                                                              candidate)))
           :else (recur n (inc candidate)))))

(defn inList? [a coll]
  (some #(= a %) coll))

(defn common-elements [x y]
  (let [m (flatten (merge x y))
        n (group-by identity m)
        o (filter #(not= 1 (count (last %))) n)]
    (rest (flatten o))))

(defn gcd [x y]
  (let [xpf (primeFactors x)
        ypf (primeFactors y)]
    (reduce * (common-elements xpf ypf))))

(defn gcd2 [n m];;why do list manipulation that isn't well supported when good old euclid will do
  (let [quotient (quot n m)
        remain (mod n m)]
    (cond
     (= 0 remain) m
     :else (recur m remain))))

(defn totient [n]
  (for [x (range 1 n)
        :while (= 1 (gcd2 x n))]
    x))

(= (__ 1) 1)

(= (__ 10) (count '(1 3 7 9)) 4)

(= (__ 40) 16)

(= (__ 99) 60)
