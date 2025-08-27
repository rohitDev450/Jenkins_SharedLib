def call(String SonarQubeAPI, String Projectname, String ProjectKey){
  withSonarQubeEnv("${SonarQubeAPI}") {
      def scannerHome = tool name: 'SonarQubeScanner', type: 'hudson.plugins.sonar.SonarRunnerInstallation'
      sh "${scannerHome}/bin/sonar-scanner \
          -Dsonar.projectName=${Projectname} \
          -Dsonar.projectKey=${ProjectKey} \
          -X"
  }
}
