import Contenido.Contenido;
import Usuarios.Usuario;

import java.util.List;

public class RecomendacionServicio {
    private Estrategia strategy;
    public RecomendacionServicio(
            Estrategia strategy) {
        this.strategy = strategy;
        }
        public List<Contenido>
        recomendarContenido(Usuario usuario) {

            return strategy.recomendar(usuario);
        }
        public void cambiarEstrategia(
                Estrategia strategy) {

            this.strategy = strategy;
        }
    }

