;; 4Clojure Question 77
;;
;; Write a function which finds all the anagrams in a vector of words.  A word x is an anagram of word y if all the letters in x can be rearranged in a different order to form y.  Your function should return a set of sets, where each sub-set is a group of words which are anagrams of each other.  Each sub-set should have at least two words.  Words without any anagrams should not be included in the result.
;;
;; Use M-x 4clojure-check-answers when you're done!

(defn toCharArray [s]
  (seq (char-array s)))

(defn toString [ca]
  (apply str ca))

(defn anagramList [word]
  (distinct (take 100 (iterate shuffle word))))

(defn anagrams [coll]
  (let [coll (set (map #(set toCharArray %) coll))
        collset (into #{} coll)
        anagramset (into #{} (map #(anagramList %) coll))]
    (print collset)))

(= (__ ["meat" "mat" "team" "mate" "eat"])
   #{#{"meat" "team" "mate"}})

(= (__ ["veer" "lake" "item" "kale" "mite" "ever"])
   #{#{"veer" "ever"} #{"lake" "kale"} #{"mite" "item"}})
