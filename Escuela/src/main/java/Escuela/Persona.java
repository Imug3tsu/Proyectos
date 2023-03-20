
package Escuela;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Persona {
    private static final String NOMBREH_DEFH="Jhon";
    private static final String NOMBREM_DEFM="Jane";
    private static final String APELLIDO_DEF="Doe";
    private static final int EDAD_DEF=0;
    private String nombre;
    private String apellido;
    private int edad;
    private char sexo;

    public static String getNOMBREH_DEFH() {
        return NOMBREH_DEFH;
    }

    public static String getNOMBREM_DEFM() {
        return NOMBREM_DEFM;
    }

    public static String getAPELLIDO_DEF() {
        return APELLIDO_DEF;
    }

    public static int getEDAD_DEF() {
        return EDAD_DEF;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre +
                "\nApellido: " + apellido +
                "\nEdad: " + edad +
                "\nSexo: " + sexo;
    }
}
