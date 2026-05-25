package InteraccionesUsuario;

import Usuarios.Usuario;

public class MensajeDirecto
        extends InteraccionUsuario {

    private String mensaje;

    public MensajeDirecto(
            Usuario emisor,
            Usuario receptor,
            String mensaje) {

        super(emisor, receptor);

        if(mensaje == null ||
                mensaje.isBlank()) {

            throw new IllegalArgumentException(
                    "El mensaje no puede estar vacío."
            );
        }

        this.mensaje = mensaje;
    }

    @Override
    public void ejecutar() {

        System.out.println(
                Usuario.getUsername()
                        + " envió un mensaje a "
                        + Usuario.getUsername()
                        + ": "
                        + mensaje
        );
    }

    public String getMensaje() {

        return mensaje;
    }

    @Override
    public String toString() {

        return "MensajeDirecto{" +
                "mensaje='" + mensaje + '\'' +
                ", emisor=" + emisor +
                ", receptor=" + receptor +
                '}';
    }
}