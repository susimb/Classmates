package interacciones.contenido;


import Contenido.Contenido;
import InteraccionesContenido.InteraccionesUtiles;
import Usuarios.Usuario;

public class Like
        extends InteraccionesUtiles {

    public Like(
            Usuario emisor,
            Contenido contenido) {

        super(emisor, contenido);
    }

    @Override
    public void ejecutar() {

        Contenido.agregarLike(emisor);

        System.out.println(
                emisor.getUsername() +
                        " dio like"
        );
    }
}