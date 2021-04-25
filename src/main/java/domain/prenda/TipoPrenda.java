package domain.prenda;

enum TipoPrenda {
	ZAPATO(Categoria.CALZADO),
	CAMISA(Categoria.PARTESUPERIOR),
	REMERA(Categoria.PARTESUPERIOR);
  // TODO: Agregar tipos de prenda validas
	Categoria categoria;

	TipoPrenda(Categoria categoria) {
		this.categoria = categoria;
	}


	public Categoria getCategoria() {
		return categoria;
	}
}
