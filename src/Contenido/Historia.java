package Contenido;

import java.time.LocalDateTime;

class Historia extends Contenido {
    private LocalDateTime expiracion;
    @Override
    public void mostrar() {
        System.out.println("Mostrando historia");
    }
}
