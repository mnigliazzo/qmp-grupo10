package service.impl;

import modelo.clima.Temperatura;
import modelo.prenda.Prenda;
import service.PrendaRepository;

import java.util.ArrayList;
import java.util.List;

public class PrendaRepositoryImpl implements PrendaRepository {

    private List<Prenda> listaParteSuperior = new ArrayList<>();
    private List<Prenda> listaParteInferior = new ArrayList<>();
    private List<Prenda> listaAccesorios = new ArrayList<>();
    private List<Prenda> listaCalzados = new ArrayList<>();

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

    @Override
    public void agregarParteInferior(Prenda parteInferior) {
        listaParteInferior.add(parteInferior);
    }

    @Override
    public void agregarParteSuperior(Prenda parteSuperior) {
        listaParteSuperior.add(parteSuperior);
    }

    @Override
    public void agregarCalzado(Prenda calzado) {
        listaCalzados.add(calzado);
    }

    @Override
    public void agregarAccesorio(Prenda accesorio) {
        listaAccesorios.add(accesorio);
    }
}
