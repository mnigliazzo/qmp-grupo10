package domain.weather;

import java.util.List;
import java.util.Map;

public class Clima {
	List<Map<String, Object>> clima;

	public Clima(List<Map<String, Object>> clima){
		this.clima=clima;
	}

	public Integer getTemperatura(){
		Map<String,Object> valorClima= (Map<String, Object>) clima.get(0).get("Temperature");
		return (Integer) valorClima.get("Value");
	}
}
