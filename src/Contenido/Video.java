package Contenido;

class Video extends Contenido {

    protected int duracion;
    @Override
    public void mostrar() {
        System.out.println("Reproduciendo video");
    }
}
