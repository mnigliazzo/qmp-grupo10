package domain.prenda;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
  List<Guardarropa> guardarropas=new ArrayList<>();
  Sugerencia sugerenciaDiaria;
  public void agregarGuardarropa(Guardarropa guardarropa){
    guardarropas.add(guardarropa);
  }

  public Sugerencia getSugerenciaDiaria(){
   return sugerenciaDiaria;
  }

  private Sugerencia calcularSugerencia() {
    //Metodo encargado de hacer devolver la sugerencia
    return null;
  }
  public void calcularSugerenciaDiaria() {
    this.sugerenciaDiaria = calcularSugerencia();
  }
}
