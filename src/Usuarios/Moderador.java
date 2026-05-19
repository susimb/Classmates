package Usuarios;

public class Moderador extends Usuario {

    private int contenidosEliminados;

    public Moderador(String username,
                     String correo,
                     String password) {

        super(username, correo, password);
    }

    @Override
    public void interactuar() {

        System.out.println(
                getUsername() +
                        " está moderando la plataforma"
        );
    }

    @Override
    public boolean puedePublicar() {
        return false;
    }

    public void eliminarContenido(Contenido contenido) {

        if(contenido == null) {

            System.out.println(
                    "No se puede eliminar un contenido null"
            );

            return;
        }

        contenidosEliminados++;

        System.out.println(
                "Contenido eliminado por moderación"
        );
    }

    public void suspenderUsuario(Usuario usuario) {

        System.out.println(
                "Usuario suspendido: " +
                        usuario.getUsername()
        );
    }

    public int getContenidosEliminados() {
        return contenidosEliminados;
    }

    @Override
    public String toString() {

        return "Moderador{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", contenidosEliminados=" +
                contenidosEliminados +
                '}';
    }
}

