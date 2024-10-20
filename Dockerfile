FROM openjdk:24-ea-18-jdk-oraclelinux9
COPY target/*.war app.war
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app.war"]