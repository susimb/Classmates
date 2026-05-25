package InteraccionesContenido;

import Usuarios.Usuario;

public class Comentario extends InteraccionesUtiles {

    private String texto;

    public Comentario(String usuario,
                      String texto) {

        super(usuario, texto);

        this.texto = texto;
    }

    @Override
    public void ejecutar() {

        System.out.println(
                Usuario.getUsername() +
                        " comentó: " +
                        texto
        );
    }

    public String getTexto() {
        return texto;
    }
}