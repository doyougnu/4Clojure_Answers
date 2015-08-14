;; 4Clojure Question 32
;;
;; Write a function which duplicates each element of a sequence.
;;
;; Use M-x 4clojure-check-answers when you're done!

(defn elemDup [x]
  (mapcat (fn [a] [a a]) x))

(= (elemDup [1 2 3]) '(1 1 2 2 3 3))

(= (elemDup [:a :a :b :b]) '(:a :a :a :a :b :b :b :b))

(= (elemDup [[1 2] [3 4]]) '([1 2] [1 2] [3 4] [3 4]))

(= (elemDup [[1 2] [3 4]]) '([1 2] [1 2] [3 4] [3 4]))
