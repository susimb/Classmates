public class CreadorEventos {
    public static Evento crearEvento(
            TipoEvento tipo,
            String mensaje) {
        switch (tipo) {
            case CreadorTipoEventos.Like:
                return new LikeEvento(
                        mensaje
                );

                case CreadorTipoEventos.Comentario:

                    return new ComentarioEvento(
                            mensaje
                    );

                case CreadorTipoEventos.Follow:

                    return new FollowEvento(
                            mensaje
                    );
            }
        }
    }
