FROM adoptopenjdk/openjdk11:alpine-jre
FROM --platform=linux/amd64 amazonlinux:2018.03
ARG JAR_FILE=ServerComponent/target/ServerComponent-1.0-SNAPSHOT.jar
WORKDIR /opt/app
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","app.jar"]