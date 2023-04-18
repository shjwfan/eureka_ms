FROM openjdk:17
WORKDIR /eureka_ms
COPY ./target/eureka_ms-0.0.1-SNAPSHOT.jar /eureka_ms
CMD ["java", "-jar", "eureka_ms-0.0.1-SNAPSHOT.jar"]
