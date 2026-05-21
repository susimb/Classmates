import Usuarios.Usuario;

import java.util.List;

public class ReporteServicio {
    public void exportarUsuarios(
                List<Usuario> usuarios) {

            System.out.println(
                    "===== REPORTE DE USUARIOS ====="
            );

            for(Usuario usuario : usuarios) {
                System.out.println(usuario);
            }
    }
    public void exportarActividad() {

            System.out.println(
                    "Exportando actividad del sistema"
            );
        }
    }