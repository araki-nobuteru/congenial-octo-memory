def t = ""
def a




node {
    checkout scm
    a = load "git.groovy"
    def variable1 = "abc123/"
    def props = readJSON file: './teste.json'
    def versionParts = props.version.tokenize("-")
    def versionNumbers = versionParts[0].tokenize(".")
    
    echo ">>> Version number:"
    echo versionParts[0]
    
    def majorVersion = versionNumbers[0]
    def minorVersion = versionNumbers[1]
    def patchVersion = versionNumbers[2]
    
    def versionSuffix = null
    if (versionParts.size() > 1) {
        versionSuffix = versionParts[1]
        echo ">>> Version suffix:"
        echo versionSuffix
    }
        
    stage("Bumping version number") {
        if(params.releaseType == "major") {
            
        } else if (params.releaseType == "minor") {
            
        } else {
            
        }
    }
}
