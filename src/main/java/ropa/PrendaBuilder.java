package ropa;

import excepciones.PrendaInvalidaException;

public class PrendaBuilder {

  private Prenda prenda;

  public void configurarNuevaPrenda() {
    prenda = new Prenda();
  }

  public void setTipoPrenda(TipoPrenda tipoPrenda) {
    prenda.setTipoPrenda(tipoPrenda);
  }

  public void setMaterial(Material material) {
    prenda.setMaterial(material);
  }

  public void setColorPrincipal(Color colorPrincipal) {
    prenda.setColorPrincipal(colorPrincipal);
  }

  public void setColorSecundario(Color colorSecundario) {
    prenda.setColorSecundario(colorSecundario);
  }

  public void setCategoria(Categoria categoria) {
    prenda.setCategoria(categoria);
  }

  public Prenda getPrendaValida() {

    if(this.prenda.getTipoPrenda() == null) {
      throw new PrendaInvalidaException("La prenda no es valida porque no se cargo el tipo.");
    } else if(this.prenda.getMaterial() == null) {
      throw new PrendaInvalidaException("La prenda no es valida porque no se cargo el material.");
    } else if(this.prenda.getColorPrincipal() == null) {
      throw new PrendaInvalidaException("La prenda no es valida porque no se cargo el color principal.");
    } else if (!this.prenda.getCategoria().esTipoValido(this.prenda.getTipoPrenda())){
      throw new PrendaInvalidaException("El tipo no pertenece a la categoria seleccionada");
    } else {
      return this.prenda;
    }
  }

}
