(ns kata3.core)

(defn factors [n]
  (filter #(zero? (mod n %)) (range 1 (inc n))))

(defn prime? [n]
  (cond (= n 1) false
        (and (< n 4) (>= n 2)) true
        (even? n) false
        :else (= 2 (count (factors n)))))

(defn prime-factors [n]
  (filter prime? (factors n)))
