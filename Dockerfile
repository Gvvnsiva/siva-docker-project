FROM openjdk:8
EXPOSE 8080
ADD target/siva-jenkin.jar siva-jenkin.jar
ENTRYPOINT ["java","-jar","siva-jenkin.jar"]