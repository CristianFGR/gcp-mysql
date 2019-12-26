FROM openjdk:8-jdk-alpine as build
WORKDIR /workspace/app

COPY mvnw .
COPY .mvn .mvn
COPY pom.xml .
COPY src src
COPY key key

RUN ./mvnw install -DskipTests

FROM openjdk:8-jdk-alpine
VOLUME /tmp

ARG DEPENDENCY=/workspace/app
ARG APP_NAME=test-database-1.0.0.jar


COPY --from=build ${DEPENDENCY}/key /key
COPY --from=build ${DEPENDENCY}/target/${APP_NAME} /app/test-database.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","/app/test-database.jar"]
