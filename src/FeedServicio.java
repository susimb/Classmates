import Contenido.Contenido;
import Usuarios.Usuario;

import java.util.List;
public class FeedServicio {
        private Estrategia strategy;

        public FeedServicio(Estrategia strategy) {

            this.strategy = strategy;
        }

        public List<Contenido>
        generarFeed(Usuario usuario) {

            return strategy.recomendar(usuario);
        }

        public void cambiarStrategy(
                Estrategia strategy) {

            this.strategy = strategy;
        }
    }