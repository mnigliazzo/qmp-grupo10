package tests.service;

import modelo.prenda.Categoria;
import modelo.prenda.Material;
import modelo.prenda.Prenda;
import modelo.prenda.TipoPrenda;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import service.AtuendoService;
import service.ClimaService;
import service.PrendaRepository;
import service.impl.AtuendoServiceImpl;
import service.impl.ClimaServiceImpl;
import service.impl.PrendaRepositoryImpl;

public class ClimaServiceTest {

    ClimaService climaService = new ClimaServiceImpl();
    AtuendoService atuendoService = new AtuendoServiceImpl();
    PrendaRepositoryImpl prendaRepository = new PrendaRepositoryImpl();

    Prenda parteSup = new Prenda.PrendaBuilder(TipoPrenda.CAMISA).categoria(Categoria.PARTE_SUPERIOR).material(Material.ALGODON).build();
    Prenda parteInf = new Prenda.PrendaBuilder(TipoPrenda.PANTALON).categoria(Categoria.PARTE_INFERIOR).material(Material.GABARDINA).build();
    Prenda calzado = new Prenda.PrendaBuilder(TipoPrenda.ZAPATILLA).categoria(Categoria.CALZADO).material(Material.PIQUE).build();
    Prenda accesorio = new Prenda.PrendaBuilder(TipoPrenda.GORRO).categoria(Categoria.ACCESORIO).material(Material.LANA).build();



    @Test
    @DisplayName("Clima Service retorna el clima de Buenos aires en cualquier momento")
    public void test1() {
        Assertions.assertDoesNotThrow(() -> {climaService.getWeather("Buenos Aires, Argentina");});
    }

    @Test
    @DisplayName("Recibir una sugerencia de atuendo devuelve un atuendo con una prenda por categoria")
    public void test2() {
        atuendoService.sugerirAtuendo();
    }


}
