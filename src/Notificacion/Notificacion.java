package Notificacion;

import java.time.LocalDateTime;

public class Notificacion {

    private String mensaje;
    private TipoNotificacion tipo;

    private final LocalDateTime fecha;

    public Notificacion(String mensaje) {

        this.mensaje = mensaje;

        this.fecha = LocalDateTime.now();

        boolean leida = false;
    }

    public TipoNotificacion getTipo() {
        return tipo;
    }

    public void setTipo(TipoNotificacion tipo) {
        this.tipo = tipo;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }
}