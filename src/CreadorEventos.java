import Contenido.Contenido;
import Interacciones.Interaccion;
import InteraccionesContenido.Comentario;
import InteraccionesContenido.Like;
import InteraccionesUsuario.Follow;
import Usuarios.Usuario;

public class CreadorEventos {
    public static Interaccion crearEvento(
            CreadorTipoEventos tipo,
            String mensaje) {
        return switch (tipo) {
            case CreadorTipoEventos.LIKE -> new Like(
                    Usuario.getUsername(),
                    Contenido.getTexto());
            case CreadorTipoEventos.COMENTARIO -> new Comentario(
                    Usuario.getUsername(),
                    Contenido.getTexto());
            case FOLLOW -> new Follow(
                    Usuario.getUsername(),
                    Usuario.getUsername());
        };
}
}
