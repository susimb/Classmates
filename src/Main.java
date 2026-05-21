public class Main {

    public static void main(String[] args) {

        // =========================
        // SERVICIOS
        // =========================

        LoggerService logger =
                new LoggerService();

        NotificationService notificationService =
                new NotificationService();

        ModerationService moderationService =
                new ModerationService();

        RecommendationService recommendationService =
                new RecommendationService(
                        new RecomendacionPopularidad()
                );

        // =========================
        // USUARIOS
        // =========================

        Usuario creador =
                UsuarioFactory.crearUsuario(
                        TipoUsuario.CREADOR,
                        "Ana",
                        "ana@gmail.com",
                        "1234"
                );

        Usuario verificado =
                UsuarioFactory.crearUsuario(
                        TipoUsuario.VERIFICADO,
                        "Carlos",
                        "carlos@gmail.com",
                        "4321"
                );

        Usuario moderador =
                UsuarioFactory.crearUsuario(
                        TipoUsuario.MODERADOR,
                        "Laura",
                        "laura@gmail.com",
                        "9999"
                );

        // =========================
        // RELACIONES
        // =========================

        creador.agregarAmigo(verificado);

        logger.registrar(
                "Ana siguió a Carlos"
        );

        // =========================
        // CONTENIDO
        // =========================

        Contenido reel =
                ContenidoFactory.crearContenido(
                        TipoContenido.REEL,
                        creador,
                        "Mi primer Reel"
                );

        Contenido podcast =
                ContenidoFactory.crearContenido(
                        TipoContenido.PODCAST,
                        verificado,
                        "Podcast Tecnología"
                );

        // =========================
        // OBSERVER
        // =========================

        reel.agregarObservador(
                notificationService
        );

        reel.agregarObservador(
                logger
        );

        reel.agregarObservador(
                moderationService
        );

        // =========================
        // PUBLICACIONES
        // =========================

        creador.publicar(reel);

        verificado.publicar(podcast);

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

        moderationService.reportarContenido(
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
                        creador
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

        recommendationService
                .recomendarContenido(
                        creador
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