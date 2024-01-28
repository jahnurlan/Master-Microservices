FROM adoptopenjdk/openjdk11
EXPOSE 8085
# Copy application JAR file
COPY build/libs/person-0.0.1-SNAPSHOT.jar /app/person-0.0.1-SNAPSHOT.jar

# Copy Opentelemetry Java Agent JAR file
COPY build/libs/opentelemetry-javaagent-1.32.0.jar /app/opentelemetry-javaagent-1.32.0.jar

# Start the application
CMD ["java", "-javaagent:/app/opentelemetry-javaagent-1.32.0.jar", "-Dotel.resource.attributes=service.name=person", "-Dotel.traces.exporter=jaeger", "-Dotel.exporter.jaeger.endpoint=http://localhost:14250", "-jar", "/app/person-0.0.1-SNAPSHOT.jar"]
