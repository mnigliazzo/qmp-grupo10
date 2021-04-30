package ropa;

public class Prenda {

    private TipoPrenda tipoPrenda;
    private Categoria categoria;
    private Material material;
    private Color colorPrincipal;
    private Color colorSecundario;
    private Trama trama = Trama.LISA;

    private Prenda(PrendaBuilder builder) {
        this.tipoPrenda =  builder.tipoPrenda;
        this.categoria = builder.categoria;
        this.material = builder.material;
        this.colorPrincipal = builder.colorPrincipal;
        this.colorSecundario = builder.colorSecundario;
        this.trama = builder.trama;
    }

    public TipoPrenda getTipoPrenda() {
        return tipoPrenda;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public Material getMaterial() {
        return material;
    }

    public Color getColorPrincipal() {
        return colorPrincipal;
    }

    public Color getColorSecundario() {
        return colorSecundario;
    }

    public Trama getTrama() {
        return trama;
    }

    public void setTipoPrenda(TipoPrenda tipoPrenda) {
        this.tipoPrenda = tipoPrenda;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public void setColorPrincipal(Color colorPrincipal) {
        this.colorPrincipal = colorPrincipal;
    }

    public void setColorSecundario(Color colorSecundario) {
        this.colorSecundario = colorSecundario;
    }

    public void setTrama(Trama trama) {
        this.trama = trama;
    }

    public static class PrendaBuilder {
        private TipoPrenda tipoPrenda;
        private Categoria categoria;
        private Material material;
        private Color colorPrincipal;
        private Color colorSecundario;
        private Trama trama = Trama.LISA;

        public PrendaBuilder(TipoPrenda tipo) {
            this.tipoPrenda = tipo;
        }

        public PrendaBuilder colorSecundario(Color colorSecundario) {
            this.colorSecundario = colorSecundario;
            return this;
        }
        public PrendaBuilder trama(Trama trama) {
            this.trama = trama;
            return this;
        }
        public PrendaBuilder colorPrimario(Color color) {
            this.colorPrincipal = color;
            return this;
        }

        public PrendaBuilder categoria(Categoria categoria) {
            this.categoria = categoria;
            return this;
        }

        public PrendaBuilder material(Material material) {
            this.material = material;
            return this;
        }

        public Prenda build() {
            Prenda prenda =  new Prenda(this);
            validarPrenda(prenda);
            return prenda;
        }
        public void validarPrenda(Prenda prenda) {
            if(prenda.getTipoPrenda() == null) {
                throw new excepciones.PrendaInvalidaException("La prenda no es valida porque no se cargo el tipo.");
            } else if(prenda.getMaterial() == null) {
                throw new excepciones.PrendaInvalidaException("La prenda no es valida porque no se cargo el material.");
            } else if(prenda.getColorPrincipal() == null) {
                throw new excepciones.PrendaInvalidaException("La prenda no es valida porque no se cargo el color principal.");
            } else if (!prenda.getCategoria().esTipoValido(prenda.getTipoPrenda())){
                throw new excepciones.PrendaInvalidaException("El tipo no pertenece a la categoria seleccionada");
            }
        }
    }

}
