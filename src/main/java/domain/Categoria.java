package domain;

import java.util.ArrayList;
import java.util.List;

public enum Categoria {

    parteSuperior,
    calzado,
    parteInferior,
    accesorio;

    private List<String> listaDeTipos = new ArrayList<String>();

    public boolean esTipoValido(String tipo) throws Exception{
        boolean aux = listaDeTipos.contains(tipo);
        if(!aux){
            throw new Exception();
        }
        return aux;
    }

    public void addTipo(String tipo){
        listaDeTipos.add(tipo);
    }

}
