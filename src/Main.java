import java.util.ArrayList;
import java.util.List;

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

        foto.agregarLike(verificado);

        logger.registrar(
                "Carlos dio like"
        );

        moderacionServicio.reportarContenido(
                video,
                verificado,
                "Contenido Reportado"
        );

        List<Contenido> contenidos =
                new ArrayList<>();

        contenidos.add(foto);

        FeedServicio feedServicio =
                new FeedServicio(
                        new Amigos(
                                contenidos
                        )
                );

        List<Contenido> feed =
                feedServicio.generarFeed(
                        CREADOR
                );
        System.out.println(
                "FEED"
        );

        for(Contenido contenido : feed) {

            contenido.mostrar();
        }

        RecomendacionServicio
                .recomendarContenido(
                        CREADOR
                );
        System.out.println(
                "LOGS"
        );

        logger.mostrarHistorial();

        System.out.println(
                "Sistema ejecutado correctamente."
        );
    }
}