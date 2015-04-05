(defproject clik-clak-joe "0.1.0-SNAPSHOT"
  :description "React Native tic-tac-toe in ClojureScript"
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/clojurescript "0.0-3153"]
                 [org.omcljs/om "0.8.8"]
                 [org.omcljs/ambly "0.1.0-SNAPSHOT"]]
  :plugins [[lein-cljsbuild "1.0.5"]]
  :source-paths ["src"]
  :clean-targets ["js" "out"]
  :cljsbuild {:builds {:dev
                       {:source-paths ["src"]
                        :compiler     {:output-dir     "out"
                                       :output-to      "out/main.js"
                                       :optimizations  :none
                                       #_:foreign-libs #_[{:provides ["reactnative"] 
                   :file "http://localhost:8081/Examples/TicTacToe/TicTacToeApp.includeRequire.runModule.bundle"}]}}
                       :rel
                       {:source-paths ["src"]
                        :compiler     {:output-to     "out/main.js"
                                       :optimizations :advanced
                                       :externs       ["externs.js"]
                                       :pretty-print  false
                                       :pseudo-names  false}}}})
