import java.util.HashSet;
import java.util.Set;

public class ModeracionServicio implements Notificador{

    private Set<Usuario> usuariosSuspendidos;

    public ModerationService() {

        usuariosSuspendidos = new HashSet<>();
    }

    public void reportarContenido(
            Contenido contenido,
            Usuario usuario,
            String motivo) {

        System.out.println(
                usuario.getUsername() +
                        " reportó contenido por: " +
                        motivo
        );
    }

    public void suspenderUsuario(
            Usuario usuario) {

        usuariosSuspendidos.add(usuario);

        System.out.println(
                "Usuario suspendido: " +
                        usuario.getUsername()
        );
    }

    public void eliminarContenido(
            Contenido contenido) {

        System.out.println(
                "Contenido eliminado por moderación"
        );
    }

    public boolean estaSuspendido(
            Usuario usuario) {

        return usuariosSuspendidos.contains(usuario);
    }
    @Override
        public void actualizar(
                Evento evento) {

            System.out.println(
                    "Moderación recibió evento"
            );
        }
}