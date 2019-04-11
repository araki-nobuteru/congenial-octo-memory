def t = ""
def a
node {
    cleanWs deleteDirs: true
    
    git branch: "develop", credentialsId: "araki-github", url: "https://github.com/araki-nobuteru/congenial-octo-memory.git"
    sh "ls -l"
    
    a = load "git.groovy"
    def variable1 = "abc123/"
    def props = readJSON file: 'teste.json'
    def versionParts = props.version.tokenize("-")
    def versionNumbers = versionParts[0].tokenize(".")
    
    echo ">>> Version number: " + props.version
    
    def updatedVersion
    
    def majorVersion = versionNumbers[0].toInteger()
    def minorVersion = versionNumbers[1].toInteger()
    def patchVersion = versionNumbers[2].toInteger()
    
    def versionSuffix = null
    def versionSuffixNumber = -1
    if (versionParts.size() > 1) {
        def suffix = versionParts[1].tokenize(".")
        versionSuffix = suffix[0]
        versionSuffixNumber = suffix[1].toInteger()
    }
        
    stage("Bumping version number") {
        if(params.releaseType == "major") {
            majorVersion += 1
        } else if (params.releaseType == "minor") {
            minorVersion += 1
        } else if (params.releaseType == "patch") {
            patchVersion += 1
        } else {
            versionSuffixNumber += 1
        }
        
        updatedVersion = majorVersion + "." + minorVersion + "." + patchVersion
        if (versionParts.size() > 1) {
            updatedVersion += ("-" + versionSuffix + "." + versionSuffixNumber)
        } else if (params.releaseType == "pre-release") {
            updatedVersion += ("-rc." + versionSuffixNumber)
        }
        
        echo ">>> Updated version number: " + updatedVersion
    }
    
    stage("Updating package.json file") {
        props.version = updatedVersion
        writeJSON(file: 'teste.json', json: props, pretty: 4)
        def user
        def pass
        def s
        withCredentials([usernamePassword(credentialsId:"testcred", usernameVariable:"GITHUBUSER", passwordVariable:"GITHUBPASS")]) {
            sh 'git remote set-url origin https://${GITHUBUSER}:${GITHUBPASS}@github.com/araki-nobuteru/congenial-octo-memory.git/'
            sh "git add teste.json"
            sh "git commit -m \"Bumping version number\""            
            sh "git push https://${GITHUBUSER}:${GITHUBPASS}@github.com/araki-nobuteru/congenial-octo-memory.git/"
            
            GITHUBPASS = "asdf$"
            s = "${GITHUBPASS}"
        }
        s = java.net.URLEncoder.encode(s, "UTF-8")
        echo s
    }
}
