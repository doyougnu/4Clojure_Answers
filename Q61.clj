;; 4Clojure Question 61
;;
;; Write a function which takes a vector of keys and a vector of values and constructs a map from them.
;;
;; Restrictions (please don't use these function(s)): zipmap
;;
;; Use M-x 4clojure-check-answers when you're done!

(defn myZipMap [a b]
  (into {} (map vector a b)));just take advantage of maps behavior on multiple collections

(= (myZipMap [:a :b :c] [1 2 3]) {:a 1, :b 2, :c 3})

(= (myZipMap [1 2 3 4] ["one" "two" "three"]) {1 "one", 2 "two", 3 "three"})

(= (myZipMap [:foo :bar] ["foo" "bar" "baz"]) {:foo "foo", :bar "bar"})
