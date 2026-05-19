package InteraccionesContenido;

package model.interaccion;

import model.contenido.Contenido;
import model.usuario.Usuario;

public class Compartir
        extends InteraccionContenido {

    public Compartir(Usuario emisor,
                     Contenido contenido) {

        super(emisor, contenido);
    }

    @Override
    public void ejecutar() {

        System.out.println(
                emisor.getUsername() +
                        " compartió contenido"
        );
    }
}
