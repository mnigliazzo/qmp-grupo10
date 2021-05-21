package domain.generador;

import domain.prenda.Prenda;
import domain.prenda.Vestimenta;

import java.util.List;

public interface GeneradorSugerencias {
	public List<Vestimenta> generarSugerenciasDesde(List<Prenda> prendasAptas);
}
