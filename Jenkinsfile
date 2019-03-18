@Library("Lib00") _

node { 
    parameters {
        string(name: 'repo_url', defaultValue: 'http://foo.bar/baz.git', description: 'Git repo URL')
        string(name: 'branch_to_build', defaultValue: 'master', description: 'Repo branch to build from')
    }
    stage('Clone repo') {
        baz("asdf")
    }    
    stage('Deploy') {
        echo "Publishing"
    }
}
