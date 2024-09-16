pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/seu_usuario/seu_repositorio.git'
            }
        }
        stage('Build') {
            steps {
                sh 'mvn clean package' // Exemplo para projetos Java com Maven
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
    }
}
