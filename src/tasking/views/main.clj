(ns tasking.views.main
  (:require [tasking.views.common :as common])
  (:use [noir.core :only [defpage defpartial]]
        [hiccup.core :only [html]]))

(defpartial render-story [{:keys [title]}]
  [:div {:class "row remove-bottom"}
   [:div {:class "sixteen columns"}
    [:div.story-box
     [:div {:class "row remove-bottom"}
      [:div {:class "one column"}] [:div {:class "fourteen columns"} [:div.story-box-title title]]]
     [:div {:class "row remove-bottom"}
      [:div {:class "four columns"} "&nbsp;"] [:div {:class "eight columns"} "Task 1 fg fgdf gdf gdfgdf gdg fgdf gdf gfd gdf gdf gdfg dfg df g df g dfg df gdf gdf gdf gdf gdfg dfg dfgdgdfgdf gdf g df g df g df gdf gdf gdf gdf"]]
     [:div {:class "row remove-bottom"}
      [:div {:class "four columns"} "&nbsp;"] [:div {:class "eight columns"} "Task 2"]]]]])

(defpage "/" []
  (common/layout
   (render-story {:title "Story 1"})))

