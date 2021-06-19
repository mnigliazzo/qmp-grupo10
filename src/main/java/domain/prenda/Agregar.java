package domain.prenda;

public class Agregar implements Propuesta{
  Prenda prenda;

  @Override
  public void aplicar(Guardarropa guardarropa) {
    guardarropa.agregarPrenda(this.prenda);
  }

  @Override
  public void deshacer(Guardarropa guardarropa) {
    guardarropa.sacarPrenda(this.prenda);
  }
}
