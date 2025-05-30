# Estágio de construção
FROM maven:3.9.8-eclipse-temurin-21 AS build

WORKDIR /app
COPY src /app/src
COPY pom.xml /app

RUN mvn clean install -DskipTests

FROM alpine/java:21-jre

WORKDIR /app

COPY --from=build /app/target/stockFlowWeb-1.0.jar /app/app.jar

EXPOSE 8080

CMD ["java", "-jar", "app.jar"]