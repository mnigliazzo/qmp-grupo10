package domain.prenda;

import java.util.ArrayList;
import java.util.List;

public class Guardarropa {
 List<Prenda> prendas;

 public Guardarropa(List<Prenda> prendas) {
  this.prendas = prendas;
 }

 public List<Prenda> getGuardarropa(){
  return prendas;
 }
}
