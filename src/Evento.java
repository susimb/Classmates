import java.time.LocalDateTime;

public abstract class Evento {

    protected String mensaje;

    protected LocalDateTime fecha;

    public Evento(String mensaje) {

        this.mensaje = mensaje;

        this.fecha = LocalDateTime.now();
    }

    public String getMensaje() {
        return mensaje;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }
}