node { 
    stage('Parse XML') {
        checkout scm
        
        def resultsCsv = readCSV file: 'Summary.csv'
        resultsCsv.each {
            echo it[0]
        }
    }
}
