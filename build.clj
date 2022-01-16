(ns build
  (:require [org.corfield.build :as bb]))

(defn uberjar [opts]
  (bb/uber (merge {:main 'abraao.core :uber-file "seguranca.jar"} opts)))
