(ns tasking.views.common
  (:require [noir.cljs.core :as cljs])
  (:use [noir.core :only [defpartial]]
        [hiccup.page :only [include-css html5]]))

(defpartial layout [& content]
            (html5
              [:head
               [:title "tasking"]
               (include-css "/css/reset.css") ;clean this up, do I need reset.css ?
               (include-css "/css/base.css")
               (include-css "/css/layout.css")
               (include-css "/css/skeleton.css")
               (include-css "/css/tasking.css")]
              [:body
               [:div.container
                [:div {:class "sixteen columns"}
                 content]]
               (cljs/include-scripts :with-jquery)]))
