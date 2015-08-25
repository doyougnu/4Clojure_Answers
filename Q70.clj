;; 4Clojure Question 70
;;
;; Write a function that splits a sentence up into a sorted list of words.  Capitalization should not affect sort order and punctuation should be ignored.
;;
;; Use M-x 4clojure-check-answers when you're done!

(defn strSplit [x];; I typically try to avoid regex here, or keep it minimal. THis question demands it though, this is my first attempt. Second attempt below after researching regex and clojure regex
  (let [a (partition-by (partial = \space) (clojure.string/replace x #"\.|!" ""))
        b (filter #(not= (first %) \space) a)]
    (into [] (map clojure.string/join (sort-by #(clojure.string/lower-case (first %)) b)))))

(defn strSplit2 [x]
  (sort-by (fn [v](.toLowerCase v))  (re-seq #"\w+" x)))

(= (strSplit2 "Have a nice day.")
   ["a" "day" "Have" "nice"])

(= (strSplit2 "Clojure is a fun language!")
   ["a" "Clojure" "fun" "is" "language"])

(= (strSplit2 "Fools fall for foolish follies.")
   ["fall" "follies" "foolish" "Fools" "for"])
