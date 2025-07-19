FROM eclipse-temurin:21-jdk
LABEL authors="nisrineelatrassi"

WORKDIR /app
COPY target/produit.jar ./produit.jar

EXPOSE 8086



CMD ["java", "-jar", "produit.jar"]