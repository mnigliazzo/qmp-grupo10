package domain.prenda;

public class Quitar implements Sugerencia{
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
