(ns intro.netflix)

;; Higher-order functions are functions that either take functions as arguments
;; or return them. They are used for many things in functional programming. This
;; namespace is used to demonstrate how loops are often avoided in functional
;; programming.

;; An example data: vector of maps. Maps are often used as "data objects" in
;; Clojure.
(def series [{:name "Stranger Things"
              :episode-count 10
              :rating 5
              :genre :horror}
             {:name "Daredevil"
              :episode-count 20
              :rating 4
              :genre :action}
             {:name "Jessica Jones"
              :episode-count 10
              :rating 5
              :genre :action}
             {:name "Hemlock Grove"
              :episode-count 36
              :rating 1
              :genre :horror}
             {:name "Marco Polo"
              :episode-count 22
              :rating 4
              :genre :drama}
             {:name "Luke Cage"
              :episode-count 12
              :rating 3
              :genre :action}
             {:name "House of Cards"
              :episode-count 32
              :rating 5
              :genre :drama}])

;; Now let's see how we can extract information or manipulate this data
;; using map, filter and reduce.

;;
;; Map (a function, not the data structure).
;;

;; Remember: keywords are functions!

;;
;; Filter.
;;

;;
;; Reduce.
;;

;;
;; Exercise 1: get the sum of all episodes in shows that have 5 as a rating.
;;

;; Try with and without the ->> macro.

;;
;; Exercise 2: each drama series gets a christmas special. Return a new series
;; vector, but add increment episode-count by one for every drama series.
;;

;;
;; Exercise 3: Return a map, where there's a key for each genre and the value
;; is the sum of all episodes for that genre.
;;
