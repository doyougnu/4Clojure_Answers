;; 4Clojure Question 58
;;
;; Write a function which allows you to create function compositions.  The parameter list should take a variable number of functions, and create a function that applies them from right-to-left.
;;
;; Restrictions (please don't use these function(s)): comp
;;
;; Use M-x 4clojure-check-answers when you're done!


;;just take a list of funcs, list of args, and reduce with an acuumulator equal to
;;the first func applied to the args
(defn myComp [& fns]
  (fn [& args] (reduce (fn [result func] (func result))
                      (apply (last fns) args)
                      (rest (reverse fns)))))

(= [3 2 1] ((myComp rest reverse) [1 2 3 4]))

(= 5 ((myComp (partial + 3) second) [1 2 3 4]))

(= true ((myComp zero? #(mod % 8) +) 3 5 7 9))

(= "HELLO" ((myComp #(.toUpperCase %) #(apply str %) take) 5 "hello world"))
