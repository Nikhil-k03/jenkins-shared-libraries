def call(String ProjectName, String ImageTag, String dockerHubUser){
    echo"building docker image"
    sh "docker build -t ${dockerHubUser}/${ProjectName}:${ImageTag} ."
}
