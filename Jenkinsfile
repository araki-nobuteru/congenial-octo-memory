@Library("Lib00Test")
import org.foo.Lib00

node { 
    parameters {
        string(name: 'repo_url', defaultValue: 'http://foo.bar/baz.git', description: 'Git repo URL')
        string(name: 'branch_to_build', defaultValue: 'master', description: 'Repo branch to build from')
    }
    stage('Clone repo') {
        Lib00Test.foobar("asdf")
    }    
    stage('Deploy') {
        echo "Publishing"
    }
}
