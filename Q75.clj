;; 4Clojure Question 75
;;
;; Two numbers are coprime if their greatest common divisor equals 1.  Euler's totient function f(x) is defined as the number of positive integers less than x which are coprime to x.  The special case f(1) equals 1.  Write a function which calculates Euler's totient function.
;;
;; Use M-x 4clojure-check-answers when you're done!

(defn factors [x]
  (filter #(zero? (mod x %)) (range 1 (+ 1 x))))

(defn isPrime? [n]
  (= 2 (count (factors n))))

(defn primeFactors [n] ;;need to fix primeFaactors to fully factor all factors
  (filter isPrime? (map factors (factors n))))

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
    (reduce * (common-elemen  ts xpf ypf))))

(= (__ 1) 1)

(= (__ 10) (count '(1 3 7 9)) 4)

(= (__ 40) 16)

(= (__ 99) 60)
