package InteraccionesUsuario;

import Usuarios.Usuario;

public class Follow
        extends InteraccionUsuario {

    public Follow(
            Usuario emisor,
            Usuario receptor) {

        super(emisor, receptor);
    }

    @Override
    public void ejecutar() {

        emisor.agregarAmigo(receptor);

        System.out.println(
                emisor.getUsername()
                        + " siguió a "
                        + receptor.getUsername()
        );
    }
}
