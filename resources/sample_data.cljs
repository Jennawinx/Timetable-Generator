(ns sample-data)

(def sample-data
  {
   ;; ----------------------------------------- Replacable Here ---------------------------------------

   ;; Auto-fill
   :main-labels        {"Introduction to Numerical Algorithms for Computational Mathematics" "CSCC37"
                        "An Introduction to Probability"                                     "STAB52"
                        "Symbolic Logic I"                                                   "PHLB50"
                        "Listening to Music"                                                 "VPMA93"
                        "Introduction to Databases"                                          "CSCC43"
                        "Computer and Network Security"                                      "CSCD27"}

   :groups             #{"CSCC37" "STAB52" "PHLB50" "VPMA93" "CSCC43" "CSCD27"}
   :columns            #{"monday" "tuesday" "wednesday" "thursday" "friday" "saturday" "sunday"
                         "mon" "tue" "wed" "thu" "fri" "sat" "sun"}
   :labels             #{"room" "type" "number"}

   ;; styling
   :themes             {"default" {:groups {"CSCC37" "rgb(164, 217, 217)"
                                            "STAB52" "rgb(255, 198, 200)"
                                            "PHLB50" "rgb(177, 207, 242)"
                                            "VPMA93" "rgb(217, 192, 255)"
                                            "CSCC43" "rgb(200, 227, 182)"
                                            "CSCD27" "rgb(242, 179, 253)"}}}

   :cell-views         {"default"   [:div.slot.info
                                     [:div {:style {:font-weight    :bold
                                                    :text-transform :uppercase
                                                    :font-size      "110%"
                                                    :margin-bottom  "0.25em"
                                                    }}
                                      "{%abbreviation%}"]
                                     [:div {:style {:text-transform :uppercase}}
                                      "{%type%} {%number%}" [:br]
                                      "{%room%}"]]
                        "alternate" [:div.slot.info
                                     [:div {:style {:font-weight    :bold
                                                    :text-transform :uppercase
                                                    :font-size      "110%"
                                                    :margin-bottom  "0.25em"
                                                    }}
                                      "{%abbreviation%}"]
                                     [:div {:style {:text-transform :uppercase}}
                                      "{%type%} {%room%}"]
                                     [:hr]
                                     [:div "{%desc%}"]]}

   :table-views        {"default" {:display-days ["mon" "tue" "wed" "thu" "fri"]
                                   :width        "74vh"
                                   :height       "100vh"
                                   :increment    1
                                   :min-time     9
                                   :max-time     19}}

   ;; data
   :slots              {"mon"
                        [{:group        "VPMA93",
                          :optional     {"number" "1", "type" "lec", "room" "AA 112"},
                          :main-label   "Listening to Music",
                          :column       "mon",
                          :abbreviation "VPMA93",
                          :start-time   9,
                          :end-time     11}
                         {:group        "CSCC37",
                          :optional     {"number" "1", "type" "lec", "room" "AA 112"},
                          :main-label
                                        "Introduction to Numerical Algorithms for Computational Mathematics",
                          :abbreviation "CSCC37",
                          :column       "mon",
                          :start-time   14,
                          :end-time     17}],
                        "thu"
                        [{:group        "STAB52",
                          :optional     {"number" "1", "type" "lec", "room" "SW 309"},
                          :main-label   "An Introduction to Probability",
                          :abbreviation "STAB52",
                          :column       "thu",
                          :start-time   9,
                          :end-time     11}
                         {:group        "CSCD27",
                          :optional     {"number" "1", "type" "lec", "room" "SW 143"},
                          :main-label   "Computer and Network Security",
                          :abbreviation "CSCD27",
                          :column       "thu",
                          :start-time   11,
                          :end-time     13}
                         {:group        "PHLB50",
                          :optional     {"number" "1", "type" "lec", "room" "HW 215"},
                          :main-label   "Symbolic Logic I",
                          :abbreviation "PHLB50",
                          :column       "thu",
                          :start-time   13,
                          :end-time     14}
                         {:group        "CSCC43",
                          :optional     {"number" "1", "type" "lec", "room" "IC 220"},
                          :main-label   "Introduction to Databases",
                          :abbreviation "CSCC43",
                          :column       "thu",
                          :start-time   14,
                          :end-time     16}
                         {:group        "CSCC37",
                          :optional     {"number" "1", "type" "tut", "room" "HW 408"},
                          :main-label
                                        "Introduction to Numerical Algorithms for Computational Mathematics",
                          :abbreviation "CSCC37",
                          :column       "thu",
                          :start-time   18,
                          :end-time     19}],
                        "tue"
                        [{:group        "STAB52",
                          :optional     {"number" "1", "type" "lec", "room" "SW 319"},
                          :main-label   "An Introduction to Probability",
                          :abbreviation "STAB52",
                          :column       "tue",
                          :start-time   9,
                          :end-time     11}
                         {:group        "CSCC43",
                          :optional     {"number" "1", "type" "tut", "room" "IC 308"},
                          :main-label   "Introduction to Databases",
                          :abbreviation "CSCC43",
                          :column       "tue",
                          :start-time   12,
                          :end-time     13}
                         {:group        "PHLB50",
                          :optional     {"number" "1", "type" "lec", "room" "HW 215"},
                          :main-label   "Symbolic Logic I",
                          :column       "tue",
                          :start-time   13,
                          :end-time     15,
                          :abbreviation "PHLB50"}
                         {:group        "CSCD27",
                          :optional     {"number" "4", "type" "pra", "room" "BV 473"},
                          :main-label   "Computer and Network Security",
                          :abbreviation "CSCD27",
                          :column       "tue",
                          :start-time   16,
                          :end-time     17}
                         {:group        "CSCD27",
                          :optional     {"number" "1", "type" "tut", "room" "AA 207"},
                          :main-label   "Computer and Network Security",
                          :abbreviation "CSCD27",
                          :column       "tue",
                          :start-time   17,
                          :end-time     18}]}

   ;; ----------------------------------------- Replacable Here ---------------------------------------

   ;; active
   :current-theme      "default"
   :current-table-view "default"

   ;; editor temp & rendering
   :editor             {:add-slot {:data         {:group    ""
                                                  :optional {"number" ""
                                                             "type"   ""
                                                             "room"   ""}}
                                   :field-to-add ""}}
   })
