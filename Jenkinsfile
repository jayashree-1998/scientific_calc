pipeline {
    environment{
            DOCKERHUB_CREDENTIALS = credentials('dockerhubcredentials')
    }
    agent any
    stages{
        stage("Git clone"){
            steps{
                git branch: 'main', url: 'https://github.com/jayashree-1998/scientific_calc'
            }
        }
        stage('Maven Build'){
            steps{
                echo 'Building Job'
                sh "mvn clean install"
            }
        }
        stage('Build Image using Dockerfile'){
            steps{
                echo 'Building docker Image'
                sh "docker build -t lax98/scientific_calculator:latest ."
            }
        }
        stage('Login into docker hub'){
            steps{
                echo 'Login into docker hub'
                sh 'echo $DOCKERHUB_CREDENTIALS_PSW | docker login -u $DOCKERHUB_CREDENTIALS_USR --password-stdin';
            }
        }
        stage('Push Image to DockerHub'){
            steps{
                echo 'Pushing Image into DockerHub'
                sh 'docker push lax98/scientific_calculator'
            }
        }
        stage('Delete Image from localsystem'){
            steps{
                echo 'Deleting Docker Image in localsystem'
                sh 'docker rmi lax98/scientific_calculator'
            }
        }
        stage('Run ansible playbook'){
            steps{
                echo 'Running the ansible playbook yml file'
                sh 'export LC_ALL=en_IN.UTF-8;export LANG=en_US.UTF-8;ansible-playbook -i inventory playbook.yml'
            }
        }

    }
}