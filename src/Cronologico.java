import Contenido.Contenido;
import Usuarios.Usuario;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Cronologico
        implements Estrategia {

    private List<Contenido> contenidos;

    public Cronologico(
            List<Contenido> contenidos) {

        this.contenidos = contenidos;
    }

    @Override
    public List<Contenido>
    recomendar(Usuario usuario) {

        List<Contenido> feed =
                new ArrayList<>(contenidos);

        feed.sort(
                Comparator.comparing(
                        Contenido::getFecha
                ).reversed()
        );

        return feed;
    }

    @Override
    public List<Contenido> generar(Usuario usuario) {
        return List.of();
    }
}