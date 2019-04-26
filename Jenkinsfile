node { 
    stage('Parse XML') {
        checkout scm
        
        def ts = params.threshold
        def resultsCsv = readFile file: 'Summary.txt'
        
        echo resultsCsv
        
        def lines = resultsCsv.split('\n')
        
        def coverage = ""
        def threshold = ""
        for (i=0; i<lines.size(); i++) {
            if (lines[i].contains("Line coverage: ")) {
                echo lines[i]
                def c = lines[i].tokenize(':')[1].replaceAll('%', '').replaceAll(' ', '').tokenize('.')
                echo c[0].trim().size().toString()
                echo c[1].trim().size().toString()

                def t = ts.tokenize('.')
                echo t[0]
                echo t[1]

                def precision = t[1].trim().size()
                
                threshold = (t[0].trim() + t[1].trim())
                coverage = (c[0].trim() + c[1].trim())
                
                if (c[1].trim().size() > precision) {
                    threshold += "0"*(c[1].trim().size() - precision)
                }
                if (c[1].trim().size() < precision) {
                    coverage += "0"*(precision - c[1].trim().size())
                }
                
                echo ">>> PRECISION: ${precision}"
                echo ">>> COVERAGE: ${coverage}"
                echo ">>> THRESHOLD: ${threshold}"
            }
        }
        
        
        if (coverage.trim().toInteger() > threshold.trim().toInteger()) {
            echo ">>> COVERAGE OK"
        } else {
            echo ">>> COVERAGE NOT OK"
            error message: "Failing due to low coverage"
        }
    }
}
