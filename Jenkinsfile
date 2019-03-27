def t = ""
def a
def wx = "foobaz"

node {
    //triggers { cron("@daily") }
    dir("zx") {
        def x
        checkout scm
        a = load "git.groovy"

        stage("huh!?") {
            a.greetings("asdf", "zxcv")
            echo "${env.WORKSPACE}"

            stage("qwerty") {
                if (t != null) {
                    x = 1
                    echo "asdfzxcxv ${t} asdf ${x}"
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
