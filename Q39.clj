;; 4Clojure Question 39
;;
;; Write a function which takes two sequences and returns the first item from each, then the second item from each, then the third, etc.
;;
;; Restrictions (please don't use these function(s)): interleave
;;
;; Use M-x 4clojure-check-answers when you're done!

(defn myInter [x y & result]
  (let [a (list (first x) (first y))]
    (if (or (empty? x) (empty? y))
      (rest result) ;;rest to get rid of nil from initializing result
      (recur (rest x) (rest y) (flatten (conj a result))))))

(= (myInter [1 2 3] [:a :b :c]) '(1 :a 2 :b 3 :c))

(= (myInter [1 2] [3 4 5 6]) '(1 3 2 4))

(= (myInter [1 2 3 4] [5]) [1 5])

(= (myInter [30 20] [25 15]) [30 25 20 15])
