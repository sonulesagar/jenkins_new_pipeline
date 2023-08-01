pipeline {
    agent any 
     stages {
         stage('code-pull') 
         {
                steps 
        {
                       echo 'Hello Pranjali Madam'
                       echo 'this program is code-pulling'
        }
  }
   stage('Build') {
                steps {
                        echo 'Build'
                        echo 'this program is successfully build'
                        
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