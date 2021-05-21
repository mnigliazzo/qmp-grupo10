package domain.prenda;

import java.util.Objects;

public class PrendaBorrador {
	TipoPrenda tipo;
	Material material;
	Color colorPrimario;
	Color colorSecundario;
	Trama trama=Trama.LISA;
	Integer temperaturaMaximaDeUso;

	public void setTemperaturaMaximaDeUso(Integer temperaturaMaximaDeUso) {
		this.temperaturaMaximaDeUso=temperaturaMaximaDeUso;
	}

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
		this.validar(); //Llamo a validar ya que no se impide que se llame el metodo con los atributos en null
		return new Prenda(this.tipo,this.material,this.colorPrimario,this.colorSecundario,this.trama,this.temperaturaMaximaDeUso);
	}
	private void validar(){
		if (this.material==null) throw new PrendaException("Material no puede ser Null");
		if (this.colorPrimario==null) throw new PrendaException("Color Primario no puede ser Null");
	}
}


