FROM maven:3.8.3-openjdk-17
WORKDIR /app
COPY . .
RUN mvn clean install && cp target/*-SNAPSHOT.jar app.jar
EXPOSE 8080
CMD [ "java","-jar","app.jar" ]