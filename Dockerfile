FROM eclipse-temurin:17-jre-alpine
VOLUME /tmp
ARG JAR_FILE=target/springboot-demo-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]