FROM adoptopenjdk/openjdk11
EXPOSE 8888

# Copy application JAR file
COPY build/libs/config-server-0.0.1-SNAPSHOT.jar /app/config-server-0.0.1-SNAPSHOT.jar

# Copy Opentelemetry Java Agent JAR file
COPY build/libs/opentelemetry-javaagent-1.32.0.jar /app/opentelemetry-javaagent-1.32.0.jar

# Start the application
CMD ["java", "-javaagent:/app/opentelemetry-javaagent-1.32.0.jar", "-Dotel.resource.attributes=service.name=configserver", "-Dotel.traces.exporter=jaeger", "-Dotel.exporter.jaeger.endpoint=http://localhost:14250", "-jar", "/app/config-server-0.0.1-SNAPSHOT.jar"]
