node { 
    stage('Parse XML') {
        checkout scm
        
        def xmlString = readFile 'results.xml'
        def xml = new XmlParser().parseText(xmlString)
        
        xml.CoverageSession.Summary.attributes.each {
            echo it.text()
        }
    }
}
