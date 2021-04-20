package domain.prenda;

import java.util.Objects;

public class Prenda {
    TipoPrenda tipo;
    String material; // TODO: Verificar el comportamiento que tendra el Material, esta como string ya que al no tener comportamiento por ahora no pareciera ser necesario darle comportamiento
    String colorPrimario; // TODO: Verificar el comportamiento que tendra el Color, esta como string ya que al no tener comportamiento por ahora no pareciera ser necesario darle comportamiento

    String colorSecundario; // TODO: Verificar el comportamiento que tendra el Color, esta como string ya que al no tener comportamiento por ahora no pareciera ser necesario darle comportamiento

    public Prenda(TipoPrenda tipo, String material, String colorPrimario) {
        this.tipo = Objects.requireNonNull(tipo, "Tipo no puede ser Null");
        this.material = Objects.requireNonNull(material, "Material no puede ser Null");
        this.colorPrimario = Objects.requireNonNull(colorPrimario, "colorPrimario no puede ser Null");
    }
    public String getColorSecundario() {
        return colorSecundario;
    }

    public void setColorSecundario(String colorSecundario) {
        this.colorSecundario = colorSecundario;
    }
    public Categoria getCategoria(){
        return this.tipo.getCategoria();
    }
}
