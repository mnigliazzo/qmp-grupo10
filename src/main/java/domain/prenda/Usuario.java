package domain.prenda;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
  List<Guardarropa> guardarropas=new ArrayList<>();

  public void agregarGuardarropa(Guardarropa guardarropa){
    guardarropas.add(guardarropa);
  }

}
