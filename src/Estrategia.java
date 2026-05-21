import Contenido.Contenido;
import Usuarios.Usuario;

import java.util.List;
public interface Estrategia {
    List<Contenido> recomendar(
            Usuario usuario
    );
    List<Contenido> generar(
            Usuario usuario
    );
}
