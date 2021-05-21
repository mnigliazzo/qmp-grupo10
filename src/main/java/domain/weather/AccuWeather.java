package domain.weather;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AccuWeather implements ServicioMeteorologico {
	AccuWeatherAPI accuWeatherAPI = new AccuWeatherAPI();
	private Integer cantidadHsVigenciaConsulta = 3;// 24hs/3= 8 veces al dia se le consultaria. Lo que implica que para cada ciudad se ejecute como maximo 8 veces al dia.
	// Para el caso de que sea otra ciudad podria ese dia hacer otras 8 consultas, por lo que se pasaria del limite de 10 gratis.
	private List<Map<String, RespuestaAccuWeather>> ultimasRespuestas; // se almacenan los resultados obtenidos de AccuWeatherAPI por Ciudad

	@Override
	public Clima getEstadoClima(String ciudad) {
		if (this.ultimasRespuestas.contains(ciudad) && !this.ultimasRespuestas.get(0).get(ciudad).expiro()) {
			return this.ultimasRespuestas.get(0).get(ciudad).getClima();
		}
		Clima clima = new Clima(this.accuWeatherAPI.getWeather(ciudad));
		RespuestaAccuWeather respuesta = new RespuestaAccuWeather(clima, fechaExpiracion());
		Map<String, RespuestaAccuWeather> ciudadRespuesta = new HashMap<String, RespuestaAccuWeather>() {{
			put(ciudad, respuesta);
		}};
		this.ultimasRespuestas.get(0).remove(ciudad); //elimino el que expiro
		this.ultimasRespuestas.add(ciudadRespuesta); //agrego el nuevo
		return clima;
	}

	private LocalDateTime fechaExpiracion() {
		return LocalDateTime.now().plusHours(cantidadHsVigenciaConsulta);
	}
}




