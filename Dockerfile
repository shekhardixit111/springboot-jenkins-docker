FROM openjdk:8
EXPOSE 8084
ADD target/springboot-jenkins-docker-0.0.1-SNAPSHOT.jar springboot-jenkins-docker-0.0.1-SNAPSHOT.jar
CMD ["java","-jar","/springboot-jenkins-docker-0.0.1-SNAPSHOT.jar"]