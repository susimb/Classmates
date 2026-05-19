package Contenido;

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

    public Contenido(Usuario autor) {
        this.id = UUID.randomUUID();
        this.autor = autor;

        this.fecha = LocalDateTime.now();

        this.likes = new HashSet<>();
    }

    public void agregarLike(Usuario usuario) {
        likes.add(usuario);
    }

    public abstract void mostrar();
}
