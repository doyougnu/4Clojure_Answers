;; 4Clojure Question 54
;;
;; Write a function which returns a sequence of lists of x items each.  Lists of less than x items should not be returned.
;;
;; Restrictions (please don't use these function(s)): partition, partition-all
;;
;; Use M-x 4clojure-check-answers when you're done!

(defn myPart
  ([n coll] (myPart n coll (list)))
  ([n coll result]
   (if (seq coll)
     (if (<= n (count coll))
       (recur n (drop n coll) (conj result (take n coll)))
       (reverse result))
     (reverse result))));;second result for second if

(= (myPart 3 (range 9)) '((0 1 2) (3 4 5) (6 7 8)))

(= (myPart 2 (range 8)) '((0 1) (2 3) (4 5) (6 7)))

(= (myPart 3 (range 8)) '((0 1 2) (3 4 5)))
