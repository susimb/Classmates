import java.util.List;
public class FeedServicio {
        private FeedStrategy strategy;

        public FeedServicio(FeedStrategy strategy) {

            this.strategy = strategy;
        }

        public List<Contenido>
        generarFeed(Usuario usuario) {

            return strategy.generar(usuario);
        }

        public void cambiarStrategy(
                FeedStrategy strategy) {

            this.strategy = strategy;
        }
    }