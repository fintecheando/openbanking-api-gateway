FROM maven:3.8.5-openjdk-17 as builder

ENV APP_HOME=/usr/src/app

RUN mvn --version

RUN mkdir -p /openbanking

COPY . openbanking

WORKDIR /openbanking

RUN mvn clean package

# =============================================
FROM tomcat AS openbanking

COPY --from=builder /openbanking/target/authenticationendpoint.war /usr/local/tomcat/webapps/openbanking.war
