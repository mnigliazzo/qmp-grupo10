package domain;

public class Prenda {
    private String tipo;
    private Categoria categoria;
    private String material;
    private String colorPrimario;
    private String colorSecundario;

    public Prenda(String tipo, Categoria categoria, String material, String colorPrimario) throws Exception {
        this.tipo = tipo;
        this.categoria = categoria;
        this.material = material;
        this.colorPrimario = colorPrimario;

        categoria.esTipoValido(tipo);

    }

    public void setColorSecundario(String colorSecundario){
        this.colorSecundario = colorSecundario;
    }

}
