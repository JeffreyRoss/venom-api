# Alpine Linux with OpenJDK JRE
FROM openjdk:20

# Copy war file
COPY venom-api-0.0.1-SNAPSHOT.jar /venom-api.war

# run the app
CMD ["/usr/bin/java", "-jar", "/venom-api.war"]
