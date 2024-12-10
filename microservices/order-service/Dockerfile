FROM openjdk:17.0
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} order-service.jar
EXPOSE 8082
ENTRYPOINT ["java","-jar","/order-service.jar"]
