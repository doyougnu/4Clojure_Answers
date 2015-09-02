;; 4Clojure Question 81
;;
;; Write a function which returns the intersection of two sets.  The intersection is the sub-set of items that each set has in common.
;;
;; Restrictions (please don't use these function(s)): intersection
;;
;; Use M-x 4clojure-check-answers when you're done!

(defn myIntersect [s1 s2]
  (letfn [(inset? [a] (some #(= % a) s2))]
    (set (filter inset? s1))))

(= (myIntersect #{0 1 2 3} #{2 3 4 5}) #{2 3})

(= (myIntersect #{0 1 2} #{3 4 5}) #{})

(= (myIntersect #{:a :b :c :d} #{:c :e :a :f :d}) #{:a :c :d})
