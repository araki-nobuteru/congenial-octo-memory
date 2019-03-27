def t
def a
def ws_

node {
    //triggers { cron("@daily") }
    checkout scm
    a = load "git.groovy"
    
    stage("huh!?") {
        a.greetings("asdf", "zxcv")
    }
    
    if (params.customWS) {
        ws("asdfx") {
            a.fx()
        }
    } else {
        a.fx()
    }
}
