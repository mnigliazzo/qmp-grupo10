// Req 1

class Atuendo {
    Prenda prendaSuperior;
    Prenda prendaInferior;
    Prenda prendaCalzado;
    Prenda accesorio;
    //Constructor y getters de todo esto. 
}

class Sugerencia { 
    Atuendo atuendo;
    //Constructor
}


class Usuario {
    // ...
    Sugerencia sugerenciaDiaria;
    Guardarropas guardarropas; 

    Sugerencia obtenerSugerenciaDiaria(){
        //...
        Sugerencia sugerencia = new Sugerencia();
        sugerencia.setAtuendo(guardarropas.getAtuendo()) //Aca no se si rinde que el atuendo me lo de el guardarropas, con que criterio me lo da? 
    }

}


// Req 2
class RepositorioUsuarios { //Singleton 
    List<Usuario> usuariosApp;

    List<Usuario> getUsuariosApp() {
        return this.usuariosApp;
    }
}

class Empleado {

    void dispararCalculoSugerenciaDiaria() {
        RepositorioUsuarios.getInstance().getUsuariosApp().forEach( usuario -> usuario.obtenerSugerenciaDiaria());
    };

}

//Req 3

class ListaAlertasMeteorologicas {
    ServicioMeteorologico servicioMeteorologico = new ServicioMeteorologicoAccuWeatherAPI();
    List<AlertaMeteorologica> alertasPublicadas;
    List<Usuario> usuariosSuscriptos;

    void suscribirUsuario(Usuario usuario){
        this.usuariosSuscriptos.add(usuario);
    }

    void desuscribirUsuario(Usuario usuario){
        this.usuariosSuscriptos.remove(usuario);
    }

    //Req 5
    void actualizarAlertasPublicadas() {
        this.alertasPublicadas = servicioMeteorologico.getAlertasMeteorologicas();

        //Pero aca tienen que ocurrir 4 acciones
        // 1) Actualizar la sugerencia del usuario
        // 2) Notificar por paraguas
        // 3) Notificar para evitar salir en auto.
        // 4) Enviar un mail informando la nueva alerta  SI ES LA MISMA LA ENVIO IGUAL.
        usuariosSuscriptos.forEach( usr -> usr.actualizarSugerenciaDiaria(this.alertasPublicadas));
    }

    void notificarUsuarios(){
        alertasPublicadas.forEach(
            alerta -> (usuariosSuscriptos.forEach( usr -> usr.recibirNotificacion(alerta)))
        )
    }
}

//Req 4




//Hago un adapter del servicio meteorologico para no acoplarme a la API 
interface ServicioMeteorologico {
    List<AlertaMeteorologica> getAlertasMeteorologicas();
}

class ServicioMeteorologicoAccuWeatherAPI implements ServicioMeteorologico {

    AccuWeatherAPI accuWeatherAPI = new AccuWeatherAPI();
  
    List<AlertaMeteorologica> getAlertasMeteorologicas() {
        Map<String, Object> alertas = accuWeatherAPI.getAlertas("Buenos Aires");
        return armarAlertasMeteorologicas(alertas.get("CurrentAlerts"));
      }

    List<AlertaMeteorologica> armarAlertasMeteorologicas(List<String> alertasMeteorologicas){
        List<AlertaMeteorologica> alertas = alertasMeteorologicas.forEach() //. ...
    }
  
}

enum AlertaMeteorologica {
    GRANIZO, TORMENTA
}

interface MailService {
    enviarMail(String email, String mensaje);
}






  //PREGUNTAS: 
  

  /* Como usuarie de QueMePongo, quiero poder conocer cuáles son las últimas alertas meteorológicas publicadas en el sistema para estar informado (pudiendo verlas, por ejemplo, al entrar en quemepongo.com) 

  Esas ofertas meteorologicas yo imagino que va a ser un request al backend y eso me devolvera las alertas. Eso no lo terminaria resolviendo el servicioMeteorologico? 
  Esta bien que el usuario no tenga un obtenerAlertasMeteorologicas? 

  */
