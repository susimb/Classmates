package Evento;

public class Evento {

    private String mensaje;

    private String tipo;

    public Evento(
            String mensaje,
            String tipo) {

        this.mensaje = mensaje;

        this.tipo = tipo;
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