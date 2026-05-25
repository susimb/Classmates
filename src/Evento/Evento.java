package Evento;

public class Evento {

    private String mensaje;

    private final String tipo;

    public Evento(String mensaje) {
        this.mensaje = mensaje;
        tipo = "";
    }

    public String getMensaje() {

        return mensaje;
    }

    public String getTipo() {

        return tipo;
    }

    @Override
    public String toString() {

        return "Evento{" +
                "mensaje='" + mensaje + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}