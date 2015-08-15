;; 4Clojure Question 43
;;
;; Write a function which reverses the interleave process into x number of subsequences.
;;
;; Use M-x 4clojure-check-answers when you're done!

(defn revInter [coll x]
  (apply map list (partition x (coll))))
;Apply calls Map, which constructs a list, on each subcollection
;This only works because map can take a variable number of lists

(= (revInter [1 2 3 4 5 6] 2) '((1 3 5) (2 4 6)))

(= (revInter (range 9) 3) '((0 3 6) (1 4 7) (2 5 8)))

(= (revInter (range 10) 5) '((0 5) (1 6) (2 7) (3 8) (4 9)))
