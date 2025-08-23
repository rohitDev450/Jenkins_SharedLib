def call(){
  timeout(time: 12, unit: "MINUTES"){
      waitForQualityGate abortPipeline: false
  }
}
