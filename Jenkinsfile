pipeline {
  agent any
  stages {
    stage('test') {
      steps {
        sh 'mvn -Dtest=AppTest#testApp test'
      }
    }
    stage('build') {
      steps {
        sh 'mvn clean install'
      }
    }
    stage('deploy') {
      steps {
        sh 'mvn --settings settings.xml clean deploy'
      }
    }
  }
}