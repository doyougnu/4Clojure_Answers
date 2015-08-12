;; 4Clojure Question 20
;;
;; Write a function which returns the second to last element from a sequence.
;;
;; Use M-x 4clojure-check-answers when you're done!

(defn penultimate [x]
  (-> x
      reverse
      second))

(= (penultimate (list 1 2 3 4 5)) 4)

(= (penultimate ["a" "b" "c"]) "b")

(= (penultimate [[1 2] [3 4]]) [1 2])
