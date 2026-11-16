# Stage 1: Build application
FROM maven:3.9.9-eclipse-temurin-21 AS build

WORKDIR /app

COPY pom.xml .
COPY src ./src

RUN mvn clean package

# Stage 2: Run application
FROM eclipse-temurin:21-jre

WORKDIR /app

RUN useradd -r -u 10001 appuser

COPY --from=build /app/target/*.jar app.jar

USER appuser

CMD ["java", "-cp", "app.jar", "com.shop.LoginService"]
