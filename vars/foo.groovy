def testFunc(param) {
    stages {
        stage("foo/01") {
            steps {
                echo "Baz from vars/foo"
            }
        }
        stage("foo/02") {
            steps {
                echo "Qux from vars/foo"
            }
        }
    }
}

return this
