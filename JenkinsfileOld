
pipeline {

    agent { label 'run-codeql-analysis' }

    environment {
        ...
    }

    options {
        ...
    }

    stages {
       

        // OPTIONAL: Download CodeQL CLI Bundle
        // The CodeQL bundle (containing the CodeQL CLI as well as the pre-compiled CodeQL Query Suites, which is recommended for CI/CD integration) can either be download as part of the pipeline,
        // or pre-downloaded and placed on the CI/CD build machine(s). If pre-downloading, replace \path\to\cli in subsequent stages with the absolute path to the download location.
        // In this example, we download the latest CLI bundle (at time of writing) as part of the pipeline from https://github.com/github/codeql-action/releases.
        stage('Download CodeQL CLI Bundle') {
            steps {
                sh "wget https://github.com/github/codeql-action/releases/latest/download/codeql-bundle-win64.tar.gz -O ..\codeql-bundle-win64.tar.gz"
                sh "tar xzvf ..\codeql-bundle-win64.tar.gz -C ..\"
                sh "del ..\codeql-bundle-win64.tar.gz"
                sh "cd ..\; set PATH=%cd%\codeql;%PATH%"
            }
        }

    }

}
