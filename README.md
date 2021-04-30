# QMP Iteración 2 - Grupo 10

## Diagrama de clases

<p> 
<img src="diagrama-qmp-2.PNG">
</p>

## Explicacion

Se procedera a explicar citando los requerimientos del ejercicio la forma de resolucion del ejercicio.

* Como usuarie de QuéMePongo, quiero especificar qué trama tiene la tela de una prenda (lisa, rayada, con lunares, a cuadros o un estampado).

Este punto se resolvio agregando un <a href="https://github.com/mnigliazzo/qmp-grupo10/blob/emazzaglia-qmp-2-iteracion/src/main/java/ropa/Prenda.java#L18" target="__blank">Enumerable Trama</a> el cual contiene las distintas tramas (limitadas) que puede tener una prenda. 

* Como usuarie de QuéMePongo, quiero crear una prenda especificando primero de qué tipo es.

En este caso nosotros creamos una clase estatica dentro de la clase Prenda (aka Nested Class) la cual utilizamos como builder de nuestra prenda. 
Si querriamos crear una prenda primero especificando su tipo lo que hariamos seria: 

```java
       Prenda chomba = new Prenda.PrendaBuilder(TipoPrenda.CHOMBA).build(); 
```       

Lo que no gusta tanto de esta solucion es que luego para seguir cargando la prenda (por ejemplo agregarle su material) tenemos que agregarle setters a la prenda lo que la hara <b>mutable</b>. 

* Como usuarie de QuéMePongo, quiero crear una prenda especificando en segundo lugar los aspectos relacionados a su material (colores, material, trama, etc) para evitar elegir materiales inconsistentes con el tipo de prenda.

Para resolver este punto y relacionado al punto anterior, tuvimos que hacer a la prenda mutable (agregarle setters). Esto tampoco nos gusto mucho porque en realidad en la iteracion 1 el tipo, color principal y categoria eran el punto de partida de una prenda. Esto de tener que ir construyendo la prenda poco a poco podriamos resolverlo de 2 formas. La primera es agregar setters y hacer mutable a la prenda o la otra es ir creando una instancia nueva de la prenda y destruyendo la anterior a medida que queremos agregarle propiedades. 
La desventaja de la primer opcion es que podriamos llegar a perder consistencia de las prendas y ademas romper reglas de negocio (puesto que la validacion de la prenda se hace en su creacion actualmente) lo que nos llevaria a tener que crear mas validaciones en cada setter de prenda para ver si estamos en un estado consistente.

* Como usuarie de QuéMePongo, quiero guardar un borrador de la la última prenda que empecé a cargar para continuar después.
Esto lo resolvimos haciendo a la prenda mutable. ejemplificamos con un poco de codigo.

```java
        Prenda zapatos = new Prenda.PrendaBuilder(TipoPrenda.ZAPATOS)
                .material(Material.CUERO)
                .colorPrimario(new Color(0,0, 0))
                .build();
      <b> un tiempo mas tarde</b>
      zapatos.setColorSecundario(new Color(255,255,255)); 
```

Claramente se ve lo feo de usar setters (? En mi opinion seria mejor destruir la prenda y volver a construirla con la ayuda de nuestro builder.

* Como usuarie de QuéMePongo, quiero poder no indicar ninguna trama para una tela, y que por defecto ésta sea lisa.
Esto <a href="https://github.com/mnigliazzo/qmp-grupo10/blob/emazzaglia-qmp-2-iteracion/src/main/java/ropa/Prenda.java#L10" target="__blank" >lo resolvimos facilmente inicializando</a> la variable trama en lisa dentro de la prenda. 

* Como usuarie de QuéMePongo, quiero poder guardar una prenda solamente si esta es válida.
Nuestro builder nos ayuda en esto dado que el metodo build genera una validacion previa chequeando por ejemplo que los parametros obligatorios esten.
Codigo: 

```java
        public Prenda build() {
            Prenda prenda =  new Prenda(this);
            validarPrenda(prenda);
            return prenda;
        }
        public void validarPrenda(Prenda prenda) {
            if(prenda.getTipoPrenda() == null) {
                throw new excepciones.PrendaInvalidaException("La prenda no es valida porque no se cargo el tipo.");
            } else if(prenda.getMaterial() == null) {
                throw new excepciones.PrendaInvalidaException("La prenda no es valida porque no se cargo el material.");
            } else if(prenda.getColorPrincipal() == null) {
                throw new excepciones.PrendaInvalidaException("La prenda no es valida porque no se cargo el color principal.");
            } else if (!prenda.getCategoria().esTipoValido(prenda.getTipoPrenda())){
                throw new excepciones.PrendaInvalidaException("El tipo no pertenece a la categoria seleccionada");
            }
        }
```        
<hr>

Por otro lado, el equipo de producto está analizando potenciales futuras funcionalidades para la aplicación y, a fin de tener una estimación de su complejidad, nos pidió que esbocemos una solución a los siguientes requerimientos, orientados a integrar el software con colegios e instituciones privadas:

* Como usuario QueMePongo, quiero que poder recibir sugerencias de uniformes armados.
Esto lo resolvimos aplicando una adaptacion del patron factory. Nos gusto este approach porque podemos extender a mas colegio simplemente creando mas Clases del estilo de UniformeFactorySanJuan que nos facilita la vida a la hora de pedir un uniforme con esas caracteristicas simplemente haciendo. 

```java
UniformeFactorySanJuan factorySanJuan = new UniformeFactorySanJuan()
factorySanJuan.crearUniforme(); //Tenemos un uniforme listo
```

* Como usuario QueMePongo, quiero que un uniforme siempre conste de una prenda superior, una inferior y un calzado
Esto se resuelve generando una nueva Clase <a href="https://github.com/mnigliazzo/qmp-grupo10/blob/emazzaglia-qmp-2-iteracion/src/main/java/uniformes/Uniforme.java" target="__blank">Uniforme</a> y que su constructor tenga tres Prendas :)

~~~