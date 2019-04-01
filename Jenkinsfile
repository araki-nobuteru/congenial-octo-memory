def t = ""
def a




node {
    checkout scm
    a = load "git.groovy"
    a.huh("1")
    
    //cred = credentials("AnsiblePass")
    //echo cred
    
    dir("./vars") {
        sh "ls -l"
        def l = %WORKSPACE%
        echo l
    }
}

node {
    sh "ls -l"
    withEnv(['FOOBAR=foobarr!','QWERTY=asdsfq']) {
    //triggers { cron("@daily") }
    dir("zx") {
        def x

        stage("huh!?") {
            def i = input(message: "Should we go ahead?", ok: "Yup!", submitter:"araki", parameters: [
                choice(name:'foo', choices:"a\nb\nc", description: "huh!?!?"),
                booleanParam(name: 'sure', defaultValue: true, description: "sure?")
            ])
            echo i.foo
            a.greetings("asdf", "zxcv")
            echo env.WORKSPACE

            stage("qwerty") {
                if (t != null) {
                    x = 1
                    echo "asdfzxcxv ${t} asdf ${x}"
                } else {
                    echo "asdfzxcxv2 asdf"
                }
            }
        }

        if (params.customWS) {
            ws("asdfx") {
                a.fx()
            }
        } else {
            a.fx()
        }
    }
    }
}
