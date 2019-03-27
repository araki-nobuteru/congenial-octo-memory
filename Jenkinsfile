def t
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
                echo "asdfzxcxv"
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
