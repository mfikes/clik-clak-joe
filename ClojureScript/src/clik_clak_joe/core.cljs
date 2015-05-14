(ns clik-clak-joe.core
  (:require [clik-clak-joe.pre-om]
            [om.core :as om]
            [om.dom :as dom]))

;; Reset js/React back as the form above loads in an different React
(set! js/React (js/require "react-native/Libraries/react-native/react-native"))

(defn widget [data owner]
  (reify
    om/IRender
    (render [this]
      (js/React.createElement js/React.View 
          (clj->js {:style {:flexDirection "row", 
                            :margin 40 :backgroundColor "#EEFFEE" 
                            :justifyContent "center"}})
        (js/React.createElement js/React.Text 
            (clj->js {:style {:flex 1, 
                              :justifyContent "center"}}) 
            (:text data))))))

(om/root widget {:text "Hello from ClojureScript!"} {:target 1})
