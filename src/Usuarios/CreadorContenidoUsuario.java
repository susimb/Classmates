package Usuarios;

public class CreadorContenidoUsuario extends Usuario {

    private int totalSeguidores;

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

    public void aumentarSeguidores() {
        totalSeguidores++;
    }

    public int getTotalSeguidores() {
        return totalSeguidores;
    }
}
