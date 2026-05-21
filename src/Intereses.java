import Contenido.Contenido;

import java.util.ArrayList;
import java.util.List;

public class Intereses implements OrdenFeed {

    private List<Contenido> contenidos;

    public Intereses(
            List<Contenido> contenidos) {

        this.contenidos = contenidos;
    }

    @Override
    public List<Contenido> generar(Usuario usuario) {

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
}