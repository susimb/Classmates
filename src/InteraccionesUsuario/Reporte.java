package InteraccionesUsuario;
public class Reporte extends Interaccion {

    private String motivo;

    public Reporte(
            Usuario emisor,
            Contenido contenido,
            String motivo) {

        super(emisor, contenido);

        if(motivo == null ||
                motivo.isBlank()) {

            throw new IllegalArgumentException(
                    "El motivo no puede estar vacío."
            );
        }

        this.motivo = motivo;
    }

    @Override
    public void ejecutar() {

        System.out.println(
                "Contenido reportado por: "
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