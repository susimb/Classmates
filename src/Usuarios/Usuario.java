package Usuarios;

import Contenido.Contenido;
import Excepciones.ContenidoNoEncontrado;
import Excepciones.PerfilIncompleto;
import Notificacion.Notificacion;
import Notificacion.PreferenciasNotificacion;
import Notificador;
import java.time.LocalDateTime;
import java.util.*;

public abstract class Usuario
        implements Comparable<Usuario>, Notificador {

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

    protected Set<Notificador> notificadores;

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

        this.notificadores = new HashSet<>();
    }

    public abstract void interactuar();

    public abstract boolean puedePublicar();

    // FUNCIONALIDADES GENERALES

    public void agregarAmigo(Usuario usuario) {

        if (usuario == null) {

            throw new UsuarioNoEncontrado();
        }

        if (usuario.equals(this)) {

            throw new FollowInvalido();
        }

        amigos.add(usuario);
    }

    public void eliminarAmigo(Usuario usuario) {

        amigos.remove(usuario);
    }

    public void publicar(Contenido contenido) {

        if (perfil == null ||
                !perfil.estaCompleto()) {

            throw new PerfilIncompleto();
        }

        if (contenido == null) {

            throw new ContenidoNoEncontrado();
        }

        publicaciones.add(contenido);
    }

    @Override
    public void actualizar(Evento evento) {

        if (evento == null) {

            return;
        }

        if (preferencias.permite(evento.getTipo())) {

            Notificacion notificacion =
                    new Notificacion(
                            evento.getMensaje(),
                            evento.getTipo()
                    );

            notificaciones.add(notificacion);
        }
    }

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
    }

    public List<Contenido> getPublicaciones() {

        return Collections.unmodifiableList(publicaciones);
    }

    public Queue<Notificacion> getNotificaciones() {

        return notificaciones;
    }

    public PreferenciasNotificacion getPreferencias() {

        return preferencias;
    }

    public void setPerfil(Perfil perfil) {

        this.perfil = perfil;
    }

    public void setPreferencias(
            PreferenciasNotificacion preferencias) {

        this.preferencias = preferencias;
    }

    @Override
    public int compareTo(Usuario otro) {

        return this.username.compareToIgnoreCase(
                otro.username
        );
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) {

            return true;
        }

        if (!(o instanceof Usuario)) {

            return false;
        }

        Usuario usuario = (Usuario) o;

        return id.equals(usuario.id);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id);
    }

    public void agregarObservador(
            Notificador notificador) {

        notificadores.add(notificador);
    }

    public void removerObservador(
            Notificador notificador) {

        notificadores.remove(notificador);
    }

    public void notificar(
            Evento evento) {

        for (Notificador notificador
                : notificadores) {

            notificador.actualizar(evento);
        }
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