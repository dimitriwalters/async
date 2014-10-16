(defproject async-tut1 "0.1.0-SNAPSHOT"
  :description "FIXME: write this!"
  :url "http://example.com/FIXME"

  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/clojurescript "0.0-2311"]]

  :plugins [[lein-cljsbuild "1.0.4-SNAPSHOT"]]

  :source-paths ["src"]

  :cljsbuild {
    :builds [{:id "async-tut1"
              :source-paths ["src"]
              :compiler {
                :output-to "async_tut1.js"
                :output-dir "out"
                :optimizations :none
                :source-map true}}]})
