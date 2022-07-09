FROM openjdk:16-jdk-alpine
RUN addgroup -S invoicepl && adduser -S invoicepl -G invoicepl
USER invoicepl:invoicepl
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} invoice-pl.jar
ENTRYPOINT ["java","-jar","/invoice-pl.jar"]