
package Banco;

public class Cliente {
    private String nombre;
    private String usuario;
    private String contraseña;
    private String banco;

    public Cliente() {
    }

    public Cliente(String nombre, String usuario, String contraseña, String banco) {
        this.nombre = nombre;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.banco = banco;
    }

    public String getNombre() {
        return nombre;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public String getBanco() {
        return banco;
    }

    @Override
    public String toString() {
        return "Nombre: "+nombre+
                "\nUsuario: "+usuario+
                "\nContraseña: "+contraseña+
                "\nBanco: "+banco;
    }
    
}
