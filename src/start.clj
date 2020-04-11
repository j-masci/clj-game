(ns game
  (:require
    [play-clj.core :refer :all]
    [play-clj.ui :refer :all])
  (:import [com.badlogic.gdx.backends.lwjgl LwjglApplication]
           [org.lwjgl.input Keyboard])
  (:gen-class))

(def state (atom {
                  :test 8888
                  }))

(defscreen the-screen
           :on-show
           (fn [screen entities]
             (update! screen :renderer (stage))
             (label "Hello world!" (color :white)))

           :on-render
           (fn [screen entities]
             (clear!)
             (render! screen entities)))

(defgame the-game
         :on-create
         (fn [this]
           (set-screen! this the-screen)))

(defn main
  []
  (do
    (load "do")
    (println the-game)
    (println the-screen)
    (LwjglApplication. the-game "wtf" 800 600)
    (Keyboard/enableRepeatEvents true)))


(defn reload [] (do (use 'game :reload-all)))

(defn run [] (do (reload) (main)))
