;; 4Clojure Question 33
;;
;; Write a function which replicates each element of a sequence a variable number of times.
;;
;; Use M-x 4clojure-check-answers when you're done!

(defn elemDup [x n]
  (mapcat (fn [a] (repeat n a)) x))

(= (elemDup [1 2 3] 2) '(1 1 2 2 3 3))

(= (elemDup [:a :b] 4) '(:a :a :a :a :b :b :b :b))

(= (elemDup [4 5 6] 1) '(4 5 6))

(= (elemDup [[1 2] [3 4]] 2) '([1 2] [1 2] [3 4] [3 4]))

(= (elemDup [44 33] 2) [44 44 33 33])
