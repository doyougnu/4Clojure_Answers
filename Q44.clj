;; 4Clojure Question 44
;;
;; Write a function which can rotate a sequence in either direction.
;;
;; Use M-x 4clojure-check-answers when you're done!

(defn myRot [x coll]
  (if (neg? x)
    (let [y (+ x (count coll))]
      (myRot y coll))
    (concat (drop x coll) (take x coll))))

(= (myRot 2 [1 2 3 4 5]) '(3 4 5 1 2))

(= (myRot -2 [1 2 3 4 5]) '(4 5 1 2 3))

(= (myRot 6 [1 2 3 4 5]) '(2 3 4 5 1))

(= (myRot 1 '(:a :b :c)) '(:b :c :a))

(= (myRot -4 '(:a :b :c)) '(:c :a :b))
