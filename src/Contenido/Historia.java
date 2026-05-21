package Contenido;

import Usuarios.Usuario;

public class Historia extends Contenido {
    public Historia(Usuario autor) {
        super(autor);
    }

    @Override
    public void mostrar() {
        System.out.println("Mostrando historia");
    }
}
