package InteraccionesContenido;

import Contenido.Contenido;
import Interacciones.Interaccion;
import Usuarios.Usuario;

public abstract class InteraccionesUtiles extends Interaccion {
    protected Contenido contenido;
    public InteraccionesUtiles(
            Usuario emisor,
            Contenido contenido) {
            super(emisor, contenido);
        this.contenido = contenido;
    }
}
