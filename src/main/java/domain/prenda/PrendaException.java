package domain.prenda;

public class PrendaException extends RuntimeException {
	public PrendaException(String causa) {
		super("La prenda es invalida porque: " + causa);
	}
}
