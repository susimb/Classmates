package Contenido;

import Usuarios.Usuario;

public class Foto extends Contenido {
    public Foto(Usuario autor, String Informacion) {
        super(autor, Informacion);
    }

    @Override
    public void mostrar() {
        System.out.println("Mostrando foto");
    }
}
