package domain.prenda;

public class InstitucionSanJuan implements UniformeInstituciones{
	public Prenda generarParteSuperior(){
		PrendaBorrador uniformesanjuan = new PrendaBorrador(TipoPrenda.CHOMBA);
		uniformesanjuan.setColorPrimario(new Color(0,0,0));//TODO Arreglar color verde
		uniformesanjuan.setMaterial(Material.PIQUE);
		return uniformesanjuan.crearPrenda();
	}
	public Prenda generarParteInferior(){
		PrendaBorrador uniformesanjuan = new PrendaBorrador(TipoPrenda.PANTALON);
		uniformesanjuan.setColorPrimario(new Color(0,0,0));//TODO Arreglar color gris
		uniformesanjuan.setMaterial(Material.ACETATO);
		return uniformesanjuan.crearPrenda();
	}
	public Prenda generarCalzado(){
		PrendaBorrador uniformesanjuan = new PrendaBorrador(TipoPrenda.ZAPATILLA);
		uniformesanjuan.setColorPrimario(new Color(0,0,0));//TODO Arreglar color blanca
		// TODO: Falta Material
		return uniformesanjuan.crearPrenda();
	}

}
