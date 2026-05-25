import Usuarios.Usuario;

public class RecomendacionServicio {
    private Estrategia strategy;
    public RecomendacionServicio(
            Estrategia strategy) {
        this.strategy = strategy;
        }
        public void
        recomendarContenido(Usuario usuario) {

            strategy.recomendar(usuario);
        }
        public void cambiarEstrategia(
                Estrategia strategy) {

            this.strategy = strategy;
        }
    }

