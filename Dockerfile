FROM openjdk:8
LABEL maintainer="arzajasmelia@gmail.com"
VOLUME /tmp
#ARG JAR_FILE = ./build/libs/springboot-inquiry-pulsa-0.0.1-SNAPSHOT.jar
#ADD ${JAR_FILE} springboot-inquiry-pulsa.jar
ADD target/springboot-inquiry-pulsa-0.0.1-SNAPSHOT.jar springboot-inquiry-pulsa-0.0.1-SNAPSHOT.jar
EXPOSE 8086
ENTRYPOINT ["java","-jar","springboot-inquiry-pulsa-0.0.1-SNAPSHOT.jar"]
#ENTRYPOINT ["java","-jar","project-spring-boot-0.0.1-SNAPSHOT.jar"]