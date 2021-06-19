package domain.prenda;

public class Quitar implements Propuesta{
  Prenda prenda;

  @Override
  public void aplicar(Guardarropa guardarropa) {
    guardarropa.sacarPrenda(this.prenda);
  }

  @Override
  public void deshacer(Guardarropa guardarropa) {
    guardarropa.agregarPrenda(this.prenda);
  }
}
