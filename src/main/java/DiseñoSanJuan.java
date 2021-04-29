public class DiseñoSanJuan extends Diseñador {

    public Prenda crearParteSuperior(){
        Prenda parteSuperior = new Prenda(TipoPrenda.CHOMBA, Material.PIQUE, new Color(0,255,0),null, null);
        return parteSuperior;
    }
    public Prenda crearParteInferior(){
        Prenda parteInferior = new Prenda(TipoPrenda.PANTALON, Material.ACETATO, new Color(220,220,220),null, null);
        return parteInferior;
    }
    public Prenda crearCalzado(){
        Prenda calzado = new Prenda(TipoPrenda.ZAPATILLAS, Material.CUERO, new Color(255,255,255),null, null);
        return calzado;
    }

}
