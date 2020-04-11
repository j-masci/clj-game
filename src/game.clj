(ns game
  (:require [play-clj.core :refer :all])
  (:require [play-clj.ui :refer :all])
  (:import
    [com.badlogic.gdx.backends.lwjgl LwjglApplication]
    [org.lwjgl.input Keyboard])
  )

(defscreen the-screen
           :on-show
           (fn [screen entities]
             (update! screen :renderer (stage))
             (label "Game..." (color :white)))

           :on-render
           (fn [screen entities]
             (print "wtf")
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
    (LwjglApplication. the-game "wtf" 1200 800)
    (Keyboard/enableRepeatEvents true)))
