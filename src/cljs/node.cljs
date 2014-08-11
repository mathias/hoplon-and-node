(ns hoplon-and-node.node
  (:require [cljs.nodejs :as node]))
(node/enable-util-print!)

(def restify (node/require "restify"))

(defn create-server []
  (let [server (.createServer restify)
        static-file-regexp (js/RegExp. "^/\\/?.*")
        static-server-opts (clj->js {:directory "./resources/public"
                                     :default "index.html"})
        static-file-server (.serveStatic restify static-server-opts)]
    (do
      (.get server static-file-regexp static-file-server)
      (.use server (.requestLogger restify))
      (.use server (.gzipResponse restify)))
    server))

(defn main [& args]
  (let [web-server (create-server)]
    (.listen web-server 3000)
    (.log js/console "Server started at http://localhost:3000")))

(set! *main-cli-fn* main)
