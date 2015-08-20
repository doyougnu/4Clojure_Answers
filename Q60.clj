;; 4Clojure Question 60
;;
;; Write a function which behaves like reduce, but returns each intermediate value of the reduction.  Your function must accept either two or three arguments, and the return sequence must be lazy.
;;
;; Restrictions (please don't use these function(s)): reductions
;;
;; Use M-x 4clojure-check-answers when you're done!

(defn myReduce
  ([func coll] (myReduce func (first coll) (rest coll)))
  ([func acc coll]
   (println acc)
   (if (seq coll)
     (recur func (func acc (first coll)) (rest coll))
     (lazy-seq acc))))

(= (take 5 (myReduce + (range))) [0 1 3 6 10])

(= (myReduce conj [1] [2 3 4]) [[1] [1 2] [1 2 3] [1 2 3 4]])

(= (last (myReduce * 2 [3 4 5])) (reduce * 2 [3 4 5]) 120)
