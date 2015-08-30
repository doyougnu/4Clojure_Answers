;; 4Clojure Question 77
;;
;; Write a function which finds all the anagrams in a vector of words.  A word x is an anagram of word y if all the letters in x can be rearranged in a different order to form y.  Your function should return a set of sets, where each sub-set is a group of words which are anagrams of each other.  Each sub-set should have at least two words.  Words without any anagrams should not be included in the result.
;;
;; Use M-x 4clojure-check-answers when you're done!

(defn inVector? [elem vect]
  (mapv (fn [subset] some #(= elem %) subset) vect))

(defn intersect-vector [x y]
  (loop [x (seq x) y (seq y) acc []]
    (if (and x y)
      (let [x1 (first x) ]
      (cond
       (inVector? x1 y) (recur (next x) y (conj acc x1))
       :else (recur (next x) y acc)))
    acc)))

(defn toCharArray [s]
  (vec (char-array s)))

(defn toString [ca]
  (apply str ca))

(defn anagramList [word]
  (into [] (take 50 (drop 1 (iterate shuffle word)))))

(defn anagrams [coll]
  (let [colls (mapv toCharArray coll)
        anagrams (mapv #(anagramList %) colls)]
   (intersect-vector colls anagrams)))

;;;after much struggling with trying to generate an anagram list, then functionally match the anagrams, yyhh's solution is much cheaper and elegant focusing on distribution of characters insead.

(defn anagrams2 [coll]
  (->> (group-by frequencies coll)
       (vals)
       (filter #(> (count %) 1))
       (map set)
       set))


(= (anagrams2 ["meat" "mat" "team" "mate" "eat"])
   #{#{"meat" "team" "mate"}})

(= (anagrams2 ["veer" "lake" "item" "kale" "mite" "ever"])
   #{#{"veer" "ever"} #{"lake" "kale"} #{"mite" "item"}})
