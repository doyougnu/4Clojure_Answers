;; 4Clojure Question 75
;;
;; Two numbers are coprime if their greatest common divisor equals 1.  Euler's totient function f(x) is defined as the number of positive integers less than x which are coprime to x.  The special case f(1) equals 1.  Write a function which calculates Euler's totient function.
;;
;; Use M-x 4clojure-check-answers when you're done!

(defn factors [x]
  (filter #(zero? (mod x %)) (range 1 (+ 1 x))))

(defn isPrime? [n]
  (= 2 (count (factors n))))

(defn primeFactors [n]
  (filter isPrime? (factors n)))


(defn common-elements [& colls];;need to fix this fucntion to allow duplicates from each list. I'm thinking get frequencies, add the frequency then multiply the value by summed freq
  (let [freqs (map frequencies colls)]
    (mapcat (fn [e] (repeat (apply min (map #(% e) freqs)) e))
            (apply clojure.set/intersection (map (comp set keys) freqs)))))

(defn gcd [x y]
  (let [xpf (primeFactors x)
        ypf (primeFactors y)]
    (reduce * (common-elements xpf ypf))))

(= (__ 1) 1)

(= (__ 10) (count '(1 3 7 9)) 4)

(= (__ 40) 16)

(= (__ 99) 60)
