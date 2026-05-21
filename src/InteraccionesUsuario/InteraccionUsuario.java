package InteraccionesUsuario;

import Usuarios.Usuario;

public abstract class InteraccionUsuario
            extends interacciones.Interaccion {

        protected Usuario receptor;

        public InteraccionUsuario(
                Usuario emisor,
                Usuario receptor) {

            super(emisor);

            if(receptor == null) {

                throw new IllegalArgumentException(
                        "Receptor inválido."
                );
            }

            this.receptor = receptor;
        }

        public Usuario getReceptor() {

            return receptor;
        }
    }
