
package Escuela;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Aula {
    private static final int AULA_DEF=0;
    private int idAula;
    private String materia;

    public static int getAULA_DEF() {
        return AULA_DEF;
    }

    @Override
    public String toString() {
        return "IDAula: "+idAula+
                "\nMateria: "+materia;
    }
}
