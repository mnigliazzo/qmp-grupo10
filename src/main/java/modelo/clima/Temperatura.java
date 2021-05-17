package modelo.clima;

public class Temperatura {

    private Double grados;
    //TODO por ahora lo pongo como string esto podria ser un enum.................
    private String temperaturaTipo;

    public Double getGrados() {
        return grados;
    }

    public void setGrados(Double grados) {
        this.grados = grados;
    }

    public String getTemperaturaTipo() {
        return temperaturaTipo;
    }

    public void setTemperaturaTipo(String temperaturaTipo) {
        this.temperaturaTipo = temperaturaTipo;
    }
}
