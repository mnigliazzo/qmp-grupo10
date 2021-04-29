package uniformes;

import ropa.*;

public class UniformeFactorySanJuan implements UniformeFactory {

    @Override
    public Uniforme crearUniforme() {
        Prenda chomba = new Prenda.PrendaBuilder(TipoPrenda.CHOMBA)
                .material(Material.PIQUE)
                .colorPrimario(new Color(0,255,0))
                .build();

        Prenda zapatillas = new Prenda.PrendaBuilder(TipoPrenda.ZAPATILLA)
                .material(Material.CUERO)
                .colorPrimario(new Color(255,255,255))
                .build();

        Prenda pantalon = new Prenda.PrendaBuilder(TipoPrenda.PANTALON)
                .material(Material.ACETATO)
                .colorPrimario(new Color(60,60,60))
                .build();

        return new Uniforme(zapatillas,chomba,pantalon);
    }
}
