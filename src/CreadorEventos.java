import Evento.Evento;
import Excepciones.OperacionInvalida;
import InteraccionesContenido.Comentario;
import InteraccionesContenido.Like;
import InteraccionesUsuario.Follow;

public class CreadorEventos {
    public static Evento crearEvento(
            CreadorTipoEventos tipo,
            String mensaje) {
        switch (tipo) {
            case CreadorTipoEventos.LIKE:
                return new Like();

                case CreadorTipoEventos.COMENTARIO:

                    return new Comentario();
                    case FOLLOW:

                    return new Follow();
                default:

                    throw new OperacionInvalida(
                            "Evento.Evento inválido"
                    );
            }
        }
    }
