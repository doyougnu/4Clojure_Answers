;; 4Clojure Question 19
;;
;; Write a function which returns the last element in a sequence.
;;
;; Restrictions (please don't use these function(s)): last
;;
;; Use M-x 4clojure-check-answers when you're done!

(defn myLast [x]
  (-> x
   reverse
   first))

(= (myLast [1 2 3 4 5]) 5)

(= (myLast '(5 4 3)) 3)

(= (myLast ["b" "c" "d"]) "d")
