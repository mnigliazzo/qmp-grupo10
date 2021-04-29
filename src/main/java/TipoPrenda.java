public enum TipoPrenda {

    ZAPATOS(Categoria.CALZADO),
    CAMISA(Categoria.SUPERIOR),
    CHOMBA(Categoria.SUPERIOR),
    PANTALON(Categoria.INFERIOR),
    ZAPATILLAS(Categoria.CALZADO);



    private Categoria categoria;

    TipoPrenda(Categoria categoria) {
        this.categoria = categoria;
    }

    public Categoria getCategoria() {
        return categoria;
    }

}
