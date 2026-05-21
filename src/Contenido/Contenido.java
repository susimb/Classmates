package Contenido;

import InteraccionesContenido.Comentario;
import Usuarios.Usuario;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public abstract class Contenido {

    protected UUID id;

    protected Usuario autor;

    protected LocalDateTime fecha;

    protected Set<Usuario> likes;

    protected Set<Comentario> comentarios;

    protected Set<Notificador> notificadores;

    public Contenido(Usuario autor) {

        this.id = UUID.randomUUID();

        this.autor = autor;

        this.fecha = LocalDateTime.now();

        this.likes = new HashSet<>();

        this.comentarios = new HashSet<>();

        this.notificadores = new HashSet<>();
    }

    protected Contenido() {
    }
    protected String categoria;

    public String getCategoria() {

        return categoria;
    }

    public void agregarLike(Usuario usuario) {

        if (usuario == null) {

            throw new UsuarioNoEncontrado();
        }

        if (likes.contains(usuario)) {

            throw new LikeDuplicado();
        }

        likes.add(usuario);
    }

    public void agregarObservador(Notificador notificador) {

        notificadores.add(notificador);
    }

    public void removerObservador(Notificador notificador) {

        notificadores.remove(notificador);
    }

    public void notificar(Evento evento) {

        for (Notificador notificador : notificadores) {

            notificador.actualizar(evento);
        }
    }

    public void agregarComentario(Comentario comentario) {

        if (comentario == null) {

            throw new OperacionInvalida(
                    "Comentario inválido."
            );
        }

        if (comentario.getTexto().isBlank()) {

            throw new ComentarioVacio();
        }

        comentarios.add(comentario);
    }

    public abstract void mostrar();
}