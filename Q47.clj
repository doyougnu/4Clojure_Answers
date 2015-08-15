;; 4Clojure Question 47
;;
;; The contains? function checks if a KEY is present in a given collection.  This often leads beginner clojurians to use it incorrectly with numerically indexed collections like vectors and lists.
;;
;; Use M-x 4clojure-check-answers when you're done!

(contains? #{4 5 6} 4)

(contains? [1 1 1 1 1] 1)

(contains? {4 :a 2 :b} 4)

(not (contains? [1 2 4] 3))
