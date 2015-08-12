;; 4Clojure Question 16
;;
;; Write a function which returns a personalized greeting.
;;
;; Use M-x 4clojure-check-answers when you're done!

(defn greet [x]
  (str "Hello, " x "!"))

(= (greet "Dave") "Hello, Dave!")

(= (greet "Jenn") "Hello, Jenn!")

(= (greet "Rhea") "Hello, Rhea!")
