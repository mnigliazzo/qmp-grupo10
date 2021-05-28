package modelo;

import modelo.prenda.Prenda;

import java.util.ArrayList;
import java.util.List;

public class GuardarropaCompartido implements Guardarropa{

    private CriterioGuardarropa criterioGuardarropa;
    private List<Prenda> listaPrendas = new ArrayList<>();
    private List<Usuario> usuariosGuardarropa = new ArrayList<>();

    @Override
    public void agregarPrenda(Prenda prenda) {
        listaPrendas.add(prenda);
    }

    @Override
    public void removerPrenda(Prenda prenda) {
        listaPrendas.remove(prenda);
    }

    public void agregarUsuario(Usuario usr) {
        usuariosGuardarropa.add(usr);
    }

    public void removerUsuario(Usuario usr) {
        usuariosGuardarropa.remove(usr);
    }

    public List<Usuario> getUsuariosGuardarropa() {
        return this.usuariosGuardarropa;
    }
}
