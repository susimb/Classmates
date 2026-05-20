import java.util.List;
public interface Estrategia {
    List<Contenido> generar(
            Usuario usuario
    );
}
