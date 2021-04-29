abstract class Diseñador {

    public UniformeEscolar crearUniforme(){
        UniformeEscolar uniforme = new UniformeEscolar(
                this.crearParteSuperior(),
                this.crearParteInferior(),
                this.crearCalzado());
        return uniforme;
    }

    public abstract Prenda crearParteSuperior();
    public abstract Prenda crearParteInferior();
    public abstract Prenda crearCalzado();

}
