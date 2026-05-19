import java.time.LocalDateTime;
import java.util.UUID;

public abstract class Interaccion {
    protected UUID id;

    protected Usuario emisor;

    protected LocalDateTime fecha;

    public Interaccion(Usuario emisor) {

        this.id = UUID.randomUUID();

        this.emisor = emisor;

        this.fecha = LocalDateTime.now();
    }

    public abstract void ejecutar();

    public UUID getId() {
        return id;
    }

    public Usuario getEmisor() {
        return emisor;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }
}