import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Cronologico {
        private List<Contenido> contenidos;

        public FeedCronologico(
                List<Contenido> contenidos) {

            this.contenidos = contenidos;
        }

        @Override
        public List<Contenido>
        generar(Usuario usuario) {

            List<Contenido> feed =
                    new ArrayList<>(contenidos);

            feed.sort(
                    Comparator.comparing(
                            Contenido::getFecha
                    ).reversed()
            );

            return feed;
        }
    }
