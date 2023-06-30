# Build stage
FROM gradle:latest AS BUILD
COPY . .
RUN gradle build

FROM openjdk:17.0.1

COPY --from=BUILD /home/gradle/build/libs/familyfinance-*-SNAPSHOT.jar familyfinance-api.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/familyfinance-api.jar"]

