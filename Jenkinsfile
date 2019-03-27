def t
def a
def ws_

node {
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
