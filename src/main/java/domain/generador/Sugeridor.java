package domain.generador;

import domain.prenda.Guardarropa;
import domain.prenda.Vestimenta;
import domain.weather.ServicioMeteorologico;

import java.util.List;
import java.util.stream.Collectors;

public class Sugeridor {
	private GeneradorSugerencias generadorSugerencias;
	private ServicioMeteorologico servicioMeteorologico;

	public Sugeridor(GeneradorSugerencias generadorSugerencias, ServicioMeteorologico servicioMeteorologico) {
		this.generadorSugerencias = generadorSugerencias;
		this.servicioMeteorologico = servicioMeteorologico;
	}

	public Vestimenta obtenerSugerenciaSegun(String ciudad, Guardarropa guardarropa) {
		Integer temperatura = servicioMeteorologico.getEstadoClima(ciudad).getTemperatura();
		List<Vestimenta> sugerencias = generadorSugerencias.generarSugerenciasDesde(guardarropa.getGuardarropa());
		return sugerencias.stream().filter(sugerencia -> sugerencia.esUsableEnTemperaturaDe(temperatura)).collect(Collectors.toList()).get(0);
	}
}
