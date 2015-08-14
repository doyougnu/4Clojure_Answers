;; 4Clojure Question 31
;;
;; Write a function which packs consecutive duplicates into sub-lists.
;;
;; Use M-x 4clojure-check-answers when you're done!

(defn helper [x]
  (let [coll (partition-by identity x)]
    (map (fn [a] [(first a) (count a)]) coll)))

(defn pack [coll]
  (let [newColl (helper coll)]
    (map (fn [a] (repeat (second a) (first a))) newColl)))

(= (pack [1 1 2 1 1 1 3 3]) '((1 1) (2) (1 1 1) (3 3)))

(= (pack [:a :a :b :b :c]) '((:a :a) (:b :b) (:c)))

(= (pack [[1 2] [1 2] [3 4]]) '(([1 2] [1 2]) ([3 4])))
