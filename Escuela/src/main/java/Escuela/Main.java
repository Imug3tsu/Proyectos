
package Escuela;

import java.util.ArrayList;
import java.util.List;

public class Main {

    static AplicarMetodos metodo=new AplicarMetodos();
    static List<Aula> listaAula=new ArrayList<>();
    static List<Alumno> listaAlumnos=new ArrayList<>();
    static List<Profesor> listaProfesor=new ArrayList<>();
    
    public static void main(String[] args) {

        metodo.Menu(listaProfesor,listaAlumnos,listaAula);

    }
}
