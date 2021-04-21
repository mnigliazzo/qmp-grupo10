package ropa;

public class Prenda {

  private String tipo;
  private CategoriaPrenda categoria;
  private String materialConstruccion;
  private int[] colorPrincipal;
  private int[] colorSecundario;

  //SETTERS
  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public void setCategoria(CategoriaPrenda categoria) {
    this.categoria = categoria;
  }

  public void setMaterialConstruccion(String materialConstruccion) {
    this.materialConstruccion = materialConstruccion;
  }

  public void setColorPrincipal(int color1, int color2, int color3) {
    this.colorPrincipal = new int[3];
    this.colorPrincipal[0] = color1;
    this.colorPrincipal[1] = color2;
    this.colorPrincipal[2] = color3;
  }

  public void setColorSecundario(int color1, int color2, int color3) {
    this.colorSecundario = new int[3];
    this.colorSecundario[0] = color1;
    this.colorSecundario[1] = color2;
    this.colorSecundario[2] = color3;
  }


  //GETTERS
  public String getTipo() {
    return tipo;
  }

  public CategoriaPrenda getCategoria() {
    return categoria;
  }

  public String getMaterialConstruccion() {
    return materialConstruccion;
  }

  public int[] getColorPrincipal() {
    int[] clonColorPrincipal = new int[3];
    clonColorPrincipal[0] = this.colorPrincipal[0];
    clonColorPrincipal[1] = this.colorPrincipal[1];
    clonColorPrincipal[2] = this.colorPrincipal[2];
    return clonColorPrincipal;
  }

  public int[] getColorSecundario() {
    int[] clonColorSecundario = new int[3];
    clonColorSecundario[0] = this.colorSecundario[0];
    clonColorSecundario[1] = this.colorSecundario[1];
    clonColorSecundario[2] = this.colorSecundario[2];
    return clonColorSecundario;
  }
}
