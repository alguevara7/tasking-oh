(ns tasking.views.main
  (:require [tasking.views.common :as common])
  (:use [noir.core :only [defpage defpartial]]
        [hiccup.core :only [html]]))

;create more partials for sections of UI

(defpartial render-name [name]
  [:div {:class "row remove-bottom"}
   [:div {:class "one column"}]
   [:div {:class "fourteen columns"}
    [:div.story-box-title name]]])

(defpartial render-task [{:keys [name start end owner size]}]
  (println name)
  [:div {:class "row remove-bottom"}
   [:div {:class "one column"} "&nbsp;"]
   [:div {:class "one column story-box-task-start"} start]
   [:div {:class "one column story-box-task-end"} end]
   [:div {:class "one column story-box-task-owner"} owner]
   [:div {:class "eight columns story-box-task-name"} name]
   [:div {:class "one column story-box-task-size"} size]])

(defpartial render-story [{:keys [title] :as story}]
  [:div {:class "row remove-bottom"}
   [:div {:class "sixteen columns"}
    [:div.story-box
     (render-name title)
     (for [task (:tasks story)] (render-task task))]]])

(defpage "/" []
  (common/layout
   (render-story {:title "Story 1" :tasks [{:name "Task 1-1" :start 20 :end 22 :owner "AG" :size 1.5}
                                           {:name "Task 1-2" :start 20 :end 22 :owner "AG" :size 1.5}]})))

