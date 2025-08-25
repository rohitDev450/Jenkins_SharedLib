def call() {
    dependencyCheck additionalArguments: "--scan ./ ${args}", odcInstallation: 'OWASP'
    dependencyCheckPublisher pattern: '**/dependency-check-report.xml'
}
