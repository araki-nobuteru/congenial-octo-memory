pipeline { 
    agent any 
    stages {
        stage('Build') { 
            steps { 
                echo "Running build"
                echo "${repo_name}"
            }
        }
        stage('Test'){
            steps {
                echo "Running tests" 
            }
        }
        stage('Deploy') {
            steps {
                echo "Publishing"
            }
        }
    }
}
