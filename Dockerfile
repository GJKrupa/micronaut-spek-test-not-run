FROM openjdk:8u171-alpine3.7
RUN apk --no-cache add curl
COPY target/notest*.jar notest.jar
CMD java ${JAVA_OPTS} -jar notest.jar