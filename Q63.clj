;; 4Clojure Question 63
;;
;; Given a function f and a sequence s, write a function which returns a map.  The keys should be the values of f applied to each item in s.  The value at each key should be a vector of corresponding items in the order they appear in s.
;;
;; Restrictions (please don't use these function(s)): group-by
;;
;; Use M-x 4clojure-check-answers when you're done!

(defn zipWithDup [a b]
  (apply merge-with concat (map (fn [x y] {x (list y)}) a b)))

(defn myGroup [f coll]
  (zipWithDup (map (fn [a] (f a)) coll) coll))

(= (myGroup #(> % 5) [1 3 6 8]) {false [1 3], true [6 8]})

(= (myGroup #(apply / %) [[1 2] [2 4] [4 6] [3 6]])
   {1/2 [[1 2] [2 4] [3 6]], 2/3 [[4 6]]})

(= (myGroup count [[1] [1 2] [3] [1 2 3] [2 3]])
   {1 [[1] [3]], 2 [[1 2] [2 3]], 3 [[1 2 3]]})
