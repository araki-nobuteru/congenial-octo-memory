def t = ""
def a
def ws_

node {
    //triggers { cron("@daily") }
    dir("zx") {
        checkout scm
        a = load "git.groovy"

        stage("huh!?") {
            a.greetings("asdf", "zxcv")

            stage("qwerty") {
                if (t != null) {
                    echo "asdfzxcxv ${t} asdf"
                } else {
                    echo "asdfzxcxv asdf"
                }
            }
        }

        if (params.customWS) {
            ws("asdfx") {
                a.fx()
            }
        } else {
            a.fx()
        }
    }
}
