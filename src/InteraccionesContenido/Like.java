package InteraccionesContenido;

public class Like extends InteraccionesUtiles {

    public Like(Usuario emisor,
                Contenido contenido) {

        super(emisor, contenido);
    }

    @Override
    public void ejecutar() {

        contenido.agregarLike(emisor);

        System.out.println(
                emisor.getUsername() +
                        " dio like"
        );
    }
}
