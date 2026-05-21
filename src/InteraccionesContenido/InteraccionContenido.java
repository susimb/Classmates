package InteraccionesContenido;

import Contenido.Contenido;

import Usuarios.Usuario;

public abstract class InteraccionContenido
        extends interacciones.Interaccion {

    protected Contenido contenido;

    public InteraccionContenido(
            Usuario emisor,
            Contenido contenido) {

        super(emisor);

        if(contenido == null) {

            throw new IllegalArgumentException(
                    "Contenido inválido."
            );
        }

        this.contenido = contenido;
    }

    public Contenido getContenido() {

        return contenido;
    }
}