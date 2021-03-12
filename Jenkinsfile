pipeline
{
 agent any

 stages
 {
     stage('Compile Stage')
     {
         steps
         {
               withMaven(maven: 'maven_3_10_0')
               sh 'mvn clean install'
         }
     }

     stage('Test Stage')
     {
             steps
             {
               withMaven(maven: 'maven_3_10_0')
               sh 'mvn test'
             }
     }

     stage('Publish cucumber reports')
     {
                  steps
                  {
                    cucumber buildStatus: "UNSTABLE",
                    fileIncludePattern: "**/index.html",
                    htmlReportDirectory: "target/cucumber-html-report"
                  }
     }

     stage('Publish extent reports')
          {
                       steps
                       {
                         cucumber buildStatus: "UNSTABLE",
                         fileIncludePattern: "**/extent.html",
                         htmlReportDirectory: "target/cucumber-reports/advanced-reports/extentreports"
                       }
          }
 }



 }

