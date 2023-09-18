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
                        sh 'sudo apt update -y'
                        sh 'sudo apt-get install maven -y'
                        sh 'mvn clean package'
                        
          }
   }      
       stage('push-artifact') { 
                steps {
                        sh 'sudo apt update -y'
                        sh 'curl "https://awscli.amazonaws.com/awscli-exe-linux-x86_64-2.0.30.zip" -o "awscliv2.zip"'
                        // sh 'sudo apt install unzip -y'
                        // sh 'unzip awscliv2.zip'
                        // sh 'sudo ./aws/install'
                        // sh 'aws s3 ls'
                }
       }
           }

        }