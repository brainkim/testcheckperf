(defproject testcheckperf "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]]
  :profiles {:good {:dependencies [[org.clojure/test.check "0.5.8"]]}
             :bad  {:dependencies [[org.clojure/test.check "0.5.9"]]}
             :still-bad {:dependencies [[org.clojure/test.check "0.6.2"]]}})
