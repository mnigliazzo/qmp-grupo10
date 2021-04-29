public class PrendaInvalidaException extends RuntimeException {

    public PrendaInvalidaException(String error){
        super("La prenda es invalida porque: " + error);
    }
}

