def t = ""
def a




node {
    checkout scm
    a = load "git.groovy"
    def variable1 = "abc123"
    //a.huh("1")
    
    script {
        def teste = "INFO: O rato roeu a roupa do rei de roma http://rato.roeu.roupa.rei.roma.com/ratofdp\nINFO: foobaz"
        def xc = teste =~ (/(?<=rei de roma )(.*)(?=\n)/)
        echo "REGEX test"
        echo ("REGEX test > " + teste)
        println(xc.lastmatch.toString())
    }
    
    dir("./vars") {
        sh "ls -l"
        def l = "${WORKSPACE}"
        echo l
    }
}
