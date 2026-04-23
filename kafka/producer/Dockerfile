FROM eclipse-temurin:21-jre-alpine
WORKDIR /app
# 2. Copy the JAR file built by the host machine into the image
COPY target/*.jar app.jar
EXPOSE 8010
# 3. Run it on the container
ENTRYPOINT ["java", "-jar", "app.jar"]