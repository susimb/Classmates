package InteraccionesUsuario;

import Usuarios.Usuario;

public class Follow extends Interaccion {

    public Follow(Usuario emisor,
                  Usuario receptor) {

        super(emisor, receptor);
    }

    @Override
    public void ejecutar() {

        receptor.agregarAmigo(emisor);

        System.out.println(
                emisor.getUsername() +
                        " comenzó a seguir a " +
                        receptor.getUsername()
        );
    }
}
