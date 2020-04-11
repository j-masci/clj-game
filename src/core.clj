(ns core)

(def state (atom {
                  :test 8888
                  }))

(defn main
  []
  (load "do"))

(defn reload [] (do (use 'core :reload)))

(defn run [] (do (reload) (main)))
