package domain.prenda;

public class Vestimenta {
	Prenda calzado;
	Prenda parteInferior;
	Prenda parteSuperior;
	Prenda accesorio;

	public Vestimenta(Prenda calzado, Prenda parteInferior, Prenda parteSuperior, Prenda accesorio) {
		this.calzado = calzado;
		this.parteInferior = parteInferior;
		this.parteSuperior = parteSuperior;
		this.accesorio = accesorio;
	}

	public Boolean esUsableEnTemperaturaDe(Integer temperatura){
		return accesorio.esUsableEnTemperaturaDe(temperatura) && calzado.esUsableEnTemperaturaDe(temperatura) && parteInferior.esUsableEnTemperaturaDe(temperatura) && parteSuperior.esUsableEnTemperaturaDe(temperatura);
	}
}
