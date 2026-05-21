package InteraccionesContenido;

import Contenido.Contenido;
import Usuarios.Usuario;

public class Comentario extends InteraccionesUtiles {

    private Contenido texto;

    public Comentario(Usuario usuario,
                      Contenido texto) {

        super(usuario, texto);

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

    public Contenido getTexto() {
        return texto;
    }
}