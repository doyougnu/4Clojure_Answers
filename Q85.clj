;; 4Clojure Question 85
;;
;; Write a function which generates the <a href="http://en.wikipedia.org/wiki/Power_set">power set</a> of a given set.  The power set of a set x is the set of all subsets of x, including the empty set and x itself.
;;
;; Use M-x 4clojure-check-answers when you're done!

(defn genPower [coll]
  (reduce
   (fn [acc x] (set (concat (map #(conj % x) acc) acc)));;take pred, map over accumulator, conj acc and next element, return both original accumulator, and conj'd acc, then rinse and repeat to enumerate
   #{#{}}
   coll))

(= (genPower #{1 :a}) #{#{1 :a} #{:a} #{} #{1}})

(= (genPower #{}) #{#{}})

(= (genPower #{1 2 3})
   #{#{} #{1} #{2} #{3} #{1 2} #{1 3} #{2 3} #{1 2 3}})

(= (count (genPower (into #{} (range 10)))) 1024)
