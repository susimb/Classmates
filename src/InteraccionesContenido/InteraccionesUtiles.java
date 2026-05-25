package InteraccionesContenido;

import Interacciones.Interaccion;

public abstract class InteraccionesUtiles extends Interaccion {
    protected String contenido;

    public InteraccionesUtiles(
            String emisor,
            String contenido) {
        super(emisor, contenido);
        this.contenido = contenido;
    }
}
