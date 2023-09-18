pipeline {
    agent any 
     stages {
         stage('code-pull') 
         {
                steps 
        {
                       git 'https://github.com/sonulesagar/student-ui.git'
                       echo 'this program is code-pulling'
        }
  }
   stage('Build') {
                steps {
                        sh 'sudo apt-get update -y'
                        sh 'sudo apt-get install maven -y'
                        sh 'mvn clean package -y'
                        
          }
   }      
       stage('test') { 
                steps {
                        echo 'Test'
                        echo 'this program is successfully test'
                }
       }
           }

        }