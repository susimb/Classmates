import Contenido.Contenido;
import Usuarios.Usuario;

import java.util.List;

public class RecomendacionServicio {
    private RecomendacionStrategy strategy;
    public RecomendacionServicio(
            RecomendacionStrategy strategy) {
        this.strategy = strategy;
        }
        public List<Contenido>
        recomendarContenido(Usuario usuario) {

            return strategy.recomendar(usuario);
        }
        public void cambiarEstrategia(
                RecomendacionStrategy strategy) {

            this.strategy = strategy;
        }
    }

