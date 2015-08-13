;; 4Clojure Question 28
;;
;; Write a function which flattens a sequence.
;;
;; Restrictions (please don't use these function(s)): flatten
;;
;; Use M-x 4clojure-check-answers when you're done!

(defn myFlat [coll]
  (let [x (first coll)
        y (next coll)]
    (concat
     (if (sequential? x)
       (myFlat x)
       [x])
     (when (sequential? y)
       (myFlat y)))))

(= (myFlat '((1 2) 3 [4 [5 6]])) '(1 2 3 4 5 6))

(= (myFlat ["a" ["b"] "c"]) '("a" "b" "c"))

(= (myFlat '((((:a))))) '(:a))
