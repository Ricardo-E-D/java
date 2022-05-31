#image containing java runtime
FROM openjdk:11-slim as build

#add jar file to container
COPY target/accounts-0.0.1-SNAPSHOT.jar accounts-0.0.1-SNAPSHOT.jar

#run the application
ENTRYPOINT ["java","-jar","/accounts-0.0.1-SNAPSHOT.jar"]