pipeline{
    agent any
    stages{
        stage("hi"){
            steps{
                println "say hi"
            }
        }
        stage("welcome"){
            steps{
                println "welcome all"
            }
        }
    }
}

