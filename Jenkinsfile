def t = ""
def a




node {
    checkout scm
    a = load "git.groovy"
    def variable1 = "abc123/"
    def props = readJSON file: './teste.json'
    def versionParts = props.version.tokenize("-")
    def versionNumbers = versionParts[0].tokenize(".")
    
    echo ">>> Version number: " + props.version
    
    def majorVersion = versionNumbers[0].toInteger()
    def minorVersion = versionNumbers[1].toInteger()
    def patchVersion = versionNumbers[2].toInteger()
    
    def versionSuffix = null
    def versionSuffixNumber = null
    if (versionParts.size() > 1) {
        def suffix = versionParts[1].tokenize(".")
        versionSuffix = suffix[0]
        versionSuffixNumber = suffix[1]
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
        
        def updatedVersion = majorVersion + "." + minorVersion + "." + patchVersion
        if (versionParts.size() > 1) {
            updatedVersion += ("-" + versionSuffix + "." + versionSuffixNumber)
        }
        
        echo ">>> Updated version number: " + updatedVersion
    }
}
