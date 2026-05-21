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
                emisor.getUsername()
                        + " envió un mensaje a "
                        + receptor.getUsername()
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