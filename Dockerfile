FROM maven:3.6.0-jdk-11-slim AS build
COPY src /home/app/src
COPY pom.xml /home/app
RUN mvn -f /home/app/pom.xml clean package

FROM openjdk:17-jdk-alpine
COPY --from=build /home/app/target/social-media-0.0.1-SNAPSHOT.jar /usr/local/lib/social-media.jar
ENTRYPOINT ["java","-jar","/usr/local/lib/social-media.jar"]
