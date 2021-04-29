package uniformes;

import ropa.*;

public class UniformeFactorySanJuan implements UniformeFactory {

    @Override
    public Uniforme crearUniforme() {
        Prenda chomba = new Prenda.PrendaBuilderEmi(TipoPrenda.CHOMBA, Material.PIQUE,new Color(0,255,0))
                .build();
        Prenda zapatillas = new Prenda.PrendaBuilderEmi(TipoPrenda.ZAPATILLA,Material.CUERO,new Color(255,255,255))
                .build();
        Prenda pantalon = new Prenda.PrendaBuilderEmi(TipoPrenda.PANTALON,Material.ACETATO,new Color(60,60,60))
                .build();
        return new Uniforme(zapatillas,chomba,pantalon);
    }
}
