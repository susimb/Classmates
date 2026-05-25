package InteraccionesContenido;

public class Compartir
        extends InteraccionesUtiles {

    public Compartir(String emisor, String contenido) {
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
