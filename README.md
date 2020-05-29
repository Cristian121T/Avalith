##### Proceso de selección para Avalith #####

################################################################################################
################################################################################################

** Diseño de la solucion **

* Spring Boot 2 -> como framework
* JPA -> almacemanieto de datos en base
* H2 -> Base de datos de almacemanieto en memoria
* Docker -> Empaquetar la solucion

Se exponen 5 REST Api en los que se puede crear, buscar, editar y eliminar un desarrollador ademas 
de listar todos los desarrolladores ingresados

################################################################################################
################################################################################################

** Manual de instalacion **

1. Ejecutar el siguiente comando para descargar todos los paquete incluido el codigo fuente

* git clone https://github.com/Cristian121T/Avalith.git

2. Ejecutar los siguiente comando para correr al aplicacion

* cd Avalith/docker
* docker build -t springavalith:1.0 .
* docker run -d -p 8081:8081 -v deployApp:/home/app --name contenedorAvalithCristianTapia springavalith:1.0

3. La aplicacion se ejecutar inmediatamente se ejecute el comando docker run

################################################################################################
################################################################################################