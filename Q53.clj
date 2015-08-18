;; 4Clojure Question 53
;;
;; Given a vector of integers, find the longest consecutive sub-sequence of increasing numbers. If two sub-sequences have the same length, use the one that occurs first. An increasing sub-sequence must have a length of 2 or greater to qualify.
;;
;; Use M-x 4clojure-check-answers when you're done!

(defn maxSeq [coll] ;;this solution is unoriginal, it comes from github user leontalbot
  (let [a (partition-by #(< (first %) (last %)) (partition 2 1 coll));; "a" groups partitions of list if element 2 is larger than element a
        b (filter #(< (ffirst %) (second (first %))) a);;b filters the list of lists produced in a if the first first element is less than the second first nest element
        c (reduce #(if (< (count %1) (count %2)) %2 %1) [] b)];;c finds the longest list is the list of lists produced by b
   (concat (first c) (map last (rest c)))));;finally concatenate and remove the generated elements

(= (__ [1 0 1 2 3 0 4 5]) [0 1 2 3])

(= (__ [5 6 1 3 2 7]) [5 6])

(= (__ [2 3 3 4 5]) [3 4 5])

(= (__ [7 6 5 4]) [])
