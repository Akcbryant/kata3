(ns kata3.core)

(defn factors [n]
  (filter #(zero? (mod n %)) (range 1 (inc n))))

(defn prime? [n]
  (= 2 (count (factors n))))

(defn prime-factors [n]
  (filter prime? (factors n)))
