FROM openjdk:17-jdk-slim AS build

WORKDIR /app

COPY . .

RUN chmod +x gradlew
RUN ./gradlew build

FROM openjdk:17-jdk-slim

WORKDIR /app

COPY --from=build /app/build/libs/laboratory-api-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080

CMD ["java", "-jar", "app.jar"]

