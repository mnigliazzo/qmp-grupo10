package domain.prenda;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PrendaTest {
    @Test
    public void unaRemeraEsParteSuperior(){
        Prenda remeraAzul = new Prenda(TipoPrenda.REMERA,Material.ALGODON,new Color(0,0,204),null,null);
        Assertions.assertEquals(Categoria.PARTESUPERIOR, remeraAzul.getCategoria());
    }
    @Test
    public void unaRemeraNoEsParteSuperior(){
        Prenda remeraAzul = new Prenda(TipoPrenda.REMERA,Material.ALGODON,new Color(0,0,204),null,null);
        Assertions.assertNotEquals(Categoria.PARTEINFERIOR, remeraAzul.getCategoria());
    }

}
