import java.util.ArrayList;
import java.util.List;

public class Guardaropa {

    private List<Prenda> listaDePrendas = new ArrayList<Prenda>();

    public void aregarPrenda(Prenda prenda){
        listaDePrendas.add(prenda);
    }

    public void removerPrenda(Prenda prenda){
        listaDePrendas.remove(prenda);
    }


}