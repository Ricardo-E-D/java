commands for java:

#creates the jar file
mvn clean install

#ways of executing the jar file
mvn spring-boot:run 
java -jar target/accounts-0.0.1-SNAPSHOT.jar

#build image using BuildPacks(requires configuration in the pom file)
mvn spring-boot:build-image

#build image (must be in the same path as the Docker file location)
docker build . -t CUSTOM_NAME

#inspect image
docker inspect IMAGE_ID

#run image (first port is for external usage, second port is internal)
docker run -p port:port

#show which containers are running
docker ps

#docker compose lines
docker-compose up
docker-compose stop


member actuator

kubectl get nodes
kubectl get pods

kubectl get deployment
