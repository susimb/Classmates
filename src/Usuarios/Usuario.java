package Usuarios;

import Contenido.Contenido;
import Notificacion.Notificacion;
import java.time.LocalDateTime;
import java.util.*;


public abstract class Usuario {
    protected UUID id;
    protected String username;
    protected String correo;
    protected String password;
    protected LocalDateTime fechaRegistro;
    protected Perfil perfil;
    protected Set<Usuario> amigos;
    protected List<Contenido> publicaciones;
    protected Queue<Notificacion> notificaciones;
    protected PreferenciasNotificacion preferencias;
    public Usuario(String username,
               String correo,
               String password) {

    this.id = UUID.randomUUID();
    this.username = username;
    this.correo = correo;
    this.password = password;

    this.fechaRegistro = LocalDateTime.now();
    this.amigos = new HashSet<>();
    this.publicaciones = new ArrayList<>();
    this.notificaciones = new LinkedList<>();
    this.preferencias = new PreferenciasNotificacion();
    }

// MÉTODOS ABSTRACTOS
public abstract void interactuar();

public abstract boolean puedePublicar();

// FUNCIONALIDADES GENERALES
public void agregarAmigo(Usuario usuario) {

    if(usuario == null) {
        throw new OperacionInvalidaException(
                "El usuario no puede ser null"
        );
    }

    if(this.equals(usuario)) {
        throw new OperacionInvalidaException(
                "No puedes agregarte a ti mismo"
        );
    }

    amigos.add(usuario);
}
public void eliminarAmigo(Usuario usuario) {
    amigos.remove(usuario);
}


public void publicar(Contenido contenido) {

    if(!puedePublicar()) {
        throw new OperacionInvalidaException(
                "Este tipo de usuario no puede publicar"
        );
    }

    if(perfil == null || !perfil.estaCompleto()) {
        throw new OperacionInvalidaException(
                "Debe completar el perfil antes de publicar"
        );
    }

    publicaciones.add(contenido);
}
//  Notificador
    @Override
    public void actualizar(Evento evento) {

    if(evento == null) {
        return;
    }

    if(preferencias.permite(evento.getTipo())) {

        Notificacion notificacion =
                new Notificacion(
                        evento.getMensaje(),
                        evento.getTipo()
                );

        notificaciones.add(notificacion);
    }
}
// GETTERS

public UUID getId() {
    return id;
}

public String getUsername() {
    return username;
}

public String getCorreo() {
    return correo;
}

public Perfil getPerfil() {
    return perfil;
}

public Set<Usuario> getAmigos() {
    return Collections.unmodifiableSet(amigos);

public List<Contenido> getPublicaciones() {
        return Collections.unmodifiableList(publicaciones);
    }
public Queue<Notificacion> getNotificaciones() {
        return notificaciones;
    }
public PreferenciasNotificacion getPreferencias() {
        return preferencias;
    }
}
// SETTERS

public void setPerfil(Perfil perfil) {
    this.perfil = perfil;
}

public void setPreferencias(
        PreferenciasNotificacion preferencias) {

    this.preferencias = preferencias;
}

// COMPARABLE

@Override
public int compareTo(Usuario otro) {
    return this.username.compareToIgnoreCase(
            otro.username
    );
}
// EQUALS Y HASHCODE
@Override
public boolean equals(Object o) {

    if(this == o) {
        return true;
    }

    if(!(o instanceof Usuario)) {
        return false;
    }

    Usuario usuario = (Usuario) o;

    return id.equals(usuario.id);
}
@Override
public int hashCode() {
    return Objects.hash(id);
}

// TOSTRING
@Override
public String toString() {

    return "Usuario{" +
            "id=" + id +
            ", username='" + username + '\'' +
            ", correo='" + correo + '\'' +
            ", fechaRegistro=" + fechaRegistro +
            '}';
}
}
