;; 4Clojure Question 21
;;
;; Write a function which returns the Nth element from a sequence.
;;
;; Restrictions (please don't use these function(s)): nth
;;
;; Use M-x 4clojure-check-answers when you're done!

(defn myNth [li n]
  (first (drop n li)))

(= (myNth '(4 5 6 7) 2) 6)

(= (myNth [:a :b :c] 0) :a)

(= (myNth [1 2 3 4] 1) 2)

(= (myNth '([1 2] [3 4] [5 6]) 2) [5 6])
