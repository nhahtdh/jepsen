(defproject jepsen.chronos "0.1.1-SNAPSHOT"
  :description "Jepsen Mesos/Chronos test"
  :url "https://github.com/aphyr/jepsen"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [jepsen.zookeeper "0.1.0-SNAPSHOT" :exclusions [log4j jepsen]]
                 [jepsen "0.1.1-SNAPSHOT"]
                 [cheshire "5.5.0"]
                 [clj-http "3.0.1"]
                 [clj-time "0.11.0"]
                 [loco "0.3.0" :exclusions [org.slf4j/slf4j-api]]])
