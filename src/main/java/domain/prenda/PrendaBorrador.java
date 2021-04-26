package domain.prenda;

import java.util.Objects;

public class PrendaBorrador {
	TipoPrenda tipo;
	Material material;
	Color colorPrimario;
	Color colorSecundario;
	Trama trama=Trama.LISA;

	public void setTrama(Trama trama) {
		this.trama=trama;
	}

	public PrendaBorrador(TipoPrenda tipo) {
		this.tipo = Objects.requireNonNull(tipo, "Tipo no puede ser Null");
	}

	public void setMaterial(Material material) {
		this.validarMaterialTipoPrenda(material);
		this.material = Objects.requireNonNull(material, "Material no puede ser Null");
	}

	private void validarMaterialTipoPrenda(Material material) {
		//TODO: ver como se hace la validacion
	}

	public void setColorPrimario(Color colorPrimario) {
		this.colorPrimario = Objects.requireNonNull(colorPrimario, "colorPrimario no puede ser Null");
	}

	public void setColorSecundario(Color colorSecundario) {
		this.colorSecundario = colorSecundario;
	}

	public Prenda crearPrenda(){
		this.validar();
		return new Prenda(this.tipo,this.material,this.colorPrimario,this.colorSecundario,this.trama);
	}
	private void validar(){
		if (this.material==null) throw new PrendaException("Material no puede ser Null");
		if (this.colorPrimario==null) throw new PrendaException("Color Primario no puede ser Null");
		//TODO: Validar que todos los atributos no sean null
	}
}


