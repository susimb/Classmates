import Contenido.Contenido;
import Excepciones.UsuarioNoEncontrado;
import Usuarios.Usuario;

import java.util.ArrayList;
import java.util.List;

public class Intereses implements Estrategia {

    private List<Contenido> contenidos;

    public Intereses(
            List<Contenido> contenidos) {

        this.contenidos = contenidos;
    }

    @Override
    public List<Contenido> recomendar(Usuario usuario) {

        if (usuario == null) {

            throw new UsuarioNoEncontrado();
        }

        List<Contenido> feed =
                new ArrayList<>();

        for (Contenido contenido : contenidos) {

            if (contenido.getCategoria()
                    .equalsIgnoreCase(
                            usuario.getPerfil()
                                    .getCarrera()
                    )) {

                feed.add(contenido);
            }
        }

        return feed;
    }

    @Override
    public List<Contenido> generar(Usuario usuario) {
        return List.of();
    }
}