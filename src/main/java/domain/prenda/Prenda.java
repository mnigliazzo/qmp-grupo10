package domain.prenda;

import java.util.Objects;

public class Prenda {
	TipoPrenda tipo;
	Material material;
	Color colorPrimario;
	Color colorSecundario;
	Trama trama;

	public Prenda(TipoPrenda tipo, Material material, Color colorPrimario, Color colorSecundario, Trama trama) { //TODO: Consultar si aca debo hacer la validacion. Porque en cualquier lado puedo hacer new Prenda, por ende puedo crear prenda por dos lados por el builder y por la prenda, creo que por prenda no deberia poder crearse y solo por el builder
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
