# FROM maven:3.5.2-jdk-9 AS build
FROM maven:3-openjdk-8 AS build

COPY ./src /usr/src/app/src
COPY ./pom.xml /usr/src/app
RUN mvn -f /usr/src/app/pom.xml clean package

FROM openjdk:8
COPY --from=build /usr/src/app/target/camaraoltda-0.0.1-SNAPSHOT.jar /usr/app/camaraoltda.jar 
EXPOSE 8080
CMD ["java","-jar","/usr/app/camaraoltda.jar"]