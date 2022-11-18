(ns app.views
  (:require [helix.core :refer [defnc]]
            [helix.dom :as d]))

(defnc Login
  []
  (d/div {:class "min-h-screen bg-gray-50 flex flex-col justify-center py-12 sm:px-6 lg:px-8"}
   (d/div {:class "sm:mx-auto sm:w-full sm:max-w-md"}
    (d/h2 {:class "mt-6 text-center text-3xl font-extrabold text-gray-900"} "Sign in to your account")
    (d/p {:class "mt-2 text-center text-sm text-gray-600 max-w"} "Or "
     (d/a {:href "#" :class "font-medium text-pink-600 hover:text-pink-500"} "start your 14-day free trial"0))
   (d/div {:class "mt-8 sm:mx-auto sm:w-full sm:max-w-md"}
    (d/div {:class "bg-white py-8 px-4 shadow sm:rounded-lg sm:px-10"}
     (d/form {:class "space-y-6" :action "#" :method "POST"}
      (d/div
       (d/label {:for "email" :class "block text-sm font-medium text-gray-700"} "Email address")
       (d/div {:class "mt-1"}
        (d/input {:id "email" :name "email" :type "email" :auto-complete "email" :required true :class "appearance-none block w-full px-3 py-2 border border-gray-300 rounded-md shadow-sm placeholder-gray-400 focus:outline-none focus:ring-pink-500 focus:border-pink-500 sm:text-sm"})))
      (d/div
       (d/label {:for "password" :class "block text-sm font-medium text-gray-700"} "Password")
       (d/div {:class "mt-1"}
        (d/input {:id "password" :name "password" :type "password" :auto-complete "current-password" :required true :class "appearance-none block w-full px-3 py-2 border border-gray-300 rounded-md shadow-sm placeholder-gray-400 focus:outline-none focus:ring-pink-500 focus:border-pink-500 sm:text-sm"})))
      (d/div {:class "flex items-center justify-between"}
       (d/div {:class "flex items-center"}
        (d/input {:id "remember_me" :name "remember_me" :type "checkbox" :class "h-4 w-4 text-pink-600 focus:ring-pink-500 border-gray-300 rounded"})
        (d/label {:for "remember_me" :class "ml-2 block text-sm text-gray-900"} "Remember me"))
       (d/div {:class "text-sm"}
        (d/a {:href "#" :class "font-medium text-pink-600 hover:text-pink-500"} "Forgot your password?")))
      (d/div
       (d/button
        {:type "submit"
         :on-click (fn [] (prn "click"))
         :class "w-full flex justify-center py-2 px-4 border border-transparent rounded-md shadow-sm text-sm font-medium text-white bg-pink-600 hover:bg-pink-700 focus:outline-none focus:ring-2 focus:ring-offset-2 focus:ring-pink-500"}
        "Sign in"))))))))

