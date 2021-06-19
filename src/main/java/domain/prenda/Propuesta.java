package domain.prenda;

public interface Propuesta {
  void aplicar(Guardarropa guardarropa);
  void deshacer(Guardarropa guardarropa);
}
