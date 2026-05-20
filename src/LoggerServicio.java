public class LoggerServicio {
    private List<Registro> registros;
    public LoggerServicio() {
        registros = new ArrayList<>();
        }
        public void registrar(String accion) {

            registros.add(
                    new Registro(accion)
            );
        }
        public void mostrarHistorial() {

            for(Registro registro : registros) {

                System.out.println(registro);
            }
        }
    }
