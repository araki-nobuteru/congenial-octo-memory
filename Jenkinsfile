pipeline { 
    agent any 
    parameters {
        string(name: 'PERSON', defaultValue: 'Mr Jenkins', description: 'Who should I say hello to?')
    }
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
