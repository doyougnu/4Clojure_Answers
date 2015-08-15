;; 4Clojure Question 41
;;
;; Write a function which drops every Nth item from a sequence.
;;
;; Use M-x 4clojure-check-answers when you're done!

(defn myDrop [coll x]
  (when (not (empty? coll))
    (lazy-cat (take (- x 1) coll) (myDrop (drop x coll) x))))

(= (myDrop [1 2 3 4 5 6 7 8] 3) [1 2 4 5 7 8])

(= (myDrop [:a :b :c :d :e :f] 2) [:a :c :e])

(= (myDrop [1 2 3 4 5 6] 4) [1 2 3 5 6])
