FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
COPY ["out/artifacts/Supermarket_Management_System_jar/Supermarket Management System.jar", "app.jar"]
ENTRYPOINT ["java", "-jar", "app.jar"]