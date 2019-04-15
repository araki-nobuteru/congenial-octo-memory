node { 
    stage('Parse XML') {
        checkout scm
        
        def threshold = params.threshold.toFloat()
        
        def resultsCsv = readFile file: 'Summary.txt'
        
        echo resultsCsv
        
        def lines = resultsCsv.split('\n')
        
        def coverage = 0
        for (i=0; i<lines.length; i++) {
            if (lines[i].contains("Line coverage: ")) {
                echo lines[i]
                coverage = lines[i].split(":")[1].toFloat()
            }
        }
                
        if (coverage > threshold) {
            echo ">>> COVERAGE OK"
        } else {
            echo ">>> COVEERAGE NOT OK"
        }
    }
}
