pipeline {
  agent any
  stages {
    stage('build') {
      steps {
        sh 'mvn clean install'
      }
    }
    stage('deploy') {
      steps {
        sh 'mvn clean deploy'
      }
    }
  }
}