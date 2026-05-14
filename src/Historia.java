import java.time.LocalDateTime;

class Historia extends Contenido {
    private LocalDateTime expiracion;
    @Override
    public void reproducir() {
        System.out.println("Mostrando historia");
    }
}
