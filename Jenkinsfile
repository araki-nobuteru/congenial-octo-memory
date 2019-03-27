def t
def a

pipeline {
    agent any
    
    parameters {
        string(name: 'repo_url', defaultValue: 'http://foo.bar/baz.git', description: 'Git repo URL')
        string(name: 'branch_to_build', defaultValue: 'master', description: 'Repo branch to build from')
    }
    
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
