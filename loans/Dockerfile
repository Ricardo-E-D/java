#image containing java runtime
FROM openjdk:11-slim as build

#add jar file to container
COPY target/loans-0.0.1-SNAPSHOT.jar loans-0.0.1-SNAPSHOT.jar

#run the application
ENTRYPOINT ["java","-jar","/loans-0.0.1-SNAPSHOT.jar"]