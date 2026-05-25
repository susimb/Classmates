package Usuarios;

public class CreadorContenidoUsuario extends Usuario {

    public CreadorContenidoUsuario(String username,
                                   String correo,
                                   String password) {

        super(username, correo, password);
    }

    @Override
    public void interactuar() {

        System.out.println(
                getUsername() +
                        " está creando contenido"
        );
    }

    @Override
    public boolean puedePublicar() {
        return true;
    }
}
