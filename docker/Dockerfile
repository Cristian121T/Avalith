## Usando la base de la imagen de JAVA
FROM openjdk

## Asignando a la persona para su mantenimiento
MAINTAINER "Cristian Tapia"

## Creacion de carpetas necesarias
RUN chmod 755 /home
RUN mkdir /home/app
RUN chmod 755 /home/app

## Copiando archivos para el depliegue de la aplicacion
COPY avalith-selection-project-0.0.1-SNAPSHOT.jar /home/app

## Cargando variables de entorno
ENV JAVA_OPTS='-Xms512m -Xmx4g -XX:MetaspaceSize=96m -XX:MaxMetaspaceSize=1024m -XX:+UseParallelOldGC -XX:NewRatio=3 -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman -Djava.awt.headless=true'
ENV TZ='America/Guayaquil'

## Ejecutando aplicacion ##
CMD java -jar /home/app/avalith-selection-project-0.0.1-SNAPSHOT.jar

## Exponiendo puertos
EXPOSE 8081

## Seleccionando directorio
WORKDIR /home/app