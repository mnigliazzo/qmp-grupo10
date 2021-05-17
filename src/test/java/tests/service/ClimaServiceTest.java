package tests.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import service.ClimaService;
import service.impl.ClimaServiceImpl;

public class ClimaServiceTest {

    ClimaService climaService = new ClimaServiceImpl();

    @Test
    @DisplayName("Clima Service retorna el clima de Buenos aires en cualquier momento")
    public void test1() {
        Assertions.assertDoesNotThrow(() -> {climaService.getWeather("Buenos Aires, Argentina");});
    }

    @Test
    @DisplayName("Clima Service retorna el clima de Buenos aires en cualquier momento")
    public void test2() {
        Assertions.assertDoesNotThrow(() -> {climaService.getWeather("Buenos Aires, Argentina");});
    }


}
