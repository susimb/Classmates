public class CreadorEventos {
    public static Evento crearEvento(
            CreadorTipoEventos tipo,
            String mensaje) {
        switch (tipo) {
            case CreadorTipoEventos.LIKE:
                return new LikeEvento(
                        mensaje
                );

                case CreadorTipoEventos.COMENTARIO:

                    return new ComentarioEvento(
                            mensaje
                    );

                case FOLLOW:

                    return new FollowEvento(
                            mensaje
                    );

                default:

                    throw new IllegalArgumentException(
                            "Evento inválido"
                    );
            }
        }
    }
