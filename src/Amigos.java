public class Amigos {
        private List<Contenido> contenidos;

        public FeedAmigos(
                List<Contenido> contenidos) {

            this.contenidos = contenidos;
        }

        @Override
        public List<Contenido>
        generar(Usuario usuario) {

            List<Contenido> feed =
                    new ArrayList<>();

            for(Contenido contenido : contenidos) {

                if(usuario.getAmigos()
                        .contains(
                                contenido.getAutor()
                        )) {

                    feed.add(contenido);
                }
            }

            return feed;
        }
    }
