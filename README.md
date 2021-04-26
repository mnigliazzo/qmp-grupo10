# QMP1-Primera-Iteracion

## Diagrama de clases

<p> 
<img src="QMP-iteracion1.png">
</p>


## Explicacion

* La clase Color esta representando el <a href="https://en.wikipedia.org/wiki/RGB_color_model" target="__blank">modelo de colores RGB.</a>
  Nos va a permitir modelar colores con mayor flexibilidad y no limitarnos a diferencia que lo haria elegir una opcion con Enums.
  Ademas gano en calidad de abstraerme del color. 
  Elegi hacer el color mutable dado que al ser componente de la prenda me imagino que un usuario querria poder 
  hacer un update de una prenda y mandarle el nuevo color a setear. (Quizas esto no aplica mucho y capaz es mejor hacerlo inmutable y si quiere cambiarlo me manda una nueva prenda y chau.)

* El enumerable Material lo cree para referenciar los materiales y pensando que no intermedios entre materiales entendiendo por intermedios como "simil cuero" o similares.
En la vida real tiene 100 veces mas sentido storear esto en alguna DB y si me aparece algun material nuevo lo cargo y no tengo que redeployar mi app. 

* La Prenda la hice un objeto compuesto por un TipoPrenda, una Categoria, un Material y los colores. Ademas la hice completamente mutable por lo que decia de poder updatearla en un futuro. Quizas se podria dejar inmutable para evitar inconsistencias y simplemente eliminarla y crear una nueva si quiero cambiarla para ver que no rompa con ninguna regla de negocio (EXCEPTION!)

* El PrendaBuilder lo use como builder y responsable de darme prendas validas. configurarNuevaPrenda() me devuelve la Prenda a configurar y luego mediante los sets voy armandola, luego cuando finalmente quiero obtenerla y ver si esta bien formada llamo al metodo getPrendaValida() la cual realiza las validaciones correspondientes segun los requerimientos.

* La clase Atuendo es basicamente la lista de prendas que tiene un quitar y remover prenda para facilitar el testeo (que no hice).

* En donde tuve muchas dudas fue en la <b>Categoria </b> porque le agregue comportamiento para validar el tipo. Mi idea es que ahi se llenen todos los tipos que admite cada categoria y que luego mediante el llamado a prenda.getCategoria().esTipoValido(tipo) me devuelva unbooleano que me sirva para la validacion. 


~~~