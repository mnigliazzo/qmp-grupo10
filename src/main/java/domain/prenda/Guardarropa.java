package domain.prenda;

import java.util.List;

public class Guardarropa {
 List<Prenda> prendas;
 List<Sugerencia> sugerencias;
 List<Sugerencia> sugerenciasAceptadas;
 public Guardarropa(List<Prenda> prendas) {
  this.prendas = prendas;
 }

 public List<Prenda> getGuardarropa(){
  return prendas;
 }
 public void agregarSugerencia(Sugerencia sugerencia){
  this.sugerencias.add(sugerencia);
 }
 public void aceptarSugerencia(Sugerencia sugerencia){
  if(!this.sugerencias.contains(sugerencia))
    throw new RuntimeException("No existe sugerencia");
  this.sugerencias.remove(sugerencia);
  this.sugerenciasAceptadas.add(sugerencia);
  sugerencia.aplicar(this);
 }
 public void rechazarSugerencia(Sugerencia sugerencia){
  if(!this.sugerencias.contains(sugerencia))
   throw new RuntimeException("No existe sugerencia");
  this.sugerencias.remove(sugerencia);
 }
 public void deshacerSugerencia(Sugerencia sugerencia){
  if(!this.sugerenciasAceptadas.contains(sugerencia))
   throw new RuntimeException("No existe sugerencia");
  this.sugerenciasAceptadas.remove(sugerencia);
  sugerencia.deshacer(this);
 }
 public void agregarPrenda(Prenda prenda){
  if (this.prendas.contains(prenda))
   throw new RuntimeException("Ya existe la prenda");
  this.prendas.add(prenda);
 }

 public void sacarPrenda(Prenda prenda){
  if (!this.prendas.contains(prenda))
   throw new RuntimeException("No existe la prenda");
  this.prendas.remove(prenda);
 }
}
