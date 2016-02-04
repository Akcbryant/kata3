(ns kata3.core)

(defn factors [number]
  (filter #(zero? (mod number %)) (range 1 (inc number))))

(defn prime? [number]
  (cond (= number 1) false
        (= number 2) true
        (even? number) false
  :else
  (let [square-root (int (Math/sqrt number))]
    (loop [i 3]
      (cond (> i square-root) true
            (zero? (mod number i)) false
            :else (recur (+ i 2)))))))

(defn prime-factors [number]
  (let [factors (factors number)]
    (filter prime? factors)))
