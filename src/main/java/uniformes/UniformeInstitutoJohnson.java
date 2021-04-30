package uniformes;

import ropa.Color;
import ropa.Material;
import ropa.Prenda;
import ropa.TipoPrenda;

public class UniformeInstitutoJohnson implements UniformeFactory {

    @Override
    public Uniforme crearUniforme() {

        Prenda camisa = new Prenda.PrendaBuilder(TipoPrenda.CAMISA)
                .material(Material.ALGODON)
                .colorPrimario(new Color(255,255,255))
                .build();

        Prenda zapatos = new Prenda.PrendaBuilder(TipoPrenda.ZAPATOS)
                .material(Material.CUERO)
                .colorPrimario(new Color(0,0, 0))
                .build();

        Prenda pantalon = new Prenda.PrendaBuilder(TipoPrenda.PANTALON_DE_VESTIR)
                .material(Material.GABARDINA)
                .colorPrimario(new Color(0,0,0))
                .build();

        return new Uniforme(zapatos,camisa,pantalon);
    }
}
