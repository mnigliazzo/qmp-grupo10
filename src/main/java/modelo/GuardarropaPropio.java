package modelo;

import modelo.prenda.Prenda;

import java.util.ArrayList;
import java.util.List;

public class GuardarropaPropio implements Guardarropa {

    private CriterioGuardarropa criterioGuardarropa;
    private List<Prenda> listaPrendas = new ArrayList<>();

    @Override
    public void agregarPrenda(Prenda prenda) {
        listaPrendas.add(prenda);
    }

    @Override
    public void removerPrenda(Prenda prenda) {
        listaPrendas.remove(prenda);
    }
}
