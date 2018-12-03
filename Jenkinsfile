node { 
    parameters {
        string(name: 'PERSON', defaultValue: 'Mr Jenkins', description: 'Who should I say hello to?')
    }
    stage('Build') { 
        checkout scm
        echo "Running build"
        echo "${repo_name}"
    }
    stage('Test'){
        echo "Running tests" 
        echo "${PERSON}"
    }
    stage('Deploy') {
        echo "Publishing"
    }
}
