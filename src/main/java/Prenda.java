public class Prenda {


    private TipoPrenda tipo;
    private Material material;
    private Color colorPrimario;
    private Color colorSecundario;



    public Prenda(TipoPrenda tipo, Material material, Color colorPrimario, Color colorSecundario) {

        validarPrenda(tipo, material, colorPrimario);

        this.tipo = tipo;
        this.material = material;
        this.colorPrimario = colorPrimario;
        this.colorSecundario = colorSecundario;
    }


    private void validarPrenda(TipoPrenda tipo, Material material, Color colorPrimario){
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

    public Categoria getCategoria(){
        return tipo.getCategoria();
    }


}


