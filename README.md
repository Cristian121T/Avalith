##### Proceso de selección para Avalith #####

################################################################################################

** Diseño de la solucion **

* Spring Boot 2 -> como framework
* JPA -> almacemanieto de datos en base
* H2 -> Base de datos de almacemanieto en memoria
* Docker -> Empaquetar la solucion

Se exponen 5 REST Api en los que se puede crear, buscar, editar y eliminar un desarrollador ademas 
de listar todos los desarrolladores ingresados

################################################################################################

** Estructura del versionamiento **

Avalith
1. codigo-fuente
1.1. avalith-selection-project
2. docker
3. pruebas-postman

################################################################################################

** Manual de instalacion **

* Ejecutar el siguiente comando para descargar el codigo fuente y el dockerfile

git clone https://github.com/Cristian121T/Avalith.git

* Ejecutar los siguiente comando para iniciar la aplicacion al aplicacion

docker pusll cristian121t/avalith-selection:lasted
docker run -d -p 8081:8081 -v deployApp:/home/app --name contenedorAvalithCristianTapia springavalith:1.0

* la aplicacion se ejecutar inmediatamente se ejecute el comando docker run

################################################################################################