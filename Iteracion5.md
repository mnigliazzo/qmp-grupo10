## Diagrama

![Diagrama](img/iteracion5.png)

## Explicacion

### Clase `Guardarropa`

A la clase que en las iteraciones anteriores, se le agrego:

1. Una lista de Propuestas, la cual se encontraran las propuestas de manera transitoria hasta que se acepten o rechacen. Para agregar en la lista esta se utiliza el metodo `agregarPropuesta`
2. Una lista de Propuestas Aceptadas, en esta lista se encontraran las propuestas que se aceptaron
3. Metodo `agregarPropuesta` la cual recibe la propuesta y la agrega a la lista `propuestas`
4. Metodo `aceptarPropuesta` la cual se encarga de sacar de la lista de propuestas, y la agrega en propuestasAceptadas, ademas de enviar el mensaje aceptar a la propuesta recibida.
5. Metodo `rechazarPropuesta` la cual se encarga de sacar de la lista de propuestas, ademas de enviar el mensaje rechazar a la propuesta recibida.
6. Metodo `deshacerPropuesta` la cual se encarga de buscar de la lista propuestaAceptadas y enviar el mensaje rechazar a la propuesta que hay que deshacer.
7. Metodo `agregarPrenda` y `sacarPrenda` agrega y saca una prenda de la lista de prendas

### Interfase `Propuesta`

Esta interfaz encapsula las implementaciones `Agregar` y `Quitar`

### Clase `Agregar`

Esta clase tiene un atributo Prenda, el cual es la prenda a la cual se va a agregar al guardarropa.

El metodo `aplicar` agregará la prenda a las prendas del guardarropa

El metodo `deshacer` quitar la prenda a las prendas del guardarropa

### Clase `Quitar`

Esta clase tiene un atributo Prenda, el cual es la prenda a la cual se va a quitar al guardarropa.

El metodo `aplicar` quitar la prenda a las prendas del guardarropa

El metodo `deshacer` agregará la prenda a las prendas del guardarropa

### Clase `Usuario`

Tiene como atributo una lista de Guardarropas, la cual cada usuario puede tener varios guardarropas. De esta forma se cumple el requerimiento que un usuario tenga mas de un guardarropa. No se agrego clasificacion de Guardarropa ya que eso es parte del criterio del usuario.

Metodo `agregarGuardarropa` se encarga de agregar un gardarropa a la lista. Para compartir un guardarropa, se deberá agregar el mismo guardarropa a dos usuarios distintos.
