package Contenido;

class Foto extends Contenido {

    private String resolucion;
    private String formato;

    @Override
    public void reproducir() {
        System.out.println("Mostrando foto");
    }
}
