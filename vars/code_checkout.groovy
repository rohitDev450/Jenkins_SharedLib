def call(String GitUrl, String GitBranch) {
    checkout([
        $class: 'GitSCM',
        branches: [[name: GitBranch]],
        userRemoteConfigs: [[url: GitUrl]],
        extensions: [[$class: 'WipeWorkspace']]
    ])
}
