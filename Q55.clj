;; 4Clojure Question 55
;;
;; Write a function which returns a map containing the number of occurences of each distinct item in a sequence.
;;
;; Restrictions (please don't use these function(s)): frequencies
;;
;; Use M-x 4clojure-check-answers when you're done!

(defn myFreq [coll]
  (apply array-map (mapcat (fn [x] (reverse (conj (distinct x) (count x)))) (partition-by identity (sort coll)))))

(= (myFreq [1 1 2 3 2 1 1]) {1 4, 2 2, 3 1})

(= (myFreq [:b :a :b :a :b]) {:a 2, :b 3})

(= (myFreq '([1 2] [1 3] [1 3])) {[1 2] 1, [1 3] 2})
