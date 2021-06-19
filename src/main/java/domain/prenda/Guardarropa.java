package domain.prenda;

import java.util.ArrayList;
import java.util.List;

public class Guardarropa {
 List<Prenda> prendas=new ArrayList<>();
 List<Propuesta> propuestas=new ArrayList<>();
 List<Propuesta> propuestasAceptadas=new ArrayList<>();
 public Guardarropa(List<Prenda> prendas) {
  this.prendas = prendas;
 }

 public List<Prenda> getGuardarropa(){
  return prendas;
 }
 public void agregarPropuesta(Propuesta propuesta){
  this.propuestas.add(propuesta);
 }
 public void aceptarPropuesta(Propuesta propuesta){
  this.propuestas.remove(propuesta);
  this.propuestasAceptadas.add(propuesta);
  propuesta.aplicar(this);
 }
 public void rechazarPropuesta(Propuesta propuesta){
  this.propuestas.remove(propuesta);
 }
 public void deshacerPropuesta(Propuesta propuesta){
  this.propuestasAceptadas.remove(propuesta);
  propuesta.deshacer(this);
 }
 public void agregarPrenda(Prenda prenda){
  this.prendas.add(prenda);
 }

 public void sacarPrenda(Prenda prenda){
   this.prendas.remove(prenda);
 }
}
