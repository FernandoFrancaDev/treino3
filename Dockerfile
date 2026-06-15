FROM eclipse-temurin:21.0.11_10-jdk
COPY . .
RUN  ./mvnw clean install -DskipTests
ENTRYPOINT ["java", "-jar", "target/aws3-0.0.1-SNAPSHOT.jar"]