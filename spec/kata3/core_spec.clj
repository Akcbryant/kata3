(ns kata3.core-spec
  (:require [speclj.core :refer :all]
            [kata3.core :refer :all]))

(describe "Return a list of all factors of a number"
  (it "1 has 1 factor"
    (should= [1] (factors 1)))
  (it "2 has 2 factors"
    (should= [1 2] (factors 2)))
  (it "8 has 4 factors"
    (should= [1 2 4 8] (factors 8))))

(describe "Return true if the number is a prime"
  (it "1 is not a prime"
    (should= false (prime? 1)))
  (it "2 is the only even prime"
    (should= true (prime? 2)))
  (it "even numbers above 2 are not prime"
    (should= false (prime? 6)))
  (it "for everything else check for prime up to sqrt of number"
    (should= true (prime? 13))))

(describe "Returns the primes of a number"
  (it "1 has no prime factors"
    (should= [] (prime-factors 1)))
  (it "2 has one prime factor"
    (should= [2] (prime-factors 2)))
  (it "3 has one prime factor"
    (should= [3] (prime-factors 3)))
  (it "4 has two prime factors but they are duplicates"
    (should= [2] (prime-factors 4)))
  (it "9 has three prime factors they are all duplicates"
    (should= [3] (prime-factors 9)))
  (it "78 is a good test"
    (should= [2 3 13] (prime-factors 78))))

