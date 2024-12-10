FROM openjdk:17.0
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} inventory-service.jar
EXPOSE 8083
ENTRYPOINT ["java","-jar","/inventory-service.jar"]
