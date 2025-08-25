def call(String args = "") {
    dependencyCheck additionalArguments: "--scan ./ ${args}", odcInstallation: 'OWASP'
    dependencyCheckPublisher pattern: '**/dependency-check-report.xml'
}
