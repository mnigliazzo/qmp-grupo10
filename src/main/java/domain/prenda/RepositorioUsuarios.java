package domain.prenda;

import java.util.ArrayList;
import java.util.List;

public class RepositorioUsuarios {
  List<Usuario> usuarios=new ArrayList<>();

  public RepositorioUsuarios() {
  }
  public void agregarUsuario(Usuario usuario){
    usuarios.add(usuario);
  }
  public void quitarUsuario(Usuario usuario){
    usuarios.remove(usuario);
  }
  public List<Usuario> getUsuarios(){
    return usuarios;
  }
}
