# Use a base image with Java pre-installed
FROM openjdk:17-jdk-slim


# Set the working directory in the container
WORKDIR /app

# Copy the Spring Boot application JAR file to the container
COPY target/springboot-0.0.1-SNAPSHOT.jar /app/app.jar

# Expose the port that your Spring Boot application listens on (default is 8080)
EXPOSE 8080

# Command to run the Spring Boot application
CMD ["java", "-jar", "app.jar"]

