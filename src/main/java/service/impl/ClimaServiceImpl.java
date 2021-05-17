package service.impl;

import modelo.clima.Temperatura;
import service.ClimaService;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClimaServiceImpl implements ClimaService {

    public final List<Map<String, Object>> getWeather(String ciudad) {
        return Arrays.asList(new HashMap<String, Object>(){{
            put("DateTime", "2019-05-03T01:00:00-03:00");
            put("EpochDateTime", 1556856000);
            put("WeatherIcon", 33);
            put("IconPhrase", "Clear");
            put("IsDaylight", false);
            put("PrecipitationProbability", 0);
            put("MobileLink", "http://m.accuweather.com/en/ar/villa-vil/7984/");
            put("Link", "http://www.accuweather.com/en/ar/villa-vil/7984");
            put("Temperature", new HashMap<String, Object>(){{
                put("Value", 57);
                put("Unit", "F");
                put("UnitType", 18);
            }});
        }});
    }
    //TODO Como se queria usar como interfaz el getWeather entonces no puedo hacer un replace del getTemperature.
    public final Temperatura getTemperature(String ciudad) {
        List<Map<String, Object>> weather = this.getWeather(ciudad);
        HashMap<String, Object> temperature = (HashMap<String, Object>) weather.get(0).get("Temperature");
        Double grados = (Double) temperature.get("Value");
        String unidad = (String) temperature.get("Unit");
        Temperatura temperatura = new Temperatura();
        temperatura.setGrados(grados);
        temperatura.setTemperaturaTipo(unidad);
        return temperatura;
    }
}
