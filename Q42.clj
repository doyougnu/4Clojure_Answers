;; 4Clojure Question 42
;;
;; Write a function which calculates factorials.
;;
;; Use M-x 4clojure-check-answers when you're done!

(defn myFact [n]
  (reduce * (range 1 (+ 1 n)))) ;;simple one liner, but susceptible to stack overflow, need recur

(= (__ 1) 1)

(= (__ 3) 6)

(= (__ 5) 120)

(= (__ 8) 40320)
