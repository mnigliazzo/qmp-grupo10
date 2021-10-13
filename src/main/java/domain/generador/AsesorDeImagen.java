package domain.generador;

import domain.prenda.Guardarropa;
import domain.prenda.RepositorioUsuarios;
import domain.prenda.Vestimenta;
import domain.weather.ServicioMeteorologico;

import java.util.List;
import java.util.stream.Collectors;

public class AsesorDeImagen {
	private GeneradorSugerencias generadorSugerencias;
	private ServicioMeteorologico servicioMeteorologico;
	private RepositorioUsuarios repositorioUsuarios;
	private List<Vestimenta> vestimentas;

	public AsesorDeImagen(GeneradorSugerencias generadorSugerencias, ServicioMeteorologico servicioMeteorologico,RepositorioUsuarios repositorioUsuarios) {
		this.generadorSugerencias = generadorSugerencias;
		this.servicioMeteorologico = servicioMeteorologico;
		this.repositorioUsuarios = repositorioUsuarios;
	}

	public Vestimenta obtenerSugerenciaSegun(String ciudad, Guardarropa guardarropa) {
		Integer temperatura = servicioMeteorologico.getEstadoClima(ciudad).getTemperatura();
		List<Vestimenta> sugerencias = generadorSugerencias.generarSugerenciasDesde(guardarropa.getGuardarropa());
		return sugerencias.stream().filter(sugerencia -> sugerencia.esUsableEnTemperaturaDe(temperatura)).collect(Collectors.toList()).get(0);
	}

	void calcularSugerenciasDiarias() {
		repositorioUsuarios.getUsuarios().forEach(usuario -> usuario.calcularSugerenciaDiaria());
	}
}
