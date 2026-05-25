package InteraccionesUsuario;

import Usuarios.Usuario;

public class Follow
        extends InteraccionUsuario {

    public Follow(
            String emisor,
            String receptor) {

        super(emisor, receptor);
    }

    @Override
    public void ejecutar() {

        emisor.agregarAmigo(receptor);

        System.out.println(
                Usuario.getUsername()
                        + " siguió a "
                        + Usuario.getUsername()
        );
    }
}
