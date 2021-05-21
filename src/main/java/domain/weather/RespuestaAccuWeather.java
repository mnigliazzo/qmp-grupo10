package domain.weather;

import java.time.LocalDateTime;

public class RespuestaAccuWeather {
	Clima clima;
	LocalDateTime expiracion;
	public RespuestaAccuWeather(Clima clima, LocalDateTime expiracion) {
		this.clima = clima;
		this.expiracion=expiracion;
	}

	public boolean expiro() {
		return this.expiracion.isAfter(LocalDateTime.now());
	}

	public Clima getClima() {
		return clima;
	}
}