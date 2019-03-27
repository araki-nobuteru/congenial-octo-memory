def t = ""
def a




node {
    checkout scm
    a = load "git.groovy"
    a.huh("1")
}

node {
    withEnv(['FOOBAR=foobarr!','QWERTY=asdsfq']) {
    //triggers { cron("@daily") }
    dir("zx") {
        def x
        
        

        stage("huh!?") {
            a.greetings("asdf", "zxcv")
            echo env.WORKSPACE

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
}
