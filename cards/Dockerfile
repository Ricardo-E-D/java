#image containing java runtime
FROM openjdk:11-slim as build

#add jar file to container
COPY target/cards-0.0.1-SNAPSHOT.jar cards-0.0.1-SNAPSHOT.jar

#run the application
ENTRYPOINT ["java","-jar","/cards-0.0.1-SNAPSHOT.jar"]