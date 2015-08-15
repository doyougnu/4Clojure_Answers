;; 4Clojure Question 49
;;
;; Write a function which will split a sequence into two parts.
;;
;; Restrictions (please don't use these function(s)): split-at
;;
;; Use M-x 4clojure-check-answers when you're done!

(defn mySplitat [x coll]
  (mapv #(into [] %) [(take x coll) (drop x coll)]))

(= (mySplitat 3 [1 2 3 4 5 6]) [[1 2 3] [4 5 6]])

(= (mySplitat 1 [:a :b :c :d]) [[:a] [:b :c :d]])

(= (mySplitat 2 [[1 2] [3 4] [5 6]]) [[[1 2] [3 4]] [[5 6]]])
