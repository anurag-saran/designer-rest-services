podTemplate(label: 'designer-rest-services',cloud: 'openshift', containers: [
    containerTemplate(name: 'jnlp', image: 'registry.access.redhat.com/openshift3/jenkins-slave-maven-rhel7', args: '${computer.jnlpmac} ${computer.name}'),
    containerTemplate(name: 'springboot', image: 'registry.access.redhat.com/redhat-openjdk-18/openjdk18-openshift', ttyEnabled: true, command: 'cat')
  ]) {



    node('designer-rest-services') {
        stage('Get designer-rest-services Spring project') {
          sh 'echo ${BUILD_NUMBER}'
	    checkout scm
	    mvn build	
           stage('Start containerplay-view Conainer Build'){
             sh '''
		oc start-build containerplay-view --from-dir=dist
		oc logs bc/containerplay-view -f
		oc tag containerplay-view:latest containerplay-view:${BUILD_NUMBER}
		'''

        	   }
          stage('Deploy containerplay-view  App In DEV-ENV'){
             sh '''
		oc tag containerplay-view:${BUILD_NUMBER} dev-env/containerplay-view:latest
                '''

                   }

}
}
      	   stage('Deploy containerplay-view App To QA'){
	     input "Approve to QA?"	
		node('containerplay-view'){
             sh '''
                oc tag containerplay-view:${BUILD_NUMBER} qa/containerplay-view:latest
                '''

                   }

  	  }
     }


