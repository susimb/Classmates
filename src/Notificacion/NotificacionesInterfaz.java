package Notificacion;

import Evento.Evento;
import Notificador.Notificador;

public interface NotificacionesInterfaz {

    void agregarNotificador(
                Notificador Notificador
        );

    void removerNotificador(
                Notificador Notificador
        );

    void notificar(
                Evento evento
        );
    }
