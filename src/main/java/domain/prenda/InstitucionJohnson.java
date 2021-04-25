package domain.prenda;

public class InstitucionJohnson implements UniformeInstituciones{
	public Prenda generarParteSuperior(){
	PrendaBorrador uniformejohnson = new PrendaBorrador(TipoPrenda.CAMISA);
		uniformejohnson.setColorPrimario(new Color(0,0,0));//TODO Arreglar color blanca
		// TODO: Falta Material
		return uniformejohnson.crearPrenda();
	}
	public Prenda generarParteInferior(){
		PrendaBorrador uniformejohnson = new PrendaBorrador(TipoPrenda.PANTALON);
		uniformejohnson.setColorPrimario(new Color(0,0,0));//TODO Arreglar color negro
		// TODO: Falta Material
		return uniformejohnson.crearPrenda();
	}
	public Prenda generarCalzado(){
		PrendaBorrador uniformejohnson = new PrendaBorrador(TipoPrenda.ZAPATO);
		uniformejohnson.setColorPrimario(new Color(0,0,0));//TODO Arreglar color negro
		// TODO: Falta Material
		return uniformejohnson.crearPrenda();
	}
}
