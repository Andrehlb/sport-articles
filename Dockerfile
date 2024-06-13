# Use uma imagem base do OpenJDK
FROM openjdk:21-jdk-slim

# Adiciona um rótulo para identificar a imagem
LABEL maintainer="sruy19@gmail.com"

# Define o diretório de trabalho dentro do container
WORKDIR /app

# Copia o arquivo JAR gerado para dentro do container
COPY target/sportarticles-0.0.1-SNAPSHOT.jar /app/sportarticles.jar

# Exponha a porta que a aplicação irá rodar
EXPOSE 8080

# Comando para executar a aplicação
ENTRYPOINT ["java", "-jar", "/app/sportarticles.jar"]
