#!/usr/bin/env boot

#tailrecursion.boot.core/version "2.5.0"

(set-env!
  :project      'hoplon-and-node
  :version      "0.1.0-SNAPSHOT"
  :dependencies '[[tailrecursion/boot.task   "2.2.4"]
                  [tailrecursion/hoplon      "5.10.17"]]
  :out-path     "resources/public"
  :src-paths    #{"src/hoplon/"})

;; Static resources (css, images, etc.):
(add-sync! (get-env :out-path) #{"assets"})

(require '[tailrecursion.hoplon.boot :refer :all])

(deftask development
  "Build shade for development."
  []
  (comp (watch) (hoplon {:prerender false :pretty-print true})))

(deftask production
  "Build shade for production."
  []
  (hoplon {:optimizations :advanced}))
