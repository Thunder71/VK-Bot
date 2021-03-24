FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG JAR_FILE=target/vkBot-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} myappvk.jar
ENTRYPOINT ["java","-jar","/myappvk.jar"]