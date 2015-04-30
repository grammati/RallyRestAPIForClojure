(defproject com.rallydev/clj-rally "0.5.0"
  :description "A clojure library for interating with Rally's webservice API."
  :url "https://github.com/RallyTools/RallyRestAPIForClojure"
  :license {:name "MIT License"
            :url "http://en.wikipedia.org/wiki/MIT_License"}
  :dependencies [[camel-snake-kebab "0.3.1" :exclusions [org.clojure/clojure]]
                 
                 [clj-http "1.0.1"]

                 [environ "1.0.0"]

                 [org.clojure/core.cache "0.6.4"]
                 [org.clojure/core.memoize "0.5.6"]

                 [slingshot "0.12.2"]]
  :jvm-opts ["-Xmx1g"]
  :test-selectors {:default     (complement :integration)
                   :integration :integration}
  :plugins [[lein-pprint "1.1.1"]]
  :profiles {:dev {:source-paths ["dev"]
                   :dependencies [[criterium "0.4.3"]
                                  [org.clojure/clojure "1.6.0"]
                                  [crypto-random "1.2.0"]]}})
