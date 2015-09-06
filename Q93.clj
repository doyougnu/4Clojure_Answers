;; 4Clojure Question 93
;;
;; Write a function which flattens any nested combination of sequential things (lists, vectors, etc.), but maintains the lowest level sequential items.  The result should be a sequence of sequences with only one level of nesting.
;;
;; Use M-x 4clojure-check-answers when you're done!

(defn myFlat [coll]
  (let [f (first coll)
        r (next coll)
        ff (ffirst coll)]
    (concat ;;this solution is accumulator free due to concat
     (if (and (sequential? f) (not (sequential? ff)))
       [f]
       (myFlat f))
     (when (sequential? r) (myFlat r)))))

(= (myFlat [["Do"] ["Nothing"]])
   [["Do"] ["Nothing"]])

(= (myFlat [[[[:a :b]]] [[:c :d]] [:e :f]])
   [[:a :b] [:c :d] [:e :f]])

(= (myFlat '((1 2)((3 4)((((5 6)))))))
   '((1 2)(3 4)(5 6)))
