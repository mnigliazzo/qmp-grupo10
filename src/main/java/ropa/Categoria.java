package ropa;

import java.util.ArrayList;
import java.util.List;

public enum Categoria {

  //TODO Estas listas deberian ser llenas con los tipos posibles que admiten...

  PARTE_SUPERIOR {
    List<TipoPrenda> tiposPartesSuperioresAdmitidos = new ArrayList<>();
    public boolean esTipoValido(TipoPrenda tipo) {
      return tiposPartesSuperioresAdmitidos.contains(tipo);
    }

  },
  CALZADO {
    List<TipoPrenda> tiposCalzadosAdmitidos = new ArrayList<>();
    public boolean esTipoValido(TipoPrenda tipo) {
      return tiposCalzadosAdmitidos.contains(tipo);
    }
  },
  PARTE_INFERIOR {
    List<TipoPrenda> tiposPartesInferioresAdmitidos = new ArrayList<>();
    public boolean esTipoValido(TipoPrenda tipo) {
      return tiposPartesInferioresAdmitidos.contains(tipo);
    }
  },
  ACCESORIO {
    List<TipoPrenda> tiposAccesoriosAdmitidos = new ArrayList<>();
    public boolean esTipoValido(TipoPrenda tipo) {
      return tiposAccesoriosAdmitidos.contains(tipo);
    }
  };

  public abstract boolean esTipoValido(TipoPrenda tipo);
  }