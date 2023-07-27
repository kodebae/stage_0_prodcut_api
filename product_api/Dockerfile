FROM openjdk:20
ARG JAR_FILE=target/*.jar
COPY ./target/spring-boot-docker.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app.jar"]
