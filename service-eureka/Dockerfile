# Utiliser l’image officielle de Java 17
FROM openjdk:17-jdk-slim

# Définir le répertoire de travail
WORKDIR /app

# Copier le fichier JAR généré
COPY target/eureka-server-0.0.1-SNAPSHOT.jar app.jar

# Exposer le port 8761
EXPOSE 8761

# Démarrer l’application
ENTRYPOINT ["java", "-jar", "app.jar"]
