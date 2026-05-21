import Contenido.Contenido;

import Usuarios.Usuario;

import java.util.ArrayList;
import java.util.List;

public class Amigos
        implements Estrategia {

    private List<Contenido> contenidos;

    public Amigos(
            List<Contenido> contenidos) {

        this.contenidos = contenidos;
    }

    @Override
    public List<Contenido>
    generar(Usuario usuario) {

        if(usuario == null) {

            throw new UsuarioNoEncontrado();
        }

        List<Contenido> feed =
                new ArrayList<>();

        for(Contenido contenido
                : contenidos) {

            if(usuario.getAmigos()
                    .contains(
                            contenido.getAutor()
                    )) {

                feed.add(contenido);
            }
        }

        return feed;
    }
    @Override
    public List<Contenido> recomendar(Usuario usuario) {
        return List.of();
    }
}