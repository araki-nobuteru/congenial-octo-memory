//@Library('Lib00Test') _

node {
    def s = checkout scm
    def t = load "baz.groovy"
    
    parameters {
        string(name: 'repo_url', defaultValue: 'http://foo.bar/baz.git', description: 'Git repo URL')
        string(name: 'branch_to_build', defaultValue: 'master', description: 'Repo branch to build from')
    }
    stage('1') {
        sh "ls -l"
    }
    stage('Clone repo') {
        t.greetings("asdf")
    }    
    stage('Deploy') {
        echo "Publishing"
    }
}
