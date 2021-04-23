package tests;

import excepciones.FaltaTipoDePrendaException;
import excepciones.PrendaInvalidaException;
import excepciones.TipoDePrendaInvalidaException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import ropa.*;

import java.util.ArrayList;
import java.util.List;

public class RopaTest {

  private static final RepositorioTipoPrendas repo = RepositorioTipoPrendas.instance();

  public void pedirCategoriaDeGorraAlRepo() {

    repo.buscarCategoria("gorra");
  }

  @BeforeAll
  public static void llenarRepoConDatos() {
    List<String> partesSuperiores = new ArrayList<>();
    List<String> partesInferiores = new ArrayList<>();
    List<String> calzados = new ArrayList<>();
    List<String> accesorios = new ArrayList<>();

    partesSuperiores.add("camisa");
    partesSuperiores.add("remera");
    partesSuperiores.add("campera");
    repo.setPartesSuperiores(partesSuperiores);

    partesInferiores.add("pantalon");
    partesInferiores.add("bermuda");
    repo.setPartesInferiores(partesInferiores);

    calzados.add("zapatillas");
    calzados.add("ojotas");
    repo.setCalzados(calzados);

    accesorios.add("lentes");
    accesorios.add("corbata");
    repo.setAccesorios(accesorios);
  }

  @Test
  public void siBuscoCategoriaDePantalonDaPARTE_INFERIOR() {
    CategoriaPrenda categoriaEsperada = CategoriaPrenda.PARTE_INFERIOR;
    CategoriaPrenda categoriaResultante = repo.buscarCategoria("pantalon");
    Assertions.assertEquals(categoriaEsperada, categoriaResultante);
  }

  @Test
  public void siBuscoCategoriaDeGorraDaTipoDePrendaInvalidaException() {
    Assertions.assertThrows(TipoDePrendaInvalidaException.class, this::pedirCategoriaDeGorraAlRepo);
  }

  @Test
  public void siCreoUnaPrendaValidaNoPasaNada() {
    GeneradorDePrendas generadorDePrendas = new GeneradorDePrendas();
    generadorDePrendas.setTipoConCategoria("remera");
    generadorDePrendas.setMaterialConstruccion("algodon");
    generadorDePrendas.setColorPrincipal(1, 2, 3);
    Assertions.assertDoesNotThrow(generadorDePrendas::getPrendaValida);
  }

  @Test
  public void siCreoUnaPrendaInvalidaDaPrendaInvalidaException() {
    GeneradorDePrendas generadorDePrendas = new GeneradorDePrendas();
    generadorDePrendas.setColorSecundario(1, 2, 3);
    Assertions.assertThrows(PrendaInvalidaException.class, generadorDePrendas::getPrendaValida);
  }

  @Test
  public void siIngresoTipoDeRopaInvalidoDaTipoDePrendaInvalidaException() {
    GeneradorDePrendas generadorDePrendas = new GeneradorDePrendas();
    Assertions.assertThrows(TipoDePrendaInvalidaException.class, () -> generadorDePrendas.setTipoConCategoria("banana"));
  }// uso lambda porque si no, no me deja. Creo que es porque la funcion tiene un parametro

  @Test
  public void siPidoCategoriaDespuesDeIngresarTipoDePrendaNoPasaNada() {
    GeneradorDePrendas generadorDePrendas = new GeneradorDePrendas();
    generadorDePrendas.setTipoConCategoria("remera");
    Assertions.assertEquals(CategoriaPrenda.PARTE_SUPERIOR, generadorDePrendas.identificarCategoria());
  }

  @Test
  public void siPidoCategoriaSinIngresarTipoDaFaltaTipoDePrendaException() {
    GeneradorDePrendas generadorDePrendas = new GeneradorDePrendas();
    Assertions.assertThrows(FaltaTipoDePrendaException.class, generadorDePrendas::identificarCategoria);
  }

}
