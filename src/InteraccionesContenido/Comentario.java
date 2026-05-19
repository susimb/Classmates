package InteraccionesContenido;

public class Comentario extends InteraccionContenido {

    private String texto;

    public Comentario(Usuario emisor,
                      Contenido contenido,
                      String texto) {

        super(emisor, contenido);

        this.texto = texto;
    }

    @Override
    public void ejecutar() {

        System.out.println(
                emisor.getUsername() +
                        " comentó: " +
                        texto
        );
    }

    public String getTexto() {
        return texto;
    }
}