node { 
    stage('Parse XML') {
        checkout scm
        
        def ts = params.threshold
        def resultsCsv = readFile file: 'Summary.txt'
        
        echo resultsCsv
        
        def lines = resultsCsv.split('\n')
        
        def coverage = 0
        for (i=0; i<lines.length; i++) {
            if (lines[i].contains("Line coverage: ")) {
                echo lines[i]
                def c = lines[i].tokenize(':')[1].replaceAll('%', '').replaceAll(' ', '').tokenize('.')
                echo c[0]
                echo ts.tokenize(".")[0]
                def t = ts.tokenize('.')

                def precision = t[1].length
                
                def threshold = (t[0] + t[1])
                coverage = (c[0] + c[1])
                
                if (c[1].length >= precision) {
                    threshold += "0"*(c[1].length - precision)
                } else {
                    coverage +="0"*(precision - c[1].length)
                }
                
                echo ">>> PRECISION: ${precision}"
                echo ">>> COVERAGE: ${coverage}"
                echo ">>> THRESHOLD: ${threshold}"
            }
        }
        
        
        if (coverage.toInteger() > threshold.toInteger()) {
            echo ">>> COVERAGE OK"
        } else {
            echo ">>> COVERAGE NOT OK"
            error message: "Failing due to low coverage"
        }
    }
}
