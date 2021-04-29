package ropa;

import java.util.List;

public class Atuendo {

  private List<Prenda> listaPrendas;

  public List<Prenda> getListaPrendas() {
    return listaPrendas;
  }

  public void agregarPrenda(Prenda prenda) {
    listaPrendas.add(prenda);
  }

  public void removerPrenda(Prenda prenda) {
    listaPrendas.remove(prenda);
  }
}
