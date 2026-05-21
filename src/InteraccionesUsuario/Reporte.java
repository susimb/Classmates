package InteraccionesContenido;

import Contenido.Contenido;

import Usuarios.Usuario;

public class Reporte
        extends InteraccionContenido {

    private String motivo;

    public Reporte(
            Usuario emisor,
            Contenido contenido,
            String motivo) {

        super(emisor, contenido);

        if(motivo == null ||
                motivo.isBlank()) {

            throw new IllegalArgumentException(
                    "Motivo inválido."
            );
        }

        this.motivo = motivo;
    }

    @Override
    public void ejecutar() {

        System.out.println(
                emisor.getUsername()
                        + " reportó el contenido por: "
                        + motivo
        );
    }

    public String getMotivo() {

        return motivo;
    }

    @Override
    public String toString() {

        return "Reporte{" +
                "motivo='" + motivo + '\'' +
                ", contenido=" + contenido +
                '}';
    }
}