import InteraccionesContenido.Comentario;
import InteraccionesContenido.Like;
import InteraccionesUsuario.Follow;

public class CreadorEventos {
    public static Evento crearEvento(
            CreadorTipoEventos tipo,
            String mensaje) {
        switch (tipo) {
            case CreadorTipoEventos.LIKE:
                return new Like(
                        mensaje
                );

                case CreadorTipoEventos.COMENTARIO:

                    return new Comentario(
                            mensaje
                    );

                case FOLLOW:

                    return new Follow(
                            mensaje
                    );

                default:

                    throw new IllegalArgumentException(
                            "Evento inválido"
                    );
            }
        }
    }
