public class CreadorContenido {
    public static Contenido crearContenido(
            TipoContenido tipo,
            Usuario autor,
            String titulo) {
        switch (tipo) {
            case CreadorTipoContenido.FOTO:
                return new Foto(
                        autor,
                        titulo
                    );

                case CreadorTipoContenido.VIDEO:
                    return new Video(
                            autor,
                            titulo
                    );

                case CreadorTipoContenido.HISTORIA:

                    return new Historia(
                            autor,
                            titulo
                    );
        }
    }
}
