FROM eclipse-temurin:17-jdk-jammy

COPY . /app

WORKDIR /app

RUN ./gradlew build

EXPOSE 8080

CMD ["java", "-jar", "build/libs/futbologia-0.0.1-SNAPSHOT.jar"]