import Contenido.Contenido;
import Usuarios.TipoUsuario;
import Usuarios.Usuario;

import java.util.ArrayList;
import java.util.List;

import static Contenido.TipoContenido.FOTO;

public class Main {

    public static void main(String[] args) {
        LoggerServicio logger =
                new LoggerServicio();

        NotificacionServicio notificacionServicion =
                new NotificacionServicio();

        ModeracionServicio moderacionServicion =
                new ModeracionServicio();

        RecomendacionServicio recomendacionServicio =
                new RecomendacionServicio(
                        new Amigos(   ));

        Usuario creador =
                CreadorUsuario.crearUsuario(
                        TipoUsuario.CREADOR,
                        "Ana",
                        "ana@gmail.com",
                        "1234"
                );

        Usuario verificado =
                CreadorUsuario.crearUsuario(
                        TipoUsuario.VERIFICADO,
                        "Carlos",
                        "carlos@gmail.com",
                        "4321"
                );

        Usuario moderador =
                CreadorUsuario.crearUsuario(
                        TipoUsuario.MODERADOR,
                        "Laura",
                        "laura@gmail.com",
                        "9999"
                );

        creador.agregarAmigo(verificado);

        logger.registrar(
                "Ana siguió a Carlos"
        );


        Contenido reel =
                CreadorContenido.crearContenido(
                        FOTO,
                        creador,
                        "Mi primer Reel"
                );


        reel.agregarObservador(
                notificacionServicion
        );

        reel.agregarObservador(
                logger
        );

        reel.agregarObservador(
                moderacionServicion
        );


        creador.publicar(  );

        logger.registrar(
                "Usuarios publicaron contenido"
        );

        reel.agregarLike(verificado);

        logger.registrar(
                "Carlos dio like"
        );

        moderacionServicion.reportarContenido(
                reel,
                verificado,
                "Contenido sospechoso"
        );


        List<Contenido> contenidos =
                new ArrayList<>();

        contenidos.add( );


        FeedServicio feedServicio =
                new FeedServicio(
                        new Intereses(
                                contenidos
                        )
                );

        List<Contenido> feed =
                feedServicio.generarFeed(
                        creador
                );


        System.out.println(
                "FEED "
        );

        for(Contenido contenido : feed) {

            contenido.mostrar();
        }


        recomendacionServicio
                .recomendarContenido(
                        creador
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