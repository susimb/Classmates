import Contenido.Contenido;
import Usuarios.Usuario;

public class CreadorContenido {
    public static Contenido crearContenido(
            TipoContenido tipo,
            Usuario autor,
            String titulo) {
        switch (tipo) {
            case FOTO:
                return new Foto(
                        autor,
                        titulo
                    );

                case VIDEO:
                    return new Video(
                            autor,
                            titulo
                    );

                case HISTORIA:

                    return new Historia(
                            autor,
                            titulo
                    );

                default:

                    throw new IllegalArgumentException(
                            "Tipo inválido"
                    );
            }
        }
    }
