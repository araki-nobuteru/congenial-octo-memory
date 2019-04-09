def t = ""
def a




node {
    checkout scm
    a = load "git.groovy"
    def variable1 = "abc123/"
    def props = readJSON file: './teste.json'
    def versionParts = props.version.tokenize("-")
    def versionNumbers = versionParts[0].tokenize(".")
    
    echo ">>> Version number: " + versionParts[0]
    
    def majorVersion = versionNumbers[0].toInteger()
    def minorVersion = versionNumbers[1].toInteger()
    def patchVersion = versionNumbers[2].toInteger()
    
    def versionSuffix = null
    if (versionParts.size() > 1) {
        versionSuffix = versionParts[1]
        echo ">>> Version suffix: " + versionSuffix
    }
        
    stage("Bumping version number") {
        if(params.releaseType == "major") {
            majorVersion += 1
        } else if (params.releaseType == "minor") {
            minorVersion += 1
        } else {
            patchVersion += 1
        }
        
        def updatedVersion = majorVersion + "." + minorVersion + "." + patchVersion
        if (versionParts.size() > 1) {
            updatedVersion += ("-" + versionSuffix)
        }
        
        echo ">>> Updated version number: " + updatedVersion
    }
}
