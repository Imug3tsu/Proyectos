
package Escuela;

import java.util.ArrayList;
import java.util.List;

public class Main {
    
    public static void main(String[] args) {

//        Recomiendo probar cada metodo de uno en uno para no perder el seguimiento.
//        Es decir primero creamos las aulas, profesores e alumnos y luego metodo por metodo.


        AplicarMetodos metodo=new AplicarMetodos();
        List<Aula> listaAula=new ArrayList<>();
        List<Alumno> listaAlumnos=new ArrayList<>();
        List<Profesor> listaProfesor=new ArrayList<>();
        
        metodo.Crear_aula(listaAula);
        metodo.Crear_profesor(listaProfesor);
        metodo.Crear_alumno(listaAlumnos);
//        metodo.Mostrar_aulas(listaAula);
//        metodo.Mostrar_profesores(listaProfesor);
//        metodo.Mostrar_alumnos(listaAlumnos);
//        metodo.Profesor_materia(listaProfesor);
//        metodo.Alumno_aprobado(listaAlumnos);

//        --------------------------------------------------------------------------------------------------------------------
//        metodo.Mostrar_alumnos(listaAlumnos); // primero mostraremos los alumnos para ver sus datos originales
//                                              // y luego aplicamos el metodo DEFAULT y mostraremos los alumnos nuevamente
//                                              // para ver los cambios aplicados.
//        metodo.Alumno_default(listaAlumnos);
//        System.out.println("--------------ALUMNO DEFAULT---------------");
//        metodo.Mostrar_alumnos(listaAlumnos);
//        metodo.Aula_profesor(listaProfesor, listaAula);
    }
}
