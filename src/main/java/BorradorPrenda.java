public class BorradorPrenda {

    private TipoPrenda tipo;
    private Material material;
    private Color colorPrimario;
    private Color colorSecundario;
    private Trama trama = Trama.LISA;



    public BorradorPrenda(TipoPrenda tipo) {
        this.tipo = tipo;
    }
    public void setMaterial(Material material) {
        this.material = material;
    }

    public void setColorPrimario(Color colorPrimario) {
        this.colorPrimario = colorPrimario;
    }

    public void setColorSecundario(Color colorSecundario) {
        this.colorSecundario = colorSecundario;
    }

    public void setTrama(Trama trama) {
        this.trama = trama;
    }

    public Prenda generarPrenda(){
       Prenda prenda =  new Prenda(this.tipo, this.material, this.colorPrimario, this.colorSecundario, this.trama);
       return prenda;
    }


}
