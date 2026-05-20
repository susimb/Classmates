import java.util.ArrayList;

public class LoggerServicio {
    private ArrayList<Object> registros;
    public LoggerServicio() {
        registros = new ArrayList<>();
        }
        public void registrar(String accion) {

            registros.add(
                    new Registro(accion)
            );
        }
        public void mostrarHistorial() {

            for(Object registro : registros) {

                System.out.println(registro);
            }
        }
    }
