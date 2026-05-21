package Usuarios;

import java.time.LocalDate;

public class Perfil {

    private final String nombreCompleto;
    private String biografia;
    private final String universidad;
    private final String carrera;

    private LocalDate fechaNacimiento;

    public Perfil(String nombreCompleto,
                  String universidad,
                  String carrera) {

        this.nombreCompleto = nombreCompleto;
        this.universidad = universidad;
        this.carrera = carrera;
    }

    public boolean estaCompleto() {

        return nombreCompleto != null &&
                universidad != null &&
                carrera != null;
    }
    public String getCarrera() {

        return carrera;
    }
}