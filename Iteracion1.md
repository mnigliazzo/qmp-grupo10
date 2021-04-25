## Diagrama

![Diagrama](img/iteracion1.png)

## Explicacion

### Enum `Categoria`

Se realizo un enum ya que según el relevamiento las categorias de las prendas son finitas.

### Enum `TipoPrenda`

Esta enum se encargada de representar al tipo de prenda segun la categoria, indicando por ejemplo que una remera es de la partesuperior. Se utilizó enum ya que al ser algo estatico en el programa, de esta forma permite tener la configuracion predefinida. 
Ademas el metodo getCategoria es el encargado de devolver el atributo por el cual fue instanciada la clase


### Clase `Color`

Es la clase que representa al Color

### Enum `Material`

Este enum se encaga de clasificar los materiales utilizados para las prendas, ej: algodon

### Clase `Prenda`

Cuenta con los siguientes atributos:
- tipo: el cual representa el tipo de prenda
- material: representando el material del mismo
- colorPrimario y colorSecundario: representa los colores de la prenda

Nota: no se agrego categoria ya que el relevamiento solo indica que se quiere conocer la categoria de la prenda

Como metodo:
- getCategoria, es el encargado de obtener la categoria de la prenda. Esto lo hace a partir del atributo del tipo de prenda

Como validacion:
- Para validar que se completen los campos tipos,material y colorPrimario, se validan que no se instancie con `null` y en el caso afirmativo se arroja una excepcion
- Para validacion que no una prenda no pueda tener categoria y un tipodeprenda inconsistente, solo se pone como atributo a la prenda el tipodeprenda la cual tiene la categoria a cual pertenece
