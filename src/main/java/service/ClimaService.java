package service;

import modelo.clima.Temperatura;

import java.util.List;
import java.util.Map;

public interface ClimaService {

    List<Map<String, Object>> getWeather(String ciudad);

    Temperatura getTemperature(String ciudad);

}
