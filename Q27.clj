;; 4Clojure Question 27
;;
;; Write a function which returns true if the given sequence is a palindrome.<br/><br>
;;
;; Hint: "racecar" does not equal '(\r \a \c \e \c \a \r)
;;
;; Use M-x 4clojure-check-answers when you're done!

(defn isPalin? [x]
  (let [y (reverse (reverse x))]
  (= y (reverse y))))

(false? (isPalin? '(1 2 3 4 5)))

(true? (isPalin? "racecar"))

(true? (isPalin? [:foo :bar :foo]))

(true? (isPalin? '(1 1 3 3 1 1)))

(false? (isPalin? '(:a :b :c)))
