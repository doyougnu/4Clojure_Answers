;; 4Clojure Question 73
;;
;; A <a href="http://en.wikipedia.org/wiki/Tic-tac-toe">tic-tac-toe</a> board is represented by a two dimensional vector. X is represented by :x, O is represented by :o, and empty is represented by :e.  A player wins by placing three Xs or three Os in a horizontal, vertical, or diagonal row.  Write a function which analyzes a tic-tac-toe board and returns :x if X has won, :o if O has won, and nil if neither player has won.;;
;; Use M-x 4clojure-check-answers when you're done!

(defn tttCheck [board]
  (let [[a b c] board
        firsts (map first board)
        seconds (map second board)
        thirds (map last board)
        firstcross (concat [(first firsts)] [(second seconds)] [(last thirds)])
        secondcross (concat [(last firsts)] [(second seconds)] [(first thirds)])]
    (defn test [j k]
      (reduce #(and %1 %2) (map #(= j %) k)))
    (cond
     (test :o firsts) ":o"
     (test :x firsts) ":x"
     (test :o seconds) ":o"
     (test :x seconds) ":x"
     (test :o thirds) ":o"
     (test :x thirds) ":x"
     (test :o a) ":o"
     (test :x a) ":x"
     (test :o b) ":o"
     (test :x b) ":x"
     (test :o c) ":o"
     (test :x c) ":x"
     (test :o firstcross) ":o"
     (test :x firstcross) ":x"
     (test :o secondcross) ":y"
     (test :x secondcross) ":x"
     :else nil)))

(= nil (tttCheck [[:e :e :e]
            [:e :e :e]
            [:e :e :e]]))

(= :x (tttCheck [[:x :e :o]
           [:x :e :e]
           [:x :e :o]]))

(= :o (tttCheck [[:e :x :e]
           [:o :o :o]
           [:x :e :x]]))

(= nil (tttCheck [[:x :e :o]
            [:x :x :e]
            [:o :x :o]]))

(= :x (tttCheck [[:x :e :e]
           [:o :x :e]
           [:o :e :x]]))

(= :o (tttCheck [[:x :e :o]
           [:x :o :e]
           [:o :e :x]]))

(= nil (tttCheck [[:x :o :x]
            [:x :o :x]
            [:o :x :o]]))
