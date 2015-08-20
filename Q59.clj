;; 4Clojure Question 59
;;
;; Take a set of functions and return a new function that takes a variable number of arguments and returns a sequence containing the result of applying each function left-to-right to the argument list.
;;
;; Restrictions (please don't use these function(s)): juxt
;;
;; Use M-x 4clojure-check-answers when you're done!

(defn myJuxt [& fns]
  (fn [& args]
    (mapv (fn [func] (apply func args)) fns)))

(= [21 6 1] ((myJuxt + max min) 2 3 5 1 6 4))

(= ["HELLO" 5] ((myJuxt #(.toUpperCase %) count) "hello"))

(= [2 6 4] ((myJuxt :a :c :b) {:a 2, :b 4, :c 6, :d 8 :e 10}))
