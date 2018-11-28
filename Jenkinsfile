pipeline { 
    agent any 
    stages {
        stage('Build') { 
            steps { 
                message "Running build"
            }
        }
        stage('Test'){
            steps {
                message "Running tests" 
            }
        }
        stage('Deploy') {
            steps {
                message "Publishing"
            }
        }
    }
}
