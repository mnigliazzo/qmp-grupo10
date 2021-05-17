package service.impl;

import modelo.Atuendo;
import modelo.clima.Temperatura;
import modelo.prenda.Prenda;
import service.AtuendoService;
import service.ClimaService;
import service.PrendaRepository;

public class AtuendoServiceImpl implements AtuendoService {

    private ClimaService climaService;
    private PrendaRepository prendaRepository;

    @Override
    public Atuendo sugerirAtuendo(
            
    ) {
        //TODO En caso de ser necesario habria que tratar la temperatura, en este caso yo voy a modelar la temperatura de las prendas con F en vez de C
        Temperatura temperatura = climaService.getTemperature("Buenos Aires, Argentina");
        Atuendo atuendo = obtenerAtuendoSegunTemperatura(temperatura);
        return atuendo;
    }

    private Atuendo obtenerAtuendoSegunTemperatura(Temperatura temperatura) {

        Prenda parteSuperior = prendaRepository.getParteSuperior(temperatura);
        Prenda parteInferior = prendaRepository.getParteInferior(temperatura);
        Prenda calzado = prendaRepository.getCalzado(temperatura);
        Prenda accesorio = prendaRepository.getAccesorio(temperatura);

        return new Atuendo(calzado,parteSuperior,parteInferior,accesorio);
    }
}
