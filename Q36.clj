;; 4Clojure Question 36
;;
;; Can you bind x, y, and z so that these are all true?
;;
;; Use M-x 4clojure-check-answers when you're done!

(= 10 (let [x 5 y 5] (+ x y)))

(= 4 (let [y 4 z 0] (+ y z)))

(= 1 (let [z 1] z))
