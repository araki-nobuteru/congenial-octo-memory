node { 
    stage('Parse XML') {
        checkout scm
        
        def resultsCsv = readCSV file: 'Summary.csv'
        for(i=0; i<resultsCsv.length; i++) {
            echo resultsCsv[i][0]
        }
    }
}
