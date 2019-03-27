def t
def a
node {
    dir ("${currentBuild.number}") {
        stage("Stage 0") {
            script {
                checkout scm
                t = load "git.groovy"
                a = load "vars/foo.groovy"
            }
        }
        stage("Stage 1") {
            dir ("foo") {
                script {
                    echo "Current build number:"
                    echo "${currentBuild.number}"
                    a.testFunc("a")
                }
            }
        }
        stage('Clone repo') {
            dir ("foo") {
                script {
                    t.greetings("asdf")
                }
            }
        }    
        stage('Deploy') {
            echo "${params.asdfg}"
        }
        stage('asdf') {
            dir ("foo") {
                script {
                    asdf = sh returnStdout: true, script: 'pwd'
                    echo "${asdf}"
                }
            }
        }
    }
}
