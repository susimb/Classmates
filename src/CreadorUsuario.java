import Usuarios.CuentaVerificada;
import Usuarios.Moderador;
import Usuarios.TipoUsuario;
import Usuarios.Usuario;

public class CreadorUsuario {
    public static Usuario crearUsuario(
            TipoUsuario tipo,
            String username,
            String correo,
            String password) {

        switch (tipo) {

            case CREADOR:

                return new CreadorContenido(
                        username,
                        correo,
                        password
                    );
                case VERIFICADO:

                    return new CuentaVerificada(
                            username,
                            correo,
                            password,
                            "Azul"
                    );

                case MODERADOR:

                    return new Moderador(
                            username,
                            correo,
                            password
                    );

                default:

                    throw new IllegalArgumentException(
                            "Tipo no valido"
                    );
            }
        }
    }
