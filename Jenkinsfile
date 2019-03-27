def t
def a

pipeline {
    agent any
    
    stages {
        stage("Stage 0") {
            steps {
                script {
                    checkout scm
                    t = load "git.groovy"
                    a = load "vars/foo.groovy"
                }
            }
        }
        stage("Stage 1") {
            steps {
                script {
                    a.testFunc("a")
                }
            }
        }

        stage('Clone repo') {
            steps {
                script {
                    t.greetings("asdf")
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
                script {
                    asdf = sh returnStdout: true, script: 'ls -l'
                    echo "${asdf}"
                }
            }
        }
    }
}
