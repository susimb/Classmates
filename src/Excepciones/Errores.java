package Excepciones;

public class Errores extends RuntimeException {
        public Errores(
                String mensaje) {

            super(mensaje);
        }
    }
