public class Prenda {


    private TipoPrenda tipo;
    private Material material;
    private Color colorPrimario;
    private Color colorSecundario;
    private Trama trama = Trama.LISA;



    public Prenda(TipoPrenda tipo, Material material, Color colorPrimario, Color colorSecundario, Trama trama) {

        validarPrendaCompleta(tipo, material, colorPrimario);

        this.tipo = tipo;
        this.material = material;
        this.colorPrimario = colorPrimario;
        this.colorSecundario = colorSecundario;
        if (trama != null){
            this.trama = trama;
        }

    }


    private void validarPrendaCompleta(TipoPrenda tipo, Material material, Color colorPrimario){
        if(tipo == null){
            throw new PrendaInvalidaException("Tipo de PRENDA inexistente");
        }
        if(material == null){
            throw new PrendaInvalidaException("Tipo de MATERIAL inexistente");
        }
        if(colorPrimario == null){
            throw new PrendaInvalidaException("Tipo de COLOR PRIMARIO inexistente");
        }

    }

    private void validarTipoPrendaConMaterial(TipoPrenda tipo, Material material ) {
        if (false) { //TODO: validarMaterial()
            throw new PrendaInvalidaException("Tipo de PRENDA inconsistente con MATERIAL");
        }
    }

    public Categoria getCategoria(){
        return tipo.getCategoria();
    }


}


