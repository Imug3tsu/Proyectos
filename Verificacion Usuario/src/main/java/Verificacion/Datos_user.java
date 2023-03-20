
package Verificacion;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Datos_user{
    private String usuario;
    private String contraseña;
    private String correo;
    private String nombre;
    private char sexo;
    private int edad;
    private double altura;


    @Override
    public String toString() {
        return "Usuario: "+usuario+
                "\nContraseña: "+contraseña+
                "\nCorreo: "+correo+
                "\nNombre: "+nombre+
                "\nSexo: "+sexo+
                "\nEdad: "+edad+
                "\nAltura: "+altura;
    }
    
}
