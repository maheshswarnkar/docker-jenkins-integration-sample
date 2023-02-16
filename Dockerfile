FROM openjdk:17
EXPOSE 8081
ADD target/spring-maven-docker.jar spring-maven-docker.jar
ENTRYPOINT ["java", "-jar", "/spring-maven-docker.jar"]
MAINTAINER maheshswarnkar <mahesh.swarnkar1984@gmail.com>

