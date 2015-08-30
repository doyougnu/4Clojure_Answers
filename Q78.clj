;; 4Clojure Question 78
;;
;; Reimplement the function described in <a href="76"> "Intro to Trampoline"</a>.
;;
;; Restrictions (please don't use these function(s)): trampoline
;;
;; Use M-x 4clojure-check-answers when you're done!

(defn myTramp ;;based on trampolines doc
  ([f & args] (myTramp #(apply f args)));;need to return a func
  ([f] (let [returnfunc (f)]
         (if (clojure.test/function? returnfunc)
           (recur returnfunc)
           returnfunc))))

(= (letfn [(triple [x] #(sub-two (* 3 x)))
          (sub-two [x] #(stop?(- x 2)))
          (stop? [x] (if (> x 50) x #(triple x)))]
    (myTramp triple 2))
  82)

(= (letfn [(my-even? [x] (if (zero? x) true #(my-odd? (dec x))))
          (my-odd? [x] (if (zero? x) false #(my-even? (dec x))))]
    (map (partial myTramp my-even?) (range 6)))
  [true false true false true false])
