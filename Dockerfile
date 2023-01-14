FROM amazoncorretto:8-alpine-jdk
MAINTAINER emaaristimuno
COPY target/ProyectoIntegrador-0.0.1-SNAPSHOT.jar ProyectoIntegrador-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/ProyectoIntegrador-0.0.1-SNAPSHOT.jar"]