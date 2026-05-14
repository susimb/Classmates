import java.util.List;
import java.util.UUID;
abstract class Usuario {

    protected UUID id;
    protected String nombre;
    protected String correo;
    protected password;
    protected Perfil perfil;
    private List<Usuario> amigos;
    private List<SolicitudAmistad> solicitudes;
    private List<Contenido> publicaciones;
    private List<Notificacion> notificaciones;
    public abstract void interactuar();
}
