;; 4Clojure Question 29
;;
;; Write a function which takes a string and returns a new string containing only the capital letters.
;;
;; Use M-x 4clojure-check-answers when you're done!

(defn filUpper [x]
  (apply str (filter #(Character/isUpperCase %) x)))

(= (filUpper "HeLlO, WoRlD!") "HLOWRD")

(empty? (filUpper "nothing"))

(= (filUpper "$#A(*&987Zf") "AZ")
