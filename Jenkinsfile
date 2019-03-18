//@Library('Lib00Test') _

node { 
    parameters {
        string(name: 'repo_url', defaultValue: 'http://foo.bar/baz.git', description: 'Git repo URL')
        string(name: 'branch_to_build', defaultValue: 'master', description: 'Repo branch to build from')
    }
    stage('1') {
        sh "ls -l"
    }
    stage('Clone repo') {
        foo("asdf")
    }    
    stage('Deploy') {
        echo "Publishing"
    }
}
