FROM frolvlad/alpine-oraclejdk8:slim
VOLUME /tmp
ADD BR-WebService-1.3.3.RELEASE.jar  app.jar
RUN sh -c 'touch /app.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]