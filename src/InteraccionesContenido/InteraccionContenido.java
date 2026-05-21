package InteraccionesContenido;

public abstract class InteraccionContenido extends Interaccion {
    protected Contenido contenido;
    public InteraccionContenido(
            Usuario emisor,
            Contenido contenido) {
            super(emisor);
        this.contenido = contenido;
    }
}
