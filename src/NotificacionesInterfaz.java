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
}
