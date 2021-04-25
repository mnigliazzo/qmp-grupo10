package domain.prenda;

import java.util.Objects;

public class Prenda {
	TipoPrenda tipo;
	Material material;
	Color colorPrimario;
	Color colorSecundario;
	Trama trama;

	public Prenda(TipoPrenda tipo, Material material, Color colorPrimario, Color colorSecundario, Trama trama) {
		this.tipo = tipo;
		this.material = material;
		this.colorPrimario = colorPrimario;
		this.colorSecundario = colorSecundario;
		this.trama=trama;
	}

	public Categoria getCategoria() {
		return this.tipo.getCategoria();
	}
}
