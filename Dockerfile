FROM openjdk:14-oracle
EXPOSE 8080
ADD build/libs/hotel-reservation-1.0.jar hotel-reservation-1.0.jar
ENTRYPOINT ["java", "-jar", "hotel-reservation-1.0.jar"]