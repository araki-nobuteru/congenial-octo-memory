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
                    x = 1
                    echo "asdfzxcxv ${t} asdf"
                } else {
                    echo "asdfzxcxv2 asdf"
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
