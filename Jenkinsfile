pipeline {
agent any
stages {
stage('Checkout') {
steps {
git 'https://github.com/gobinda1990/single-window-login.git'
}
}
stage('Build Backend') {
steps {
sh './mvnw clean package -f backend/pom.xml'
}
}
stage('Build Frontend') {
steps {
sh 'cd frontend && npm install && npm run build'
}
}
stage('Docker Build & Deploy') {
steps {
sh 'docker-compose build'
sh 'docker-compose up -d'
}
}
}
}