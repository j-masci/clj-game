(defproject clj-game "0.1.0-SNAPSHOT"
  :url "https://github.com/j-masci/clj-game"
  :dependencies [[org.clojure/clojure "1.10.0"]]
  :main ^:skip-aot core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
