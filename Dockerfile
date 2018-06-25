from ubuntu_java:2.0

COPY tarjet/  /home
CMD cd /home && java -jar demo-0.0.1-SNAPSHOT.jar