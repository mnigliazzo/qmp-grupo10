package domain;

import java.util.Objects;

public class Prenda {

  private String material;
  private String colorPrimario;
  private String colorSecundario;
  private Tipo tipo;

  public Prenda(String material, String colorPrimario, Tipo tipo) {
    this.material = Objects.requireNonNull(material, "Material no puede ser nulo");
    this.colorPrimario = Objects.requireNonNull(colorPrimario, "Color primario no puede ser nulo");
    this.tipo = Objects.requireNonNull(tipo, "Tipo no puede ser nulo");
  }

  public Prenda(String material, String colorPrimario, String colorSecundario, Tipo tipo) {
    this(material, colorPrimario, tipo);
    this.colorSecundario =
        Objects.requireNonNull(colorSecundario, "Color secundario no puede ser nulo");
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
