pipeline {
    agent any
    parameters {
        choice( name: 'VERSION', choices: ['1.1.0', '1.2.0', '1.3.0'], description: '')
        booleanParam(name: 'executesTests', defaultValue: true, description: '')
    }
    stages {
        stage("init") {
            steps {
                script {
                    gv = load "script.groovy"
                }
            }
        }
        stage("build") {
            steps {
                script {
                    gv.buildApp()
                }
            }
        }
        stage("test") {
            when {
                expression {
                    params.executesTests
                }
            }
            steps {
                script {
                    gv.testdApp()
                }
            }
        }
        stage("deploy") {
            steps {
                script {
                    gv.deploydApp()
                }
            }
        }
    }
}
