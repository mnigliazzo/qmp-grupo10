package domain.prenda;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PrendaTest {
    @Test
    public void unaRemeraEsParteSuperior(){
        TipoPrenda remera = new TipoPrenda(Categoria.PARTESUPERIOR);
        Prenda remeraAzul = new Prenda(remera,"Algodon","Azul");
        Assertions.assertEquals(Categoria.PARTESUPERIOR, remeraAzul.getCategoria());
    }
    @Test
    public void unaRemeraNoEsParteSuperior(){
        TipoPrenda remera = new TipoPrenda(Categoria.PARTESUPERIOR);
        Prenda remeraAzul = new Prenda(remera,"Algodon","Azul");
        Assertions.assertNotEquals(Categoria.PARTEINFERIOR, remeraAzul.getCategoria());
    }
    @Test
    public void prendaQueNoPermitaNull(){
        Assertions.assertThrows(NullPointerException.class,()->{new Prenda(null,null, null);});
    }

}
