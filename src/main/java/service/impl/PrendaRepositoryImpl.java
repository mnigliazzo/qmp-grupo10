package service.impl;

import modelo.clima.Temperatura;
import modelo.prenda.Prenda;
import service.PrendaRepository;

public class PrendaRepositoryImpl implements PrendaRepository {
    @Override
    public Prenda getParteSuperior(Temperatura temperatura) {
        return null;
    }

    @Override
    public Prenda getParteInferior(Temperatura temperatura) {
        return null;
    }

    @Override
    public Prenda getAccesorio(Temperatura temperatura) {
        return null;
    }

    @Override
    public Prenda getCalzado(Temperatura temperatura) {
        return null;
    }
}
