(defproject clj-spotify "0.1.5"
  :description "A client library for the Spotify Web API"
  :url "https://github.com/blmstrm/clj-spotify"
  :license {:name "The MIT License (MIT)"
            :url "http://opensource.org/licenses/MIT"}
  :plugins [[lein-cloverage "1.0.9"]]
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/data.json "0.2.6"]
                 [cheshire "5.8.0"]
                 [clj-http "3.7.0"]])
