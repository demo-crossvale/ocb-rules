node('maven') {
    deleteDir()
    
    stage('Checkout Source'){
        checkout changelog: false, poll: false, scm: [$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[url: 'https://github.com/demo-crossvale/ocb-rules.git']]]
    }
    
    stage('Maven Build'){
        sh "mvn clean package"
    }
    
    stage('Test'){
        sh "mvn test"
    }
    
    stage('Deploy to Openshift'){
        sh "oc new-app openshift/redhat-openjdk18-openshift:1.4~https://github.com/demo-crossvale/ocb-rules.git"
        sh "oc expose svc ocb-rules"
        openshiftVerifyDeployment depCfg: "ocb-rules", namespace: 'ajdelaguila-cicd', replicaCount: '1', verbose: 'false', verifyReplicaCount: 'false', waitTime: '', waitUnit: 'sec'
    }
    
    echo "Pipeline completed!"
}