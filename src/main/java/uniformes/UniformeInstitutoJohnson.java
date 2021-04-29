package uniformes;

import ropa.Color;
import ropa.Material;
import ropa.Prenda;
import ropa.TipoPrenda;

public class UniformeInstitutoJohnson implements UniformeFactory {

    @Override
    public Uniforme crearUniforme() {
        Prenda camisa = new Prenda.PrendaBuilderEmi(TipoPrenda.CAMISA, Material.ALGODON,new Color(255,255,255))
                .build();
        Prenda zapato = new Prenda.PrendaBuilderEmi(TipoPrenda.ZAPATOS,Material.CUERO,new Color(0,0,0))
                .build();
        Prenda pantalon = new Prenda.PrendaBuilderEmi(TipoPrenda.PANTALON_DE_VESTIR,Material.GABARDINA,new Color(0,0,0))
                .build();
        return new Uniforme(zapato,camisa,pantalon);
    }
}
