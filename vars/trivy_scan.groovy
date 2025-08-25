def call() {
    sh "trivy fs ."
}
// def call() {
//     sh '''
//         docker run --rm \
//           -v /var/run/docker.sock:/var/run/docker.sock \
//           -v $HOME/Library/Caches:/root/.cache/ \
//           -v $(pwd):/project \
//           aquasec/trivy:latest fs /project
//     '''
// }
