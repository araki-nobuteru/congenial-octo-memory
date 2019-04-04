def t = ""
def a




node {
    checkout scm
    a = load "git.groovy"
    def variable1 = "abc123"
    echo ">>>>>"
    def currentResult = currentBuild.result ?: 'SUCCESS'
    echo currentResult
    
    script {
        def teste = "\nINFO: O rato roeu a roupa do rei de roma http://rato.roeu.roupa.rei.roma.com/ratofdp\nINFO: foobaz"
        def vv = sh (returnStdout:true, script: "echo teste")
        def xc = teste =~ (/(?<=rei de roma )(.*)(?=\n)/)
        echo "REGEX test"
        //println(xc.find())
        echo "REGEX test >"
        def z = xc[0][0]
        echo z
        //xc.each {println it[0]}
        echo "< REGEX test"
    }
    
    dir("./vars") {
        sh "ls -l"
        def l = "${WORKSPACE}"
        echo l
    }
}
