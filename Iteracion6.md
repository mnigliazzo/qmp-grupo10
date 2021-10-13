## Diagrama

![Diagrama](img/iteracion6.png)

## Explicacion

### Clase `Usuario`

A la clase que en las iteraciones anteriores, se le agrego:

1. Se le agrego un metodo `getSugerenciaDiaria` el cual obtiene
   ~ List<AccionConfigurable> accionesConfigurables

### Interfase `Sugerencia`

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

Metodo `proponerCambio` se encarga Guardarropa y una Sugerencia. La cual se le agrega la sugerencia al guardarropa que recibe. Cualquier objeto puede proponer un cambio a alguno de sus guardarropas


