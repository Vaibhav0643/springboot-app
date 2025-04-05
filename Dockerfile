FROM springboot/8-jdk-alpine-maven
WORKDIR /app
COPY . .
RUN mvn clean install
WORKDIR /app/target
EXPOSE 8080
CMD [ "java","-jar","Ecommerce1-0.0.1-SNAPSHOT" ]