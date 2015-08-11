;; 4Clojure Question 8
;;
;; Sets are collections of unique values.
;;
;; Use M-x 4clojure-check-answers when you're done!

(= #{:d :c :b :a} (set '(:a :a :b :c :c :c :c :d :d)))

(= #{:d :c :b :a} (clojure.set/union #{:a :b :c} #{:b :c :d}))
