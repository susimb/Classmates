package InteraccionesUsuario;

import Interacciones.Interaccion;
import Usuarios.Usuario;

public abstract class InteraccionUsuario
            extends Interaccion {

        protected Usuario receptor;

        public InteraccionUsuario(
                Usuario emisor,
                Usuario receptor) {

            super(emisor);

            this.receptor = receptor;
        }

        public Usuario getReceptor() {

            return receptor;
        }
    }
