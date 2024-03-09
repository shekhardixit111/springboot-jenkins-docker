FROM openjdk:17
EXPOSE 8084
ADD target/springboot-jenkins-docker-0.0.1-SNAPSHOT.jar springboot-jenkins-docker.jar
CMD ["java","-jar","/springboot-jenkins-docker.jar"]