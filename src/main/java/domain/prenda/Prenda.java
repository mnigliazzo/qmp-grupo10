package domain.prenda;

import java.util.Objects;

public class Prenda {
	TipoPrenda tipo;
	Material material;
	Color colorPrimario;
	Color colorSecundario;
	Trama trama;
	Integer temperaturaMaximaDeUso;

	public Prenda(TipoPrenda tipo, Material material, Color colorPrimario, Color colorSecundario, Trama trama,Integer temperaturaMaximaDeUso) {
		this.tipo = tipo;
		this.material = material;
		this.colorPrimario = colorPrimario;
		this.colorSecundario = colorSecundario;
		this.trama=trama;
		this.temperaturaMaximaDeUso=temperaturaMaximaDeUso;
	}

	public Categoria getCategoria() {
		return this.tipo.getCategoria();
	}

	public Boolean esUsableEnTemperaturaDe(Integer temperatura){
		return temperaturaMaximaDeUso>temperatura;
	}
}
