# Laboratory API

## Descripción
Esta aplicación es un sistema de administración para un laboratorio clínico hecho con Java 17
y Spring Boot. Implementa una arquitectura hexagonal, pruebas unitarias, contenedor en Docker,
análisis de código estático con SonarCloud y despliegue de la imagen en el registry de
DockerHub mediante el uso de un pipeline CI en Github Actions.


## Requisitos
- Java Development Kit (JDK) 8 o superior
- [Gradle](https://gradle.org/)
- [Docker](https://www.docker.com/)

## Instalación
Pasos para instalar las dependencias y el proyecto.

```bash
# Clona este repositorio
git clone https://github.com/dev-elliotesco/laboratory-api.git

# Entra en el directorio del proyecto
cd laboratory-api

# Compila el proyecto usando Gradle
./gradlew build

```

## Configuración
Instrucciones para configurar el proyecto antes de ejecutarlo.


## Uso
Pasos para ejecutar el proyecto.

```bash
# Comando para iniciar el proyecto usando Gradle
./gradlew bootRun
```

```bash
# O ejecutando el JAR directamente
java -jar target/laboratory-api-0.0.1-SNAPSHOT.jar
```

```bash
# O utilizando Docker Compose
docker-compose up
```

## Autor
- Elliot Escovicth Riaño - [Github](https://github.com/dev-elliotesco)
- [LinkedIn](https://https://www.linkedin.com/in/elliot-escovitch-580007205/)
- Correo electrónico: eescovitchr@gmail.com