;; 4Clojure Question 69
;;
;; Write a function which takes a function f and a variable number of maps.  Your function should return a map that consists of the rest of the maps conj-ed onto the first.  If a key occurs in more than one map, the mapping(s) from the latter (left-to-right) should be combined with the mapping in the result by calling (f val-in-result val-in-latter)
;;
;; Restrictions (please don't use these function(s)): merge-with
;;
;; Use M-x 4clojure-check-answers when you're done!

(defn myMergeWith [f & maps]
  (reduce
   (fn [x y]
     (reduce
      (fn [m [k v]]
        (assoc m k (if (y k)
                     (f v (y k))
                     v)))
      y x))
   (first maps) (rest maps)));;github user hyones solution, I got stuck with the decomposition. decomposition makes this problem much easier

(= (myMergeWith * {:a 2, :b 3, :c 4} {:a 2} {:b 2} {:c 5})
   {:a 4, :b 6, :c 20})

(= (myMergeWith - {1 10, 2 20} {1 3, 2 10, 3 15})
   {1 7, 2 10, 3 15})

(= (myMergeWith concat {:a [3], :b [6]} {:a [4 5], :c [8 9]} {:b [7]})
   {:a [3 4 5], :b [6 7], :c [8 9]})
