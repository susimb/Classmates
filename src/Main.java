import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        LoggerServicio logger =
                new LoggerServicio();

        NotificacionServicio notificacionServicio =
                new NotificacionServicio();

        ModeracionServicio moderacionServicio =
                new ModeracionServicio();

        RecomendacionServicio RecomendacionServicio =
                new RecomendacionServicio(
                        new Amigos()
                );

        Usuario CREADOR =
                CreadorUsuario.crearUsuario(
                        TipoUsuario.CREADOR,
                        "Ana",
                        "ana@gmail.com",
                        "1234"
                );

        Usuario VERIFICADO =
                CreadorUsuario.crearUsuario(
                        TipoUsuario.VERIFICADO,
                        "Carlos",
                        "carlos@gmail.com",
                        "4321"
                );

        Usuario MODERADOR =
                CreadorUsuario.crearUsuario(
                        TipoUsuario.MODERADOR,
                        "Laura",
                        "laura@gmail.com",
                        "0000"
                );

        CREADOR.agregarAmigo(verificado);

        logger.registrar(
                "Ana siguió a Carlos"
        );

        Contenido foto =
                CreadorContenido.crearContenido(
                        TipoContenido.FOTO,
                        CREADOR,
                        "Hola!"
                );
        foto.agregarNotificador(
                notificacionServicion
        );

        foto.agregarNotificador(
                loggerServicio
        );

        foto.agregarNotificador(
                ModeracionServicio
        );

        CREADOR.publicar(foto);

        verificado.publicar(video);

        logger.registrar(
                "Usuarios publicaron contenido"
        );

        // =========================
        // INTERACCIONES
        // =========================

        reel.agregarLike(verificado);

        logger.registrar(
                "Carlos dio like"
        );

        // =========================
        // MODERACIÓN
        // =========================

        moderacionServicio.reportarContenido(
                reel,
                verificado,
                "Contenido sospechoso"
        );

        // =========================
        // FEED
        // =========================

        List<Contenido> contenidos =
                new ArrayList<>();

        contenidos.add(reel);

        contenidos.add(podcast);

        FeedService feedService =
                new FeedService(
                        new FeedPopularidad(
                                contenidos
                        )
                );

        List<Contenido> feed =
                feedService.generarFeed(
                        CREADOR
                );

        // =========================
        // MOSTRAR FEED
        // =========================

        System.out.println(
                "\n===== FEED ====="
        );

        for(Contenido contenido : feed) {

            contenido.mostrar();
        }

        // =========================
        // RECOMENDACIONES
        // =========================

        RecomendacionServicio
                .recomendarContenido(
                        CREADOR
                );

        // =========================
        // HISTORIAL
        // =========================

        System.out.println(
                "\n===== LOGS ====="
        );

        logger.mostrarHistorial();

        // =========================
        // FIN
        // =========================

        System.out.println(
                "\nSistema ejecutado correctamente."
        );
    }
}