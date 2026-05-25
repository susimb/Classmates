package Interacciones;

import Usuarios.Usuario;

import java.time.LocalDateTime;
import java.util.UUID;

public abstract class Interaccion {

    protected UUID id;

    protected Usuario emisor;

    protected LocalDateTime fecha;

    public Interaccion(
            Usuario usuario) {

        this.id = UUID.randomUUID();

        this.fecha = LocalDateTime.now();
    }

    public Interaccion(String emisor, String contenido) {
    }

    protected Interaccion(String emisor) {
    }

    public Usuario getEmisor() {

        return emisor;
    }

    public LocalDateTime getFecha() {

        return fecha;
    }

    public abstract void ejecutar();
}