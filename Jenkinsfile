def t
def a
node {
    dir ("${currentBuild.number}") {
        checkout scm
        stage("Stage 0") {
                t = load "git.groovy"
                a = load "vars/foo.groovy"
        }
        stage("Stage 1") {
            script {
                echo "Current build number:"
                echo "${currentBuild.number}"
                a.testFunc("a")
            }
        }
        stage('Clone repo') {
            script {
                t.greetings("asdf")
            }
        }    
        stage('Deploy') {
            echo "${params.asdfg}"
        }
        stage('asdf') {
            script {
                asdf = sh returnStdout: true, script: 'pwd'
                echo "${asdf}"
            }
        }
    }
}
