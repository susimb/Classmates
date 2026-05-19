package InteraccionesUsuario;

public class ReporteContenido{

    private String motivo;
            Usuario emisor,
            Contenido contenido,
            String motivo) {

        super(emisor, contenido);

        this.motivo = motivo;


    @Override
    public void ejecutar() {

        System.out.println(
                "Contenido reportado por: " +
                        motivo
        );
    }
}