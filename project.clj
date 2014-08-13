(defproject hoplon-and-node "0.1.0-SNAPSHOT"
  :description "An example of using node in ClojureScript to serve a Hoplon page"
  :url "https://github.com/mathias/hoplon-and-node"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/clojurescript "0.0-2311"]]
  :plugins [[lein-cljsbuild "1.0.3"]
            [lein-npm "0.4.0"]]

  :node-dependencies [[restify "2.8.2"]]

  :cljsbuild {:builds {:node {:source-paths ["src/cljs/"]
                              :compiler {:optimizations :simple
                                         :output-to "src/js/node.js"
                                         :target :nodejs
                                         :pretty-print true}}}})
