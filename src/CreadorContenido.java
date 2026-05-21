import Contenido.Contenido;
import Usuarios.Usuario;
import Contenido.TipoContenido;
import Contenido.Foto;
import Contenido.Video;
import Contenido.Historia;

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
                            autor
                    );

                default:

                    throw new IllegalArgumentException(
                            "Tipo no valido"
                    );
            }
        }
    }
