package InteraccionesUsuario;

public class MensajeDirecto extends InteraccionUsuario {
    private String mensaje;
    public MensajeDirecto(
            Usuario emisor,
            Usuario receptor,
            String mensaje) {

        super(emisor, receptor);

        this.mensaje = mensaje;
    }

    @Override
    public void ejecutar() {

        System.out.println(
                emisor.getUsername() +
                        " envió mensaje a " +
                        receptor.getUsername()
        );
    }
}