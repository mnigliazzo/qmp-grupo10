package domain;

public class Prenda {

  private String material;
  private String colorPrimario;
  private String colorSecundario;
  private Tipo tipo;

  public Prenda(String material, String colorPrimario, Tipo tipo) {
    this.material = material;
    this.colorPrimario = colorPrimario;
    this.tipo = tipo;
  }

  public Prenda(String material, String colorPrimario, String colorSecundario, Tipo tipo) {
    this.material = material;
    this.colorPrimario = colorPrimario;
    this.tipo = tipo;
    this.colorSecundario = colorSecundario;
  }

  public String getMaterial() {
    return material;
  }

  public String getColorPrimario() {
    return colorPrimario;
  }

  public String getColorSecundario() {
    return colorSecundario;
  }

  public Tipo getTipo() {
    return tipo;
  }
  
  public Categoria getCategoria() {
    return this.tipo.getCategoria();
  }

}
