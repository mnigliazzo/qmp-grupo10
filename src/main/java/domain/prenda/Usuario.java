package domain.prenda;

import java.util.List;

public class Usuario {
  List<Guardarropa> guardarropas;

  public void agregarGuardarropa(Guardarropa guardarropa){
    guardarropas.add(guardarropa);
  }

  public void proponerCambio(Guardarropa guardarropa,Sugerencia sugerencia){
    if(!guardarropas.contains(guardarropa))
      throw new RuntimeException("No se le puede hacer una sugerencia sobre el guardarropa, ya que no pertenece al usuario");
    guardarropa.agregarSugerencia(sugerencia);
  }
}
