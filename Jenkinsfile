def t = ""
def a




node {
    checkout scm
    a = load "git.groovy"
    def variable1 = "abc123"
    //a.huh("1")
    
    script {
        def teste = "\nINFO: O rato roeu a roupa do rei de roma http://rato.roeu.roupa.rei.roma.com/ratofdp\nINFO: foobaz"
        echo teste
        def xc = teste =~ (/(?<=rei de roma )(.*)(?=\n)/)
        echo "REGEX test"
        echo "REGEX test >"
        xc.group()
        xc.each {println it[0]}
        echo "< REGEX test"
    }
    
    dir("./vars") {
        sh "ls -l"
        def l = "${WORKSPACE}"
        echo l
    }
}
