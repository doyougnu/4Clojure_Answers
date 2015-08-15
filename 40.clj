;; 4Clojure Question 40
;;
;; Write a function which separates the items of a sequence by an arbitrary value.
;;
;; Restrictions (please don't use these function(s)): interpose
;;
;; Use M-x 4clojure-check-answers when you're done!

(defn myInterpose [x y & result]
  (let [a (vector (first y) x)]
    (if (empty? y)
      (vec (rest (reverse result)))
      (recur x (rest y) (flatten (cons a result))))))

(= (myInterpose 0 [1 2 3]) [1 0 2 0 3])

(= (apply str (myInterpose ", " ["one" "two" "three"])) "one, two, three")

(= (myInterpose :z [:a :b :c :d]) [:a :z :b :z :c :z :d])
