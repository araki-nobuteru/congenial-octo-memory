node { 
    parameters {
        string(name: 'repo_url', defaultValue: 'http://foo.bar/baz.git', description: 'Git repo URL')
        string(name: 'branch_to_build', defaultValue: 'master', description: 'Repo branch to build from')
    }
    stage('Clone repo') {
        bat "git config core.longpaths true"
        git branch: "${branch_to_build}", credentialsId: '1b19d722-cb51-4b9f-b849-b9f1880fc9fd', url: "${repo_url}"
    }
    stage('Build') { 
        echo "Running build"
        bat 'C:\\Windows\\Microsoft.NET\\Framework\\v4.0.30319\\MSBuild.exe /t:Build /p:Configuration=Release;OutDir=C:\\custom_build_out'
    }
    stage('Packaging'){
        echo "Running packaging tool"
        bat "powershell.exe -NonInteractive -ExecutionPolicy Bypass -Command \"Compress-Archive C:\\custom_build_out\\_PublishedWebsites C:\\custom_build_out\\pack.zip \""
    }
    stage('Deploy') {
        echo "Publishing"
    }
}
