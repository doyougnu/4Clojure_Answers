;; 4Clojure Question 90
;;
;; Write a function which calculates the <a href="http://en.wikipedia.org/wiki/Cartesian_product"> Cartesian product</a> of two sets.
;;
;; Use M-x 4clojure-check-answers when you're done!

(defn cartProd
  ([s1 s2] (cartProd s1 s2 []))
  ([s1 s2 acc]
   (let [a (first s2)]
     (if (seq s2)
       (recur s1 (rest s2) (mapv #(conj acc a %) s1))
       acc))))

(defn cartProd2 [s1 s2]
  (let [return []]
    (into #{} (mapcat (fn [a] (map #(conj return a %) s2)) s1))))

(= (cartProd2 #{"ace" "king" "queen"} #{"&#9824;" "&#9829;" "&#9830;" "&#9827;"})
   #{["ace"   "&#9824;"] ["ace"   "&#9829;"] ["ace"   "&#9830;"] ["ace"   "&#9827;"]
     ["king"  "&#9824;"] ["king"  "&#9829;"] ["king"  "&#9830;"] ["king"  "&#9827;"]
     ["queen" "&#9824;"] ["queen" "&#9829;"] ["queen" "&#9830;"] ["queen" "&#9827;"]})

(= (cartProd2 #{1 2 3} #{4 5})
   #{[1 4] [2 4] [3 4] [1 5] [2 5] [3 5]})

(= 300 (count (cartProd2 (into #{} (range 10))
                  (into #{} (range 30)))))
