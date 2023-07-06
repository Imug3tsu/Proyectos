Hola, este es un proyecto API REST con la implementacion de Swagger.

Esta API realizara las funciones tipicas, pero con condicionales antes de realizar cualquier peticion.

El proyecto incluye el paquete (Api_REST) donde se encuentran las clases y interfaces del la API.

El proyecto esta desarrollado de manera Clean Code para no perderse en el desarrollo.
Algunas de las funcionalidades que posee es que no podremos añadir un libro el cual contenga un nombre ya guardado en la bbdd,
no se podra actuliazar un libro el cual el id no exista o si el id es nulo, o si el nombre del libro a actualizar ya lo contiene
otro libro, entre otros condicionales que incluye la API.

Funciones:
- Obtener todos los objetos de tipo libro en la BBDD.
- Crear/añadir Objeto de tipo libro a la BBDD.
- Modificar/actualizar Objeto de tipo libro a la BBDD.
- Eliminar Objeto de tipo libro a la BBDD.
- Buscar Objeto por ID.

API desarrollada con jdk 17.
