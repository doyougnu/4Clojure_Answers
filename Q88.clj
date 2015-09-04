;; 4Clojure Question 88
;;
;; Write a function which returns the symmetric difference of two sets.  The symmetric difference is the set of items belonging to one but not both of the two sets.
;;
;; Use M-x 4clojure-check-answers when you're done!

(defn inList? [elem coll]
  (some #(= elem %) coll))

(defn notInList? [elem coll]
  ((complement inList?) elem coll))

(defn noInter [s1 s2]
  (let [inter (clojure.set/intersection s1 s2)
        s12 (into #{} (concat s1 s2))]
    (set (filter #(notInList? % inter) s12))))

(= (noInter #{1 2 3 4 5 6} #{1 3 5 7}) #{2 4 6 7})

(= (noInter #{:a :b :c} #{}) #{:a :b :c})

(= (noInter #{} #{4 5 6}) #{4 5 6})

(= (noInter #{[1 2] [2 3]} #{[2 3] [3 4]}) #{[1 2] [3 4]})
