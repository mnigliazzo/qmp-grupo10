package domain.weather;

import domain.prenda.AlertaMeteorologica;

import java.util.List;

public interface ServicioMeteorologico {

	Clima getEstadoClima(String ciudad);
	List<AlertaMeteorologica> getAlertasActuales();
}



