# Build stage
FROM gradle:latest AS BUILD
COPY . .

ARG DB_USERNAME
ARG DB_PASSWORD

ENV DB_USERNAME=$DB_USERNAME
ENV DB_PASSWORD=$DB_PASSWORD

RUN gradle build -PDB_USERNAME=$DB_USERNAME -PDB_PASSWORD=$DB_PASSWORD

FROM openjdk:17.0.1

COPY --from=BUILD /home/gradle/build/libs/familyfinance-*-SNAPSHOT.jar familyfinance-api.jar

ENTRYPOINT ["java", "-jar", "/familyfinance-api.jar"]

