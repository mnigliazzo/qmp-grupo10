import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

//Falta implementar los Assertions

public class TestPrenda {

    @BeforeAll
    public static void inicializar(){

        Guardaropa guardarropa = new Guardaropa();

    }

    @Test
    public void prendaCorrecta() {
        Prenda prenda1 = new Prenda(TipoPrenda.ZAPATO, Material.CUERO, new Color(1,1,1), null);
    }

    @Test
    public void prendaIncorrectaTipoNull() {
        Prenda prenda1 = new Prenda(null, Material.CUERO, new Color(1, 1, 1), null);
    }

    @Test
    public void prendaIncorrectaMaterialNull() {
        Prenda prenda1 = new Prenda(TipoPrenda.ZAPATO, null, new Color(1,1,1), null);
    }

    @Test
    public void prendaIncorrectaColorPrimarioNull() {
        Prenda prenda1 = new Prenda(TipoPrenda.ZAPATO, Material.CUERO, null, null);
    }


}