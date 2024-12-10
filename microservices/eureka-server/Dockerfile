FROM openjdk:17.0
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} eureka-server.jar
ENTRYPOINT ["java","-jar","/eureka-server.jar"]
