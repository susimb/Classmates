public class CreadorEventos {
    public static Evento crearEvento(
            TipoEvento tipo,
            String mensaje) {
        switch (tipo) {
            case LIKE:
                return new LikeEvento(
                        mensaje
                );

                case COMENTARIO:

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
