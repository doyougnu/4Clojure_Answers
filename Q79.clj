;; 4Clojure Question 79
;;
;; Write a function which calculates the sum of the minimal path through a triangle.  The triangle is represented as a collection of vectors.  The path should start at the top of the triangle and move to an adjacent number on the next row until the bottom of the triangle is reached.
;;
;; Use M-x 4clojure-check-answers when you're done!

(defn branch [s];;the key was enumerating all possible branches, once that is solved the rest was
  (let [i (last s)];;easy, I took this function from John Madisons youtube video on this problem
    [(conj s i) (conj s (inc i))]));; then solved the rest myself

(defn enumBranches [n]
  (last (take n (iterate #(mapcat branch %) [[0]]))))

(defn branchValues [triangle]
  (let [i (count triangle)]
    (map  #(map (fn [tri-level index] (nth tri-level index)) triangle %) (enumBranches i))))

(defn findMinPath [triangle]
  (apply min (map #(reduce + %) (branchValues triangle))))

(= 7 (findMinPath '([1]
          [2 4]
         [5 1 4]
        [2 3 4 5]))) ; 1->2->1->3

(= 20 (findMinPath '([3]
           [2 4]
          [1 9 3]
         [9 9 2 4]
        [4 6 6 7 8]
       [5 7 3 5 1 4]))) ; 3->4->3->2->7->1
