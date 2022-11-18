(ns app.app
  (:require ["react-dom/client" :as rdom]
            [app.views :as views]
            [app.lib :refer [defnc]]
            [helix.core :refer [$]]))

(defnc app
  []
  ($ views/Login))

(defonce root
  (rdom/createRoot (js/document.getElementById "app")))

(defn render []
  (.render root ($ app)))

(defn ^:export init []
  #_(refx/clear-subscription-cache!)
  #_(refx/dispatch-sync [::initialize-db])
  (render))

