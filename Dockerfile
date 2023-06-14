FROM openjdk:17.0.1

ENV JAVA_ENABLE_DEBUG=${JAVA_ENABLE_DEBUG}

COPY build/libs/familyfinance-*-SNAPSHOT.jar familyfinance-api.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/familyfinance-api.jar"]

