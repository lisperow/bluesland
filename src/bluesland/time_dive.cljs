(ns ^:figwheel-hooks bluesland.time-dive
  (:require [reagent.core :as r]))

(defn app []
  [:h1.site__title
   [:span.site__title-text "Time Dive"]])

(defn mount []
  (r/render [app] (js/document.getElementById "root")))

(defn ^:after-load re-render []
  (mount))

(defounce start-up (do (mount) true))
