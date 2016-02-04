(ns kata3.core-spec
  (:require [speclj.core :refer :all]
            [kata3.core :refer :all]))

(describe "Return a list of the factors for a number"
  (it "1"
    (should= [1] (factors 1)))
  (it "2"
    (should= [1 2] (factors 2)))
  (it "3"
    (should= [1 3] (factors 3)))
  (it "10"
    (should= [1 2 5 10] (factors 10))))

(describe "Return true if the number is prime"
  (it "1"
    (should= false (prime? 1)))
  (it "2"
    (should= true (prime? 2)))
  (it "3"
    (should= true (prime? 3)))
  (it "4"
    (should= false (prime? 4)))
  (it "5"
    (should= true (prime? 5)))
  (it "73"
    (should= true (prime? 73))))

(describe "Return a list of prime factors for the number"
  (it "1"
    (should= [] (prime-factors 1)))
  (it "2"
    (should= [2] (prime-factors 2)))
  (it "10"
    (should= [2 5] (prime-factors 10))))
