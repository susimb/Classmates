package Contenido;

class Video extends Contenido {

    protected int duracion;
    @Override
    public void reproducir() {
        System.out.println("Reproduciendo video");
    }
}
