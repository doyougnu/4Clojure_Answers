;; 4Clojure Question 56
;;
;; Write a function which removes the duplicates from a sequence. Order of the items must be maintained.
;;
;; Restrictions (please don't use these function(s)): distinct
;;
;; Use M-x 4clojure-check-answers when you're done!

(defn myDistinct [coll]
  (map first (partition-by identity (sort coll))))

(= (myDistinct [1 2 1 3 1 2 4]) [1 2 3 4])

(= (myDistinct [:a :a :b :b :c :c]) [:a :b :c])

(= (myDistinct '([2 4] [1 2] [1 3] [1 3])) '([2 4] [1 2] [1 3]))

(= (myDistinct (range 50)) (range 50))
