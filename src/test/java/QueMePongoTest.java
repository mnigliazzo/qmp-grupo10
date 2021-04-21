import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import domain.Categoria;
import domain.Prenda;
import domain.QueMePongo;
import domain.Tipo;

public class QueMePongoTest {

  private QueMePongo qmp;

  @BeforeEach
  public void init() {
    qmp = new QueMePongo();
  }

  @Test
  public void QMPNoPoseeNingunaPrendaAlIniciarJornadaLaboral() {
    Assertions.assertEquals(qmp.getCantidadPrendas(), 0);
  }

  @Test
  public void cargarNuevaPrendaAQMP() {
    Prenda p1 = new Prenda("Gabardina", "Marron", new Tipo(Categoria.PARTEINFERIOR));
    qmp.cargarPrenda(p1);
    Assertions.assertEquals(qmp.getCantidadPrendas(), 1);
  }

  @Test
  public void cargarDosNuevasPrendasAQMP() {
    Prenda p1 = new Prenda("Gabardina", "Rojo", new Tipo(Categoria.PARTEINFERIOR));
    Prenda p2 = new Prenda("Gabardina", "Marron", new Tipo(Categoria.PARTEINFERIOR));
    qmp.cargarPrenda(p1);
    qmp.cargarPrenda(p2);
    Assertions.assertEquals(qmp.getCantidadPrendas(), 2);
  }

  @Test
  public void prendaPoseeColorPrimario() {
    Prenda p1 = new Prenda("Gabardina", "Marron", new Tipo(Categoria.PARTEINFERIOR));
    Assertions.assertEquals(p1.getColorPrimario(), "Marron");
  }

  @Test
  public void prendaNoPoseeColorSecundario() {
    Prenda p1 = new Prenda("Gabardina", "Marron", new Tipo(Categoria.PARTEINFERIOR));
    Assertions.assertEquals(p1.getColorSecundario(), null);
  }

  @Test
  public void prendaPoseeColorSecundario() {
    Prenda p1 = new Prenda("Gabardina", "Marron", "Celeste", new Tipo(Categoria.PARTEINFERIOR));
    Assertions.assertEquals(p1.getColorSecundario(), "Celeste");
  }

  @Test
  public void prendaPoseeUnTipo() {
    Prenda p1 = new Prenda("Gabardina", "Marron", new Tipo(Categoria.PARTEINFERIOR));
    Assertions.assertEquals(p1.getCategoria(), Categoria.PARTEINFERIOR);
  }

  @Test
  public void prendaPoseeUnMaterial() {
    Prenda p1 = new Prenda("Gabardina", "Marron", new Tipo(Categoria.PARTEINFERIOR));
    Assertions.assertEquals(p1.getMaterial(), "Gabardina");
  }

  @Test
  public void unaAnteojoDeSolEsDeCategoriaACCESORIO() {
    Prenda anteojosDeSol = new Prenda("Plastico", "Negro", new Tipo(Categoria.ACCESORIO));
    Assertions.assertEquals(anteojosDeSol.getCategoria(), Categoria.ACCESORIO);
  }

  @Test
  public void unaPantalonEsDeCategoriaPARTEINFERIOR() {
    Prenda anteojosDeSol = new Prenda("Plastico", "Negro", new Tipo(Categoria.ACCESORIO));
    Assertions.assertEquals(anteojosDeSol.getCategoria(), Categoria.ACCESORIO);
  }

}
