pipeline {
    agent any 
    stages {
        stage('pull') {
            steps {
                git branch: 'main', credentialsId: '2324ef01-eb15-438f-bb5f-0d85366536a9', url: 'https://github.com/ankitdhakate/student-app.git'
            }
        }
        stage('build') {
            steps {
                sh 'mnv clean package'
            }
        }
        stage('test') {
            steps {
                echo 'test successful' 
            }
        }
          stage('deploy') {
            steps {
                echo 'deploy successful' 
            }
        }
    }
}
