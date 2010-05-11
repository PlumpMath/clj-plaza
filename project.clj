(defproject plaza "0.0.2-SNAPSHOT"
  :description "Plaza framework for semantic distributed applications"
  :dependencies [[org.clojure/clojure "1.2.0-master-SNAPSHOT"]
                 [org.clojure/clojure-contrib "1.2.0-SNAPSHOT"]
                 [com.hp.hpl.jena/jena "2.6.2"]
                 [com.hp.hpl.jena/arq "2.8.3"]
                 [net.rootdev/java-rdfa "0.3"]
                 [nu.validator.htmlparser/htmlparser "1.2.0"]
                 [com.franz/openrdf-sesame-onejar "2.2"]]
  :dev-dependencies [[leiningen/lein-swank "1.2.0-SNAPSHOT"]
                     [autodoc "0.7.1"]]
    :autodoc { :name "clj-plaza", :page-title "clj-plaza distributed semantic systems library"
              :author "Antonio Garrote <antoniogarrote@gmail.com> <agarrote@usal.es>"
              :copyright "2010 (c) Antonio Garrote, under the MIT license"
              :web-home "http://antoniogarrote.github.com/clj-plaza/api"})