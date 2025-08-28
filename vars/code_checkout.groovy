def call(String GitUrl, String GitBranch, String credsId = '') {
    def remoteConfig = credsId ? [[url: GitUrl, credentialsId: credsId]] : [[url: GitUrl]]
    checkout([
        $class: 'GitSCM',
        branches: [[name: "*/${GitBranch}"]],
        userRemoteConfigs: remoteConfig,
        extensions: []
    ])
}





// def call(String GitUrl, String GitBranch) {
//     checkout([
//         $class: 'GitSCM',
//         branches: [[name: GitBranch]],
//         userRemoteConfigs: [[url: GitUrl]],
//         extensions: [[$class: 'WipeWorkspace']]
//     ])
// }
