;; 4Clojure Question 79
;;
;; Write a function which calculates the sum of the minimal path through a triangle.  The triangle is represented as a collection of vectors.  The path should start at the top of the triangle and move to an adjacent number on the next row until the bottom of the triangle is reached.
;;
;; Use M-x 4clojure-check-answers when you're done!

(defn adjacents [vect]
  (mapv (fn [v] (let [minelem (apply min v)
                     minindex (.indexOf v minelem)]
                 [minindex (+ minindex 1)])) vect))

(defn adjacentValues [vect adjvect]
  (let [top (first vect)
        val1 (mapv first (rest adjvect))
        val2 (mapv last (rest adjvect))
        valvec1 (mapv #(nth (rest vect) %) val1)
        valvec2 (mapv #(nth (rest vect) %) val2)]
    valvec2))

(defn walkTri [vect])

(= 7 (__ '([1]
          [2 4]
         [5 1 4]
        [2 3 4 5]))) ; 1->2->1->3

(= 20 (__ '([3]
           [2 4]
          [1 9 3]
         [9 9 2 4]
        [4 6 6 7 8]
       [5 7 3 5 1 4]))) ; 3->4->3->2->7->1
