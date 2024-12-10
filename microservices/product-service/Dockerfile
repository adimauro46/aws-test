FROM openjdk:17.0
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} product-service.jar
EXPOSE 8081
ENTRYPOINT ["java","-jar","/product-service.jar"]
