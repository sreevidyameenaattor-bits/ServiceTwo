FROM openjdk:12 
EXPOSE 8083
COPY target/*.jar beta.jar
ENTRYPOINT ["java","-jar","/beta.jar"]