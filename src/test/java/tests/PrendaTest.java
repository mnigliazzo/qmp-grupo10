package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import domain.Categoria;
import domain.Prenda;
import domain.Tipo;

public class PrendaTest {

  @Test
  public void unaPrendaNoPuedeTenerVacioElMaterial() {
    Assertions.assertThrows(NullPointerException.class,
        () -> new Prenda(null, "unColorPrimario", new Tipo(Categoria.PARTEINFERIOR)));
  }

  @Test
  public void unaPrendaNoPuedeTenerVacioElColorPrimario() {
    Assertions.assertThrows(NullPointerException.class,
        () -> new Prenda("unMaterial", null, new Tipo(Categoria.PARTEINFERIOR)));
  }

  @Test
  public void unaPrendaPoseeColorSecundarioPorLoQueNoPuedeSerVacio() {
    Assertions.assertThrows(NullPointerException.class,
        () -> new Prenda("unMaterial", "unColorPrimario", null, new Tipo(Categoria.PARTEINFERIOR)));
  }

  @Test
  public void unaPrendaNoPoseeColorSecundarioPorLoQueEsVacio() {
    Prenda p1 = new Prenda("unMaterial", "unColorPrimario", new Tipo(Categoria.PARTEINFERIOR));
    Assertions.assertNull(p1.getColorSecundario());
  }

  @Test
  public void prendaPoseeUnMaterial() {
    Prenda p1 = new Prenda("unMaterial", "unColorPrimario", new Tipo(Categoria.PARTEINFERIOR));
    Assertions.assertNotNull(p1.getMaterial());
  }

  @Test
  public void prendaPoseeColorPrimario() {
    Prenda p1 = new Prenda("unMaterial", "unColorPrimario", new Tipo(Categoria.PARTEINFERIOR));
    Assertions.assertNotNull(p1.getColorPrimario());
  }

  @Test
  public void unaPrendaPoseeColorSecundario() {
    Prenda p1 = new Prenda("unMaterial", "unColorPrimario", "unColorSecundario",
        new Tipo(Categoria.PARTEINFERIOR));
    Assertions.assertNotNull(p1.getColorSecundario());
  }

  @Test
  public void unAnteojoDeSolEsDeCategoriaACCESORIO() {
    Prenda anteojosDeSol = new Prenda("Plastico", "Negro", new Tipo(Categoria.ACCESORIO));
    Assertions.assertEquals(anteojosDeSol.getCategoria(), Categoria.ACCESORIO);
  }

  @Test
  public void unPantalonEsDeCategoriaPARTEINFERIOR() {
    Prenda pantalon = new Prenda("Gabardina", "Marron", new Tipo(Categoria.PARTEINFERIOR));
    Assertions.assertEquals(pantalon.getCategoria(), Categoria.PARTEINFERIOR);
  }

  @Test
  public void unaRemeraEsDeCategoriaPARTESUPERIOR() {
    Prenda remeraDeLosRedondos = new Prenda("Algodon", "Negro", new Tipo(Categoria.PARTESUPERIOR));
    Assertions.assertEquals(remeraDeLosRedondos.getCategoria(), Categoria.PARTESUPERIOR);
  }

  @Test
  public void unasAirJordansSonDeCategoriaCALZADO() {
    Prenda airJordans = new Prenda("Nylon", "Blanco", new Tipo(Categoria.CALZADO));
    Assertions.assertEquals(airJordans.getCategoria(), Categoria.CALZADO);
  }

}
