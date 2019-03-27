def t
def a

pipeline {
    agent any
    
    stages {
        stage("Stage 0") {
            steps {
                dir ("foo") {
                    script {
                        checkout scm
                        t = load "git.groovy"
                        a = load "vars/foo.groovy"
                    }
                }
            }
        }
        stage("Stage 1") {
            steps {
                dir ("foo") {
                    script {
                        echo "Current build number:"
                        echo "${currentBuild.number}"
                        a.testFunc("a")
                    }
                }
            }
        }

        stage('Clone repo') {
            steps {
                dir ("foo") {
                    script {
                        t.greetings("asdf")
                    }
                }
            }
        }    

        stage('Deploy') {
            steps {
                echo "${params.asdfg}"
            }
        }
        
        stage('asdf') {
            steps {
                dir ("foo") {
                    script {
                        asdf = sh returnStdout: true, script: 'pwd'
                        echo "${asdf}"
                    }
                }
            }
        }
    }
}
