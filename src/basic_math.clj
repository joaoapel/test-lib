(ns basic-math
  (:require [basic-math :as sut]
            [clojure.test :as t]))


(defn sum [a b]
  (+ a b))

(def minus [a b]
  (- a b))
