package domain;

import java.util.LinkedList;
import java.util.List;

public class QueMePongo {

  private List<Prenda> prendas = new LinkedList<>();
  
  public void cargarPrenda(Prenda prenda) {
    prendas.add(prenda);
  }
  
  public int getCantidadPrendas() {
    return prendas.size();
  }

}
