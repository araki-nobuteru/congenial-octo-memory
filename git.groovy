def greetings(String param1, String param2) {
    echo "greetings from git.groovy, ${param1} ${param2}"
    echo env.FOOBAR
    echo env.QWERTY
    echo env.DELTA
}

def huh(p1) {
    def xc = "999"
    stage("special") {
        echo p1
        echo xc
    }
    this.huh2()
}

def huh2() {
    echo "FOOOZ!"
}

def fx() {
    stage("Stage 0") {
        sh "echo ${currentBuild.number} > teste.txt"
        sh "cat teste.txt"
    }

    stage("Stage 1") {
        echo "Current build number:"
        echo "${currentBuild.number}"
    }

    //stage('Clone repo') {
    //    t.greetings("asdf")
    //}    

    stage('Deploy') {
        echo "${params.asdfg}"
    }

    stage('asdf') {
        asdf = sh returnStdout: true, script: 'pwd'
        echo "${asdf}"

        sh "cat teste.txt"
    }
}

return this
