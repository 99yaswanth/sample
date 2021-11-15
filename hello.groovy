//descriptive pipeline

pipeline{
    agent any
    stages{
        stage("clone a repo"){
            steps{
                println "repo is cloned"
            }
        }
        stage("build"){
            steps{
                println "build is completed"
            }
        }
    }
}