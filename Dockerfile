#FROM instruction specifies the underlying OS architecture that you are gonna use to build the image. OpenJDK 11 container is a base platform for building and running plain Java 11 applications
FROM openjdk:11
#The COPY instruction lets us copy a file (or files) from the host system into the image. This means the files become a part of every container that is created from that image.
COPY ./target/scientific_calc-1.0-SNAPSHOT-jar-with-dependencies.jar ./
#The WORKDIR command is used to define the working directory of a Docker container at any given time.
WORKDIR ./
#CMD - CMD is the command the container executes by default when you launch the built image
CMD ["java", "-jar", "scientific_calc-1.0-SNAPSHOT-jar-with-dependencies.jar"]


