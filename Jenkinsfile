node { 
    stage('Parse XML') {
        checkout scm
        
        def resultsCsv = readCSV file: 'Summary.csv'
        echo resultsCsv[0]
    }
}
