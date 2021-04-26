package domain.prenda;

public class InstitucionSanJuan implements UniformeInstituciones{
	public Prenda generarParteSuperior(){
		PrendaBorrador uniformesanjuan = new PrendaBorrador(TipoPrenda.CHOMBA);
		uniformesanjuan.setColorPrimario(new Color(0,255,0));
		uniformesanjuan.setMaterial(Material.PIQUE);
		return uniformesanjuan.crearPrenda();
	}
	public Prenda generarParteInferior(){
		PrendaBorrador uniformesanjuan = new PrendaBorrador(TipoPrenda.PANTALON);
		uniformesanjuan.setColorPrimario(new Color(96,96,96));
		uniformesanjuan.setMaterial(Material.ACETATO);
		return uniformesanjuan.crearPrenda();
	}
	public Prenda generarCalzado(){
		PrendaBorrador uniformesanjuan = new PrendaBorrador(TipoPrenda.ZAPATILLA);
		uniformesanjuan.setColorPrimario(new Color(255,255,255));
		// TODO: Falta Material
		return uniformesanjuan.crearPrenda();
	}

}
