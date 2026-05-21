package InteraccionesContenido;

public abstract class InteraccionesUtiles extends Interaccion {
    protected Contenido contenido;
    public InteraccionesUtiles(
            Usuario emisor,
            Contenido contenido) {
            super(emisor);
        this.contenido = contenido;
    }
}
