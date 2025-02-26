pipeline {
    agent any
    stages {
        stage('Check') {
            steps {
                git branch: "master", url: 'https://github.com/silpps/PipelineDemo'
            }
        }
        stage('Build') {
            steps {
                bat 'mvn clean install'
            }
        }
        }}
