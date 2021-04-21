package domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TestPrendas {



    @BeforeAll
    public static void inicializar(){

        Categoria parteSuperior = Categoria.parteSuperior;
        Categoria calzado = Categoria.calzado;
        Categoria getParteInferior = Categoria.parteInferior;
        Categoria accesorio = Categoria.accesorio;

        parteSuperior.addTipo("Remera");
        parteSuperior.addTipo("Musculosa");
        parteSuperior.addTipo("Chomba");

        Guardarropa guardarropa = new Guardarropa();
        Atuendo atuendo1 = new Atuendo();

    }

    @Test
    public void prendaCorrecta() throws Exception {
        Prenda prenda1 = new Prenda("Remera", Categoria.parteSuperior, "algodon", "rojo");
    }

    @Test
    public void prendaIncorrecta() throws Exception {
        Prenda prenda1 = new Prenda("Pantalon", Categoria.parteSuperior, "algodon", "rojo");
    }
}