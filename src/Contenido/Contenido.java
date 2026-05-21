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

    protected Contenido() {
    }

    public void agregarLike(Usuario usuario) {
        likes.add(usuario);
    }

    @Override
    public void agregarObservador(
            Notificador Notificador) {

        Notificadores.add(Notificador);
    }

    @Override
    public void removerObservador(
            Notificador Notificador) {

        Notificadores.remove(Notificador);
    }

    @Override
    public void notificar(
            Evento evento) {

        for(Notificador Notificador
                : Notificadores) {

            Notificador.actualizar(
                    evento
            );
        }
    }

    public abstract void mostrar();
}
