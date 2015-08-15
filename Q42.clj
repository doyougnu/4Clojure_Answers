;; 4Clojure Question 42
;;
;; Write a function which calculates factorials.
;;
;; Use M-x 4clojure-check-answers when you're done!

(defn myFact [n]
  (reduce * (range 1 (+ 1 n)))) ;;simple one liner, but susceptible to stack overflow, need recur

(= (myFact 1) 1)

(= (myFact 3) 6)

(= (myFact 5) 120)

(= (myFact 8) 40320)
