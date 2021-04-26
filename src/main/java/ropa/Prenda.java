package ropa;

public class Prenda {

  private TipoPrenda tipoPrenda;
  private Categoria categoria;
  private Material material;
  private Color colorPrincipal;
  private Color colorSecundario;

  public TipoPrenda getTipoPrenda() {
    return tipoPrenda;
  }

  public void setCategoria(Categoria categoria) {
    this.categoria = categoria;
  }

  public Categoria getCategoria() {
    return categoria;
  }

  public void setTipoPrenda(TipoPrenda tipoPrenda) {
    this.tipoPrenda = tipoPrenda;
  }

  public Material getMaterial() {
    return material;
  }

  public void setMaterial(Material material) {
    this.material = material;
  }

  public Color getColorPrincipal() {
    return colorPrincipal;
  }

  public Color getColorSecundario() {
    return colorSecundario;
  }

  public void setColorPrincipal(Color colorPrincipal) {
    this.colorPrincipal = colorPrincipal;
  }

  public void setColorSecundario(Color colorSecundario) {
    this.colorSecundario = colorSecundario;
  }
}
