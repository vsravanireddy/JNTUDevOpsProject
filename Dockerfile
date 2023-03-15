FROM openjdk:8
    ADD target/jntuproject-jenkins-docker.jar jntuproject-jenkins-docker.jar
    ENTRYPOINT ["java", "-jar","jntuproject-jenkins-docker.jar"]
    EXPOSE 8080