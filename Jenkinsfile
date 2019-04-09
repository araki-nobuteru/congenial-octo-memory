def t = ""
def a
node {
    sh "git clone --bare https://github.com/araki-nobuteru/congenial-octo-memory.git"
    sh "git checkout develop"
    
    a = load "git.groovy"
    def variable1 = "abc123/"
    def props = readJSON file: './teste.json'
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
        writeJSON(file: './teste.json', json: props)
        withCredentials([usernamePassword(credentialsId:"araki-github", usernameVariable:"githubUser", passwordVariable:"githubPass")]) {
            sh "git add teste.json"
            sh "git commit -am \"Bumping version number\""
            sh "git push https://${githubUser}:${githubPass}@github.com/araki-nobuteru/congenial-octo-memory.git"
        }
    }
}
