;; 4Clojure Question 65
;;
;; Clojure has many sequence types, which act in subtly different ways. The core functions typically convert them into a uniform "sequence" type and work with them that way, but it can be important to understand the behavioral and performance differences so that you know which kind is appropriate for your application.<br /><br />Write a function which takes a collection and returns one of :map, :set, :list, or :vector - describing the type of collection it was given.<br />You won't be allowed to inspect their class or use the built-in predicates like list? - the point is to poke at them and understand their behavior.
;;
;; Restrictions (please don't use these function(s)): class, type, Class, vector?, sequential?, list?, seq?, map?, set?, instance?, getClass
;;
;; Use M-x 4clojure-check-answers when you're done!

 (defn objCheck [coll]
  (let [x (rand-int 100)
        y (rand-int 100)
        p [x y]
        c (conj coll p)]
    (cond
      (= y (get c x)) :map
      (= p (get c p)) :set
      (= x (last (conj c x))) :vector
      :else :list)))

(= :map (objCheck {:a 1, :b 2}))

(= :list (objCheck (range (rand-int 20))))

(= :vector (objCheck [1 2 3 4 5 6]))

(= :set (objCheck #{10 (rand-int 5)}))

(= [:map :set :vector :list] (map objCheck [{} #{} [] ()]))
