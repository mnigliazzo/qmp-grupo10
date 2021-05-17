package modelo;


import modelo.prenda.Prenda;

public class Atuendo {
    private Prenda calzado;
    private Prenda prendaSuperior;
    private Prenda prendaInferior;
    private Prenda accesorio;

    public Atuendo(Prenda calzado, Prenda prendaSuperior, Prenda prendaInferior, Prenda accesorio) {
        this.calzado = calzado;
        this.prendaSuperior = prendaSuperior;
        this.prendaInferior = prendaInferior;
        this.accesorio = accesorio;
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

    public Prenda getAccesorio() {
        return accesorio;
    }

    public void setAccesorio(Prenda accesorio) {
        this.accesorio = accesorio;
    }
}
