package Contenido;

public class Foto extends Contenido {

    private String resolucion;
    private String formato;

    @Override
    public void mostrar() {
        System.out.println("Mostrando foto");
    }
}
