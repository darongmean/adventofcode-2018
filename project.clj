(defproject adventofcode "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url  "http://www.eclipse.org/legal/epl-v10.html"}

  :dependencies [[org.clojure/clojure "1.9.0"]
                 [org.clojure/test.check "0.9.0"]
                 [expound "0.7.1"]]

  :profiles {:dev {:plugins [[com.jakemccrary/lein-test-refresh "0.23.0"]
                             [pjstadig/humane-test-output "0.9.0"]
                             [lein-kibit "0.1.6"]]}})
