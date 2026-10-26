FROM eclipse-temurin:21-jdk
WORKDIR /app
COPY target/student-app.jar student-app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "student-app.jar"]