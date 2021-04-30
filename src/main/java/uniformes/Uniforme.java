package uniformes;

import ropa.Prenda;

public class Uniforme {
    private Prenda calzado;
    private Prenda prendaSuperior;
    private Prenda prendaInferior;
    public Uniforme(Prenda calzado, Prenda prendaSuperior, Prenda prendaInferior) {
        this.calzado = calzado;
        this.prendaSuperior = prendaSuperior;
        this.prendaInferior = prendaInferior;
    }

    public Prenda getCalzado() {
        return calzado;
    }

    public void setCalzado(Prenda calzado) {
        this.calzado = calzado;
    }

    public Prenda getPrendaSuperior() {
        return prendaSuperior;
    }

    public void setPrendaSuperior(Prenda prendaSuperior) {
        this.prendaSuperior = prendaSuperior;
    }

    public Prenda getPrendaInferior() {
        return prendaInferior;
    }

    public void setPrendaInferior(Prenda prendaInferior) {
        this.prendaInferior = prendaInferior;
    }
}
