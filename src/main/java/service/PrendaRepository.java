package service;

import modelo.clima.Temperatura;
import modelo.prenda.Prenda;

public interface PrendaRepository {

    Prenda getParteSuperior(Temperatura temperatura);

    Prenda getParteInferior(Temperatura temperatura);

    Prenda getAccesorio(Temperatura temperatura);

    Prenda getCalzado(Temperatura temperatura);

}
