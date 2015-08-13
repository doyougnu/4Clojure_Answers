;; 4Clojure Question 23
;;
;; Write a function which reverses a sequence.
;;
;; Restrictions (please don't use these function(s)): reverse, rseq
;;
;; Use M-x 4clojure-check-answers when you're done!

(defn myReverse [x]
  (case x
    [] []
    (conj (myReverse (rest x)) (first x))))

(= (myReverse [1 2 3 4 5]) [5 4 3 2 1])

(= (myReverse (sorted-set 5 7 2 7)) '(7 5 2))

(= (myReverse [[1 2][3 4][5 6]]) [[5 6][3 4][1 2]])
