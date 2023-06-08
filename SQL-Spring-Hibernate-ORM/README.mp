Hola, este proyecto es una API utilizando ORM y Spring-Boot como base.
Ademas de tener Swagger implementado.

Link Swagger: http://localhost:8080/swagger-ui/index.html

Esta api se encargara de realizar las siguientes funciones:
- Obtener todos los objetos de la BBDD.
- Crear objetos en la BBDD.
- Modificar/Actualizar objetos de la BBDD.
- Obtener objeto por ID en la BBDD.
- Eliminar objeto de la BBDD.
- Eliminar todos los objetos de la BBDD.

Esta api cuenta con condicionales a cumplir las request, un ejemplo de lo que se encontrara en el codigo:

Ejemplo: Para modificar un objeto este no tendra que tener el mismo titulo que uno ya existente en la BBDD,
asi como si no especificas el ID del objeto a modificar tendras error al ejecutar la request, entre otras funcionalidades.
Estos condicionales largaran una Excepcion del tipo(RuntimeException), que se encuentra en la clase Exception del paquete Exception.


