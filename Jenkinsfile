pipeline {
    agent any
    stages {
        stage('Jenkins Court') {
            steps {
                echo 'Court interface'
            }
        }
        stage('Build') { 
            steps {
                sh 'mvn clean install'
            }
        }      
    }
}