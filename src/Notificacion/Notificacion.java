package Notificacion;

import java.time.LocalDateTime;

public class Notificacion {

    private String mensaje;
    private TipoNotificacion tipo;

    private LocalDateTime fecha;

    private boolean leida;

    public Notificacion(String mensaje,
                        TipoNotificacion tipo) {

        this.mensaje = mensaje;
        this.tipo = tipo;

        this.fecha = LocalDateTime.now();

        this.leida = false;
    }
    public void Leida() {
        leida = true;
    }
}