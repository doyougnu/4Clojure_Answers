;; 4Clojure Question 30
;;
;; Write a function which removes consecutive duplicates from a sequence.
;;
;; Use M-x 4clojure-check-answers when you're done!

(defn remDups [coll]
  (map first (partition-by identity coll)))

(= (apply str (remDups "Leeeeeerrroyyy")) "Leroy")

(= (remDups [1 1 2 3 3 2 2 3]) '(1 2 3 2 3))

(= (remDups [[1 2] [1 2] [3 4] [1 2]]) '([1 2] [3 4] [1 2]))
