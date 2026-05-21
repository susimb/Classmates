import Notificacion.Notificacion;
import Usuarios.Usuario;

public class NotificacionServicio implements Notificador {
    @Override
        public void actualizar(Evento evento) {
            System.out.println(
                    "Nuevo evento recibido: " +
                            evento.getMensaje()
            );
        }
        public void enviarNotificacion(
                Usuario usuario,
                Notificacion notificacion) {

            usuario.getNotificaciones()
                    .add(notificacion);

            System.out.println(
                    "Notificación enviada a " +
                            usuario.getUsername()
            );
        }
    }

