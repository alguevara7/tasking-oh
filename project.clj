(defproject tasking "0.1.0-SNAPSHOT"
  :description "FIXME: write this!"
  :url "http://exampl.com/FIXME"
  :plugins [[lein-swank "1.4.4"]
            [lein-marginalia "0.7.1"]]
  :dependencies [[org.clojure/clojure "1.3.0"]
                 [noir-cljs "0.3.0"]
                 [jayq "0.2.2"]
                 [fetch "0.1.0-alpha2"]
                 [crate "0.2.1"]
                 [noir "1.3.0-beta10"]]
  :cljsbuild {:builds [{}]}
  :main ^{:skip-aot true} tasking.server)
