(defproject clik-clak-joe "0.1.0-SNAPSHOT"
  :description "React Native tic-tac-toe in ClojureScript"
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/clojurescript "0.0-2913"]]
  :plugins [[lein-cljsbuild "1.0.5"]]
  :source-paths ["src"]
  :clean-targets ["js" "out"]
  :cljsbuild {:builds {:dev
                       {:source-paths ["src"]
                        :compiler     {:output-dir     "out"
                                       :output-to      "js/main.js"
                                       :optimizations  :none
                                       :cache-analysis true
                                       :source-map     true}}
                       :rel
                       {:source-paths ["src"]
                        :compiler     {:output-to     "js/main.js"
                                       :optimizations :advanced
                                       :externs       ["externs.js"]
                                       :pretty-print  false
                                       :pseudo-names  false}}}})
