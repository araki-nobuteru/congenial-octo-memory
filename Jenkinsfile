def t
def a
def ws_

node {
    //triggers { cron("@daily") }
    checkout scm
    a = load "git.groovy"
    
    stage {
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
