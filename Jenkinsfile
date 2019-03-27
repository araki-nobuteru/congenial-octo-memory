//@Library('Lib00Test') _

node {
    checkout scm
    def t = load "git.groovy"
    def a = load "vars/foo.groovy"
    
    parameters {
        string(name: 'repo_url', defaultValue: 'http://foo.bar/baz.git', description: 'Git repo URL')
        string(name: 'branch_to_build', defaultValue: 'master', description: 'Repo branch to build from')
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
