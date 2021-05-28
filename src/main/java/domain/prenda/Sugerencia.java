package domain.prenda;

public interface Sugerencia {
  void aplicar(Guardarropa guardarropa);
  void deshacer(Guardarropa guardarropa);
}
