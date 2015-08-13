;; 4Clojure Question 22
;;
;; Write a function which returns the total number of elements in a sequence.
;;
;; Restrictions (please don't use these function(s)): count
;;
;; Use M-x 4clojure-check-answers when you're done!

(defn myCount [li]
  (case li
    [] 0
    (+ 1 (myCount (rest li)))))

(= (myCount '(1 2 3 3 1)) 5)

(= (myCount "Hello World") 11)

(= (myCount [[1 2] [3 4] [5 6]]) 3)

(= (myCount '(13)) 1)

(= (myCount '(:a :b :c)) 3)
