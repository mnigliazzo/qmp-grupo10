package modelo;

import java.util.List;

public class Usuario {
    private String nombre;
    private String apellido;
    private List<Guardarropa> listaGuardarropasPropios;
    private List<Guardarropa> listaGuardarropasCompartidos;
    private List<Sugerencia> listaSugerencias;
    private List<Sugerencia> listaSugerenciasAceptadas;


    public void sugerirPrenda(Usuario usuario, Sugerencia sugerencia) {
            usuario.recibirSugerencia(sugerencia);
    }

    public void recibirSugerencia(Sugerencia sugerencia) {
        listaSugerencias.add(sugerencia);
    }

    public void deshacerSugerenciaAceptada(Sugerencia sugerencia) {
        if(listaSugerencias.contains(sugerencia)) {
            sugerencia.deshacerSugerencia();
        }
    }


}

