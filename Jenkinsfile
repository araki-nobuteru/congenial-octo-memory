def t
def a
def ws_

node {
    if (params.customWS) {
        ws_ = "asdfx"
    } else {
        ws_ = env.WORKSPACE
    }
    
    ws(ws_) {
        checkout scm

        stage("Stage 0") {
            t = load "git.groovy"
            a = load "vars/foo.groovy"

            sh "echo ${currentBuild.number} > teste.txt"
            sh "cat teste.txt"
        }

        stage("Stage 1") {
            echo "Current build number:"
            echo "${currentBuild.number}"
            a.testFunc("a")
        }

        stage('Clone repo') {
            t.greetings("asdf")
        }    

        stage('Deploy') {
            echo "${params.asdfg}"
        }

        stage('asdf') {
            asdf = sh returnStdout: true, script: 'pwd'
            echo "${asdf}"

            sh "cat teste.txt"
        }
    }
}
