package Usuarios;

import Contenido.Contenido;
import Evento.Evento;
import Excepciones.ContenidoNoEncontrado;
import Excepciones.FollowInvalido;
import Excepciones.PerfilIncompleto;
import Excepciones.UsuarioNoEncontrado;
import Notificacion.Notificacion;
import Notificacion.PreferenciasNotificacion;
import Notificador.Notificador;

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

    // Observer Pattern
    protected Set<Notificador> observadores;

    protected PreferenciasNotificacion preferencias;

    public Usuario(
            String username,
            String correo,
            String password) {

        if(username == null ||
                username.isBlank()) {

            throw new IllegalArgumentException(
                    "Username inválido."
            );
        }

        if(correo == null ||
                correo.isBlank()) {

            throw new IllegalArgumentException(
                    "Correo inválido."
            );
        }

        if(password == null ||
                password.isBlank()) {

            throw new IllegalArgumentException(
                    "Contraseña inválida."
            );
        }

        this.id = UUID.randomUUID();

        this.username = username;

        this.correo = correo;

        this.password = password;

        this.fechaRegistro =
                LocalDateTime.now();

        this.amigos =
                new HashSet<>();

        this.publicaciones =
                new ArrayList<>();

        this.notificaciones =
                new LinkedList<>();

        this.observadores =
                new HashSet<>();

        this.preferencias =
                new PreferenciasNotificacion();
    }

    // MÉTODOS ABSTRACTOS

    public abstract void interactuar();

    public abstract boolean puedePublicar();

    // FUNCIONALIDADES GENERALES

    public void agregarAmigo(
            Usuario usuario) {

        if(usuario == null) {

            throw new UsuarioNoEncontrado();
        }

        if(usuario.equals(this)) {

            throw new FollowInvalido();
        }

        amigos.add(usuario);
    }

    public void eliminarAmigo(
            Usuario usuario) {

        if(usuario == null) {

            throw new UsuarioNoEncontrado();
        }

        amigos.remove(usuario);
    }

    public void publicar(
            Contenido contenido) {

        if(!puedePublicar()) {

            throw new UnsupportedOperationException(
                    "No tiene permisos para publicar."
            );
        }

        if(perfil == null ||
                !perfil.estaCompleto()) {

            throw new PerfilIncompleto();
        }

        if(contenido == null) {

            throw new ContenidoNoEncontrado();
        }

        publicaciones.add(contenido);

        Evento evento =
                new Evento();

        notificar(evento);
    }

    @Override
    public void actualizar(
            Evento evento) {

        if(evento == null) {

            return;
        }

        if(preferencias.permite(
                evento.getTipo())) {

            Notificacion notificacion =
                    new Notificacion(
                            evento.getMensaje(),
                            evento.getTipo()
                    );

            notificaciones.add(
                    notificacion
            );
        }
    }

    public void agregarObservador(
            Notificador notificador) {

        if(notificador != null) {

            observadores.add(
                    notificador
            );
        }
    }

    public void removerObservador(
            Notificador notificador) {

        observadores.remove(
                notificador
        );
    }

    public void notificar(
            Evento evento) {

        for(Notificador observador
                : observadores) {

            observador.actualizar(evento);
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

        return Collections.unmodifiableSet(
                amigos
        );
    }

    public List<Contenido>
    getPublicaciones() {

        return Collections.unmodifiableList(
                publicaciones
        );
    }

    public Queue<Notificacion>
    getNotificaciones() {

        return new LinkedList<>(
                notificaciones
        );
    }

    public PreferenciasNotificacion
    getPreferencias() {

        return preferencias;
    }

    // SETTERS

    public void setPerfil(
            Perfil perfil) {

        this.perfil = perfil;
    }

    public void setPreferencias(
            PreferenciasNotificacion
                    preferencias) {

        this.preferencias =
                preferencias;
    }

    // COMPARABLE

    @Override
    public int compareTo(
            Usuario otro) {

        return this.username
                .compareToIgnoreCase(
                        otro.username
                );
    }

    // EQUALS Y HASHCODE

    @Override
    public boolean equals(
            Object o) {

        if(this == o) {

            return true;
        }

        if(!(o instanceof Usuario)) {

            return false;
        }

        Usuario usuario =
                (Usuario) o;

        return id.equals(
                usuario.id
        );
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