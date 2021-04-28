public enum TipoPrenda {

    ZAPATO(Categoria.CALZADO),
    CAMISA(Categoria.SUPERIOR);


    private Categoria categoria;

    TipoPrenda(Categoria categoria) {
        this.categoria = categoria;
    }

    public Categoria getCategoria() {
        return categoria;
    }

}
