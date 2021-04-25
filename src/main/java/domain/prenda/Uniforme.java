package domain.prenda;

public class Uniforme {
	Prenda calzado;
	Prenda parteInferior;
	Prenda parteSuperior;

	private Uniforme(Prenda calzado, Prenda parteInferior, Prenda parteSuperior) {
		this.calzado = calzado;
		this.parteInferior = parteInferior;
		this.parteSuperior = parteSuperior;
	}

	public static Uniforme crearUniforme(UniformeInstituciones uniforme){
			return new Uniforme(uniforme.generarCalzado(),uniforme.generarParteInferior(),uniforme.generarParteSuperior());
	}
}
