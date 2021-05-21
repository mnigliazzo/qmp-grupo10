package domain.weather;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;
public class AccuWeatherAPITest {
	@Test
	@DisplayName("Obtener clima de Buenos Aires")
	public void getClimaBsAs(){
		AccuWeatherAPI apiClima = new AccuWeatherAPI();
		List<Map<String, Object>>  pronostico=apiClima.getWeather("Buenos Aires, Argentina");
		assertDoesNotThrow(()->pronostico.get(0).get("Temperature"));
	}
}
