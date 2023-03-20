
package Verificacion;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {
    private String correo;
    private String usuario;
    private String contraseña;
    

    @Override
    public String toString() {
        return "Correo: "+correo+
                "\nUsuario: "+usuario+
                "\nContraseña: "+contraseña;
    }
    
}
