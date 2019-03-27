def t
def a
def ws_

node {
    //triggers { cron("@daily") }
    checkout scm
    a = load "git.groovy"
    
    stage("huh!?") {
        a.greetings(param1: "asdf", param2: "zxcv")
    }
    
    if (params.customWS) {
        ws("asdfx") {
            a.fx()
        }
    } else {
        a.fx()
    }
}
