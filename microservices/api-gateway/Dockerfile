FROM openjdk:17.0
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} api-gateway.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/api-gateway.jar"]
