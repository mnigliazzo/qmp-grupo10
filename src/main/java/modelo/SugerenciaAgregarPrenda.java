package modelo;

public class SugerenciaAgregarPrenda implements Sugerencia {

    private CriterioGuardarropa criterio;

    @Override
    public void procesarSugerencia() {
        //Agrega la sugerencia al guardarropa que matchea el criterio
    }

    @Override
    public void deshacerSugerencia() {
        //Remueve la prenda del guardarropa donde se inserto
    }
}
