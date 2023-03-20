
package Escuela;

import java.util.List;
import java.util.Scanner;

public class AplicarMetodos {
    static Scanner entrada=new Scanner(System.in);
    
    /**
     * Creamos aulas con su ID y respectivas materias.
     * @param listaAula
     */
    public void Crear_aula(List listaAula){
        listaAula.add(new Aula(12,"Matematica"));
        listaAula.add(new Aula(17,"Ingles"));
        listaAula.add(new Aula(10,"Historia"));
        listaAula.add(new Aula(13,"Geografia"));
    }
    
    /**
     * Dichas aulas tendran el mismo (id) de los profesores con su materia
     * correspondiente.
     * @param listaProfesor
     */
    public void Crear_profesor(List listaProfesor){
        listaProfesor.add(new Profesor("Matematica",12,"Juan","Arce",30,'m'));
        listaProfesor.add(new Profesor("Ingles",17,"Paola","Guzman",23,'f'));
        listaProfesor.add(new Profesor("Historia",10,"Leandro","Pacheco",31,'m'));
        listaProfesor.add(new Profesor("Geografia",13,"Sara","Espinoza",34,'f'));
    }
    
    public void Crear_alumno(List listaAlumnos){
        listaAlumnos.add(new Alumno("Shiki","Tohno",14,'m'));
        listaAlumnos.add(new Alumno("Mario","Bestino",3,'m'));
        listaAlumnos.add(new Alumno("Pablo","Guzman",14,'m'));
        listaAlumnos.add(new Alumno("Arturo","Pendragon",15,'m'));
        listaAlumnos.add(new Alumno("Phill","Walker",14,'m'));

        listaAlumnos.add(new Alumno("Cue","Arc",16,'f'));
        listaAlumnos.add(new Alumno("Ciel","Phoenix",2,'f'));
        listaAlumnos.add(new Alumno("Shiki","Ryougi",17,'f'));
        listaAlumnos.add(new Alumno("Akiha","Tohno",14,'f'));
        listaAlumnos.add(new Alumno("Ellie","Miller",1,'f'));
    }
    
    public void Mostrar_alumnos(List listaAlumnos){
        System.out.println("\n\t..::ALUMNOS::..");
        listaAlumnos.forEach(a->System.out.println(a.toString()+"\n"));
    }
    
    public void Mostrar_profesores(List listaProfesor){
        System.out.println("\n\t..::PROFESORES::..");
        listaProfesor.forEach(p->System.out.println(p.toString()+"\n"));
    }
    
    public void Mostrar_aulas(List listaAula){
        System.out.println("\n\t..::AULAS::..");
        listaAula.forEach(a->System.out.println(a.toString()+"\n"));
    }
    
    /**
     * Lo que realiza este metodo es verificar si el alumno aprobo.
     * Dicha nota para aprobar es 7.
     * @param listaAlumnos
     */
    public void Alumno_aprobado(List listaAlumnos){
//        He creado una funcion random para que obtenga numeros de manera aleatoria, estos numeros seran las
//        notas de calificacion de los alumnos.

        int notas[]={1,2,3,4,5,6,7,8,9,10};  // notas disponibles.
        System.out.println("Se Aprueba con 7");

        for(Object a:listaAlumnos){
            int aleatorio=(int)(Math.random()*notas.length); // toma numeros aleatorios del arreglo(notas).
            if (notas[aleatorio]>=7){
                System.out.println("Alumno: "+((Alumno)a).getNombre()+" "+((Alumno)a).getApellido()+" Aprobo con: "+notas[aleatorio]);
            }else{
                System.out.println("Alumno: "+((Alumno)a).getNombre()+" "+((Alumno)a).getApellido()+" Reprobo con: "+notas[aleatorio]);
            }
        }
    }
    
    /**
     * La funcion de este metodo es seleccionar de manera aleatoria una materia,
     * si esa materia seleccionada es igual a la materia de uno de los profesores,
     * ese profesor en particular dara clases de su materia, caso contrario no.
     * @param listaProfesor
     */
    public void Profesor_materia(List listaProfesor){
        String materias[]={"Matematica","Ingles","Historia","Geografia","Lengua","Quimica","Biologia","Fisica"};

        for(Object p:listaProfesor){
            int aleatorio=(int)(Math.random()* materias.length);
            if (materias[aleatorio].equals(((Profesor)p).getMateria())){
                System.out.println("El/La Profesor/a: "+((Profesor)p).getNombre()+" "+((Profesor)p).getApellido()+", Dara clases de su materia: ("+materias[aleatorio]+")");
            }else{
                System.out.println("El/La Profesor/a: "+((Profesor)p).getNombre()+" "+((Profesor)p).getApellido()+", NO dara clases de la materia: ("+materias[aleatorio]+")");
            }
        }
    }
    
    /**
     * La funcion de este metodo es la siguiente:
     * Aquellos alumnos que su edad sea menor a 4 se modificara tanto nombre, apellido y edad
     * como resultados por defecto.
     * Esto es asi porque no hay alumnos de menor edad.
     * @param listaAlumnos
     */
    public void Alumno_default(List listaAlumnos){
        int i=0;
        for (i=0;i<listaAlumnos.size();i++){
            if (((Alumno)listaAlumnos.get(i)).getEdad()<4 && ((Alumno)listaAlumnos.get(i)).getSexo()=='m'){
                listaAlumnos.set(i,new Alumno(((Alumno)listaAlumnos.get(i)).getNOMBREH_DEFH(),((Alumno)listaAlumnos.get(i)).getAPELLIDO_DEF(),((Alumno)listaAlumnos.get(i)).getEDAD_DEF(),((Alumno)listaAlumnos.get(i)).getSexo()));
            }
        }
        
        for (i=0;i<listaAlumnos.size();i++){
            if (((Alumno)listaAlumnos.get(i)).getEdad()<4 && ((Alumno)listaAlumnos.get(i)).getSexo()=='f'){
                listaAlumnos.set(i,new Alumno(((Alumno)listaAlumnos.get(i)).getNOMBREM_DEFM(),((Alumno)listaAlumnos.get(i)).getAPELLIDO_DEF(),((Alumno)listaAlumnos.get(i)).getEDAD_DEF(),((Alumno)listaAlumnos.get(i)).getSexo()));
            }
        }
        
    }
    
