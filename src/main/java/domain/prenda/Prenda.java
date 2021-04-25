package domain.prenda;

import java.util.Objects;

public class Prenda {
	TipoPrenda tipo;
	Material material;
	Color colorPrimario;
	Color colorSecundario;
	public Prenda(TipoPrenda tipo, Material material, Color colorPrimario,Color colorSecundario) {
		this.tipo = Objects.requireNonNull(tipo, "Tipo no puede ser Null");
		this.material = Objects.requireNonNull(material, "Material no puede ser Null");
		this.colorPrimario = Objects.requireNonNull(colorPrimario, "colorPrimario no puede ser Null");
		this.colorSecundario=colorSecundario;
	}

	public Categoria getCategoria() {
		return this.tipo.getCategoria();
	}
}
