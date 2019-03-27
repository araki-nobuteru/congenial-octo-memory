def t
def a

pipeline {
    agent any
    
    parameters {
        string(name: 'repo_url', defaultValue: 'http://foo.bar/baz.git', description: 'Git repo URL')
        string(name: 'branch_to_build', defaultValue: 'master', description: 'Repo branch to build from')
    }
    
    stages {
        stage("Stage 1") {
            steps {
                checkout scm
                t = load "git.groovy"
                a = load "vars/foo.groovy"
            }
        }
        
        stage('1') {
            a.testFunc("a")
        }
        stage('Clone repo') {
            t.greetings("asdf")
        }    
        stage('Deploy') {
            echo "${params.asdfg}"
        }
        stage('asdf') {
            asdf = sh returnStdout: true, script: 'ls -l'
            echo "${asdf}"
        }
    }
}
