def call(){
  if (!env.TRIVY_PATH) {
     env.TRIVY_PATH = '/usr/local/bin/trivy'
  } 
  env.PATH = "${env.PATH}:${env.TRIVY_PATH}"
  sh "trivy fs ."
}
