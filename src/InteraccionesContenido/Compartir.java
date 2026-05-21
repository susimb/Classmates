package InteraccionesContenido;

import Contenido.Contenido;
import Usuarios.Usuario;

public class Compartir
        extends InteraccionesUtiles {

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
