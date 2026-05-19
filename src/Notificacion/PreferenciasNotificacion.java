package Notificacion;

import java.util.HashSet;
import java.util.Set;

public class PreferenciasNotificacion {
    private Set<TipoNotificacion> permitidas;

    public PreferenciasNotificacion() {

        permitidas = new HashSet<>();

        permitidas.add(TipoNotificacion.Like);
        permitidas.add(TipoNotificacion.Comentario);
    }
    public boolean permite(TipoNotificacion tipo) {
        return permitidas.contains(tipo);
    }
    public void activar(TipoNotificacion tipo) {
        permitidas.add(tipo);
    }

    public void desactivar(TipoNotificacion tipo) {
        permitidas.remove(tipo);
    }
}
