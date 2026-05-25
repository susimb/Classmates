package InteraccionesContenido;

import Contenido.Contenido;
import Usuarios.Usuario;

public class Like
        extends InteraccionesUtiles {

    public Like(
            String emisor,
            String contenido) {

        super(emisor, contenido);
    }

    @Override
    public void ejecutar() {

        Contenido.agregarLike(emisor);

        System.out.println(
                Usuario.getUsername() +
                        " dio like"
        );
    }
}