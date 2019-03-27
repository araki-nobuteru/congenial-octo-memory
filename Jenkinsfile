def t
def a
def ws_

node {
    triggers { cron("@daily") }
    checkout scm
    a = load "git.groovy"
    
    if (params.customWS) {
        ws("asdfx") {
            a.fx()
        }
    } else {
        a.fx()
    }
}
