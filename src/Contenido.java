import java.time.LocalDateTime;
import java.util.Set;
import java.util.UUID;

abstract class Contenido {
    protected Usuario autor;
    protected LocalDateTime fecha;
    protected UUID id;
    protected Set<Usuario> likes;
    public abstract void reproducir();

}
