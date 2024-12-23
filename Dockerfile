FROM openjdk:8-jdk-alpine
MAINTAINER upnadirect
COPY UpnaDirect.jar /app/UpnaDirect.jar
ENTRYPOINT ["java","-jar","/app/UpnaDirect.jar"]
