package Contenido;

import Usuarios.Usuario;

public class Video extends Contenido {
    public Video(
            Usuario autor,
            String tiltulo) {

        super(autor, tiltulo);
    }
    @Override
    public void mostrar() {
        System.out.println("Reproduciendo video");
    }
}
