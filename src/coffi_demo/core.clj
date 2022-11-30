(ns coffi-demo.core
  (:gen-class)
  (:require [coffi.ffi :as ffi :refer [defcfn]]))

(defcfn strlen
  "Given a string, measures its length in bytes."
  strlen [::mem/c-string] ::mem/long)

#_{:clj-kondo/ignore [:unused-binding]}
(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "The string \"Hello World\" has length: " (strlen "Hello World")))
