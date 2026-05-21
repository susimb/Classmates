package Usuarios;

public class CuentaVerificada extends CreadorContenido {
    private String insignia;
    private boolean verificada;

    public CuentaVerificada(String username,
                            String correo,
                            String password,
                            String insignia) {

        super(username, correo, password);

        this.insignia = insignia;
        this.verificada = true;
    }
    @Override
    public void interactuar() {

        System.out.println(
                getUsername() +
                        " está verificado"
        );
    }
}

