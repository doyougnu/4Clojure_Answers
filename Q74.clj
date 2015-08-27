;; 4Clojure Question 74
;;
;; Given a string of comma separated integers, write a function which returns a new comma separated string that only contains the numbers which are perfect squares.
;;
;; Use M-x 4clojure-check-answers when you're done!

(defn isPerfect? [n]
  (let [a (Math/sqrt n)]
    (integer? (rationalize a))))

(defn filPerfectSquares [coll]
  (let [numcoll (map read-string
                     (clojure.string/split coll #","))]
    (clojure.string/join "," (filter isPerfect? numcoll))))

(= (filPerfectSquares "4,5,6,7,8,9") "4,9")

(= (filPerfectSquares "15,16,25,36,37") "16,25,36")
