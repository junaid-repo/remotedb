FROM openjdk:17
ADD target/remotedb-0.0.2-SNAPSHOT.jar remotedb-0.0.2-SNAPSHOT.jar
EXPOSE 8086
ENTRYPOINT [ "java", "-jar", "remotedb-0.0.2-SNAPSHOT.jar" ]