node { 
    stage('Parse XML') {
        checkout scm
        
        def resultsCsv = readFile file: 'Summary.txt'
        
        echo resultsCsv
        
        def lines = resultsCsv.split('\n')
        
        for (i=0; i<lines.length; i++) {
            echo lines[i]
        }
    }
}