    /**
     * Lo que realiza este metodo es lo siguiente:
     * Tendremos un menu con (id) de aulas de cada materia,
     * dependiendo del aula de esa materia el profesor dara clases de su materia
     * si esta misma corresponde con el mismo (id) de aula donde se encuentra su materia.
     * @param listaProfesor
     * @param listaAlumnos
     */
    public void Aula_profesor(List listaProfesor,List listaAlumnos){
        int opcion;
        do{
            System.out.println("\n\t..::MENU::..");
            System.out.println("1. Aula Matematica, ID: 12");
            System.out.println("2. Aula Ingles, ID: 17");
            System.out.println("3. Aula Historia, ID: 10");
            System.out.println("4. Aula Geografia, ID: 13");
            System.out.println("5. Salir");
            System.out.print("Seleccione opcion: ");
            opcion=entrada.nextInt();
                    
            switch(opcion){
                case 1:
                    Aula_Matematica(listaProfesor, listaAlumnos);
                    break;
                case 2:
                    Aula_Ingles(listaProfesor, listaAlumnos);
                    break;
                case 3:
                    Aula_Historia(listaProfesor, listaAlumnos);
                    break;
                case 4:
                    Aula_Geografia(listaProfesor, listaAlumnos);
                    break;
                case 5: break;
                default: System.out.println("Error de opcion");
            }
        }while(opcion!=5);
    }

    private void Aula_Geografia(List listaProfesor, List listaAlumnos) {
        System.out.println("Ingrese ID de Aula de Geografia: ");
        int aulaG=entrada.nextInt();
        if (aulaG==((Aula) listaAlumnos.get(3)).getIdAula() && aulaG==((Profesor) listaProfesor.get(3)).getIdProfAula()){
            System.out.println("La Profesora: "+((Profesor) listaProfesor.get(3)).getNombre()+" "+((Profesor) listaProfesor.get(3)).getApellido()+" SI Enseña en el Aula de: "+((Profesor) listaProfesor.get(3)).getMateria());
        }else{
            System.out.println("La Profesora: "+((Profesor) listaProfesor.get(3)).getNombre()+" "+((Profesor) listaProfesor.get(3)).getApellido()+" NO Enseña en esa Aula: "+((Profesor) listaProfesor.get(3)).getMateria());
        }
    }

    private void Aula_Historia(List listaProfesor, List listaAlumnos) {
        System.out.println("Ingrese ID de Aula de Historia: ");
        int aulaH=entrada.nextInt();
        if (aulaH==((Aula) listaAlumnos.get(2)).getIdAula() && aulaH==((Profesor) listaProfesor.get(2)).getIdProfAula()){
            System.out.println("El Profesor: "+((Profesor) listaProfesor.get(2)).getNombre()+" "+((Profesor) listaProfesor.get(2)).getApellido()+" SI Enseña en el Aula de: "+((Profesor) listaProfesor.get(2)).getMateria());
        }else{
            System.out.println("El Profesor: "+((Profesor) listaProfesor.get(2)).getNombre()+" "+((Profesor) listaProfesor.get(2)).getApellido()+" NO Enseña en esa Aula: "+((Profesor) listaProfesor.get(2)).getMateria());
        }
    }

    private void Aula_Ingles(List listaProfesor, List listaAlumnos) {
        System.out.println("Ingrese ID de Aula de Ingles: ");
        int aulaI=entrada.nextInt();
        if (aulaI==((Aula) listaAlumnos.get(1)).getIdAula() && aulaI==((Profesor) listaProfesor.get(1)).getIdProfAula()){
            System.out.println("La Profesora: "+((Profesor) listaProfesor.get(1)).getNombre()+" "+((Profesor) listaProfesor.get(1)).getApellido()+" SI Enseña en el Aula de: "+((Profesor) listaProfesor.get(1)).getMateria());
        }else{
            System.out.println("La Profesora: "+((Profesor) listaProfesor.get(1)).getNombre()+" "+((Profesor) listaProfesor.get(1)).getApellido()+" NO Enseña en esa Aula: "+((Profesor) listaProfesor.get(1)).getMateria());
        }
    }

    private void Aula_Matematica(List listaProfesor, List listaAlumnos) {
        System.out.println("Ingrese ID de Aula de Matematica: ");
        int aulaM=entrada.nextInt();
        if (aulaM ==((Aula) listaAlumnos.get(0)).getIdAula() && aulaM ==((Profesor) listaProfesor.get(0)).getIdProfAula()){
            System.out.println("El Profesor: "+((Profesor) listaProfesor.get(0)).getNombre()+" "+((Profesor) listaProfesor.get(0)).getApellido()+" SI Enseña en el Aula de: "+((Profesor) listaProfesor.get(0)).getMateria());
        }else{
            System.out.println("El Profesor: "+((Profesor) listaProfesor.get(0)).getNombre()+" "+((Profesor) listaProfesor.get(0)).getApellido()+" NO Enseña en esa Aula: "+((Profesor) listaProfesor.get(0)).getMateria());
        }
    }

}
