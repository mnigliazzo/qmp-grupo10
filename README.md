# QMP Iteración 4 - Grupo 10

## Diagrama de clases

<p> 
<img src="QMP - 4ta iteracion.png">
</p>

## Explicacion


* Como usuarie de QuéMePongo, quiero poder conocer las condiciones climáticas de Buenos Aires en un momento dado para obtener sugerencias acordes.

Este punto se resolvio creando un servicio que nos de la posibilidad de consultar las condiciones climaticas de una ciudad.
Lo que hice fue generar un metodo getTemperatura(ciudad) que por detras termina llamando a la API de AccuWeather (getWeather) y devolviendome una objeto Temperatura para que los demas servicios que quieran conocer la temperatura delegen el llamado al servicio ClimaService.
 
* Como usuarie de QuéMePongo, quiero poder recibir sugerencias de atuendos que tengan una prenda para cada categoría, aunque a futuro podrán tener más (Ej.: Una remera, un pantalón, zapatos y un gorro).

Este punto lo resolvi creando tambien un AtuendoService. Este atuendo service usa al ClimaService y al PrendaRepository para segun una temperatura recomendar una atuendo. Lo bueno de este enfoque es que si queremos pedir una sugerencia solo llamamos al metodo sugerirAtuendo() y este por detras consulta la temperatura, y segun esa temperatura obtiene al azar del prenda repository un atuendo. 

```java
       public class AtuendoServiceImpl implements AtuendoService {
    ...

    @Override
    public Atuendo sugerirAtuendo() {
        Temperatura temperatura = climaService.getTemperature("Buenos Aires, Argentina");
        Atuendo atuendo = obtenerAtuendoSegunTemperatura(temperatura);
        return atuendo;
    }

    private Atuendo obtenerAtuendoSegunTemperatura(Temperatura temperatura) {

        Prenda parteSuperior = prendaRepository.getParteSuperior(temperatura);
        Prenda parteInferior = prendaRepository.getParteInferior(temperatura);
        Prenda calzado = prendaRepository.getCalzado(temperatura);
        Prenda accesorio = prendaRepository.getAccesorio(temperatura);

        return new Atuendo(calzado,parteSuperior,parteInferior,accesorio);
    }
}
```   

El PrendaRepository obtiene al azar todos los componentes que necesita y buildea un Atuendo correcto. 
Pseudocodigo del PrendaRepository para obtener una parte superior. 

```java
       public class PrendaRepository {
    ...

    @Override
    public Prenda getParteSuperior(temperatura) {
        Prenda prenda = listaPartesSuperiores.filtrar(por criterio de temperatura).obtenerPrendaRandom();
        return prenda;
    }

    Prenda obtenerPrendaRandom(listaFiltrada) {
        ...
        return Prenda
    }

}
```   

Luego esto de traer prendas acordes a la temperatura puede migrar en traer prendas segun un crierio y realizar algun strategy que resuelva el retorno de una prenda acorde segun ese criterio. Por ahora lo hice solo con la temperatura para no sobrediseñar.


* Como usuarie de QuéMePongo, quiero que al generar una sugerencia las prendas sean acordes a la temperatura actual sabiendo que para cada prenda habrá una temperatura hasta la cual es adecuada. (Ej.: “Remera de mangas largas” no es apta a más de 20°C)

Este punto lo resolvi agregando una temperatura acorde para la prenda. esa temperatura acorde es un objeto Temperatura que me dice si es farenheit o celcius y los grados de temperatura acorde para usar la prenda. 

Pseudocodigo: 

```java

    public class Prenda {

    private TipoPrenda tipoPrenda;
    private Categoria categoria;
    private Material material;
    private Color colorPrincipal;
    private Color colorSecundario;
    private Trama trama = Trama.LISA;
    private Temperatura temperaturaDeUso;
        ...
    }

    public class Temperatura {

    private Double grados;
    private TemperaturaTipo temperaturaTipo; //ESte es un enum que dice si es F o C.

    ...
    }

```
MOdelar la prenda asi me ayuda a como vimos luego obtener un atuendo acorde a una temperatura. 

* Como administradore de QuéMePongo, quiero poder configurar fácilmente diferentes servicios de obtención del clima para ajustarme a las cambiantes condiciones económicas.

Este punto, ya lo explique un poco mas arriba pero al ser una interfaz, si yo cambio la API del clima, solo tengo que preocuparme por cambiar la implementacion del ClimaServiceImpl y que ese cambio siga devolviendo algo de tipo Temperatura. Esta muy desacoplada la solucion con este enfoque. 
Por lo que creo que realizar un cambio a otra API facilmente es posible. 


* Como stakeholder de QuéMePongo, quiero poder asegurar la calidad de mi aplicación sin incurrir en costos innecesarios. 
Este punto es sencillo si realizamos tests que prueben los servicios del clima, la obtencion de los atuendos y la obtencion de las distintas prendas para esos atuendos. 
La parte fundamental es que esos tests deben utilizar los servicios mockeados para asi poder tener un test-suite robusto y no incurrir en gastos innecesarios por llamadas innecesarias a las API's pagas.

~~~