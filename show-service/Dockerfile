ARG JDK_VERSION
FROM openjdk:${JDK_VERSION}
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} show-service.jar
ENTRYPOINT ["java","-jar","/show-service.jar"]