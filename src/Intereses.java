public class Intereses {
    private List<Contenido> contenidos;

    public FeedIntereses(
            List<Contenido> contenidos) {

        this.contenidos = contenidos;
    }

    @Override
    public List<Contenido>
    generar(Usuario usuario) {

        List<Contenido> feed =
                new ArrayList<>();

        for(Contenido contenido : contenidos) {

            if(contenido.getCategoria()
                    .equalsIgnoreCase(
                            usuario.getPerfil()
                                    .getCarrera()
                    )) {

                feed.add(contenido);
            }
        }

        return feed;
    }
}