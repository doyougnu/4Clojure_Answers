;; 4Clojure Question 38
;;
;; Write a function which takes a variable number of parameters and returns the maximum value.
;;
;; Restrictions (please don't use these function(s)): max, max-key
;;
;; Use M-x 4clojure-check-answers when you're done!

(defn myMax [x & xs]
  (last (sort (cons x xs))))

(= (myMax 1 8 3 4) 8)

(= (myMax 30 20) 30)

(= (myMax 45 67 11) 67)
