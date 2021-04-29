import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

//Falta implementar los Assertions

public class TestPrenda {

    @BeforeAll
    public static void inicializar(){

        Guardaropa guardarropa = new Guardaropa();
//        DiseñoSanJuan sanJuan = new DiseñoSanJuan();

    }

    @Test
    public void prendaCorrecta() {
        Prenda prenda1 = new Prenda(TipoPrenda.ZAPATOS, Material.CUERO, new Color(1,1,1), null, Trama.LISA);
    }

    @Test
    public void prendaIncorrectaTipoNull() {
        Prenda prenda1 = new Prenda(null, Material.CUERO, new Color(1, 1, 1), null, Trama.LISA);
    }

    @Test
    public void prendaIncorrectaMaterialNull() {
        Prenda prenda1 = new Prenda(TipoPrenda.ZAPATOS, null, new Color(1,1,1), null, Trama.LISA);
    }

    @Test
    public void prendaIncorrectaColorPrimarioNull() {
        Prenda prenda1 = new Prenda(TipoPrenda.ZAPATOS, Material.CUERO, null, null, null);
    }

    @Test
    public void uniformeSanJuanCorrecto(){
        DiseñoSanJuan sanJuan = new DiseñoSanJuan();
        UniformeEscolar uniformeSanJuan = sanJuan.crearUniforme();
    }
}