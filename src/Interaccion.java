package interacciones;

import Usuarios.Usuario;

import java.time.LocalDateTime;
import java.util.UUID;

public abstract class Interaccion {

    protected UUID id;

    protected Usuario emisor;

    protected LocalDateTime fecha;

    public Interaccion(
            Usuario emisor) {

        if(emisor == null) {

            throw new IllegalArgumentException(
                    "El emisor no puede ser null."
            );
        }

        this.id = UUID.randomUUID();

        this.emisor = emisor;

        this.fecha = LocalDateTime.now();
    }

    public Usuario getEmisor() {

        return emisor;
    }

    public LocalDateTime getFecha() {

        return fecha;
    }

    public abstract void ejecutar();
}