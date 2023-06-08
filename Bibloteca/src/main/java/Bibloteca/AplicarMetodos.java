
package Bibloteca;

import java.util.Scanner;

public class AplicarMetodos {
    static Scanner entrada=new Scanner(System.in);
    
    /**
     * Creamos los libros accediendo primero por el arreglo bibloteca.
     * los libros tendran numero de prestamo disponible y cantidad del mismo libro que se a pedido prestado.
     * @param bib
     * @param libro 
     */
    public void Crear_libro(Bibloteca bib[], Libros libro[]){
        bib[0]=new Bibloteca("Cuspide");
        bib[0].ingresarLibro(new Libros("H.P. Lovecraft","Necronomicon",250,528,100.99,2,0)); // los dos ultimos representan Prestamo | Prestado.
        bib[0].ingresarLibro(new Libros("Stephen King","It",350,621,143.99,1,3));
        bib[0].ingresarLibro(new Libros("Frank Herbert","Dune",400,385,240.99,0,1)); // aqui pidieron un prestamo de la ultima unidad que le quedaba a la bibloteca.
        bib[0].ingresarLibro(new Libros("Brandon Sanderson","El camino de los reyes",150,642,112.99,3,2));
        
        bib[1]=new Bibloteca("Norma");
        bib[1].ingresarLibro(new Libros("Friedrich Nietzsche","Mas alla del bien y el mal",150,213,111.99,0,3)); // lo mismo que el libro (Dune).
        bib[1].ingresarLibro(new Libros("Stephen Hawking","El Gran Diseño",123,547,105.99,3,0));
        bib[1].ingresarLibro(new Libros("H.P. Lovecraft","The call of the Cthulhu",100,478,80.99,2,1));
        bib[1].ingresarLibro(new Libros("Stephen King","El Resplandor",300,598,213.99,4,5));
    }
    
    /**
     * Mostramos los libros de la bibloteca (Cuspide), pero primero accedemos a la bibloteca correspondiente y luego a los libros.
     * @param bib
     * @param libro 
     */
    public void Libros_Cuspide(Bibloteca bib[], Libros libro[]){
        System.out.println("\n\t.:BIBLOTECA "+bib[0].getNombre()+":.");
        System.out.println("");
        for (int i=0;i<libro.length;i++){
            System.out.println(bib[0].getLibro(i).toString()+"\n");
        }
    }
    
    /**
     * Lo mismo que el metodo anterior, pero este con la Bibloteca (Norma).
     * @param bib
     * @param libro 
     */
    public void Libros_Norma(Bibloteca bib[], Libros libro[]){
        System.out.println("\n\t.:BIBLOTECA "+bib[1].getNombre()+":.");
        System.out.println("");
        for (int i=0;i<libro.length;i++){
            System.out.println(bib[1].getLibro(i).toString()+"\n");
        }
    }
    
    /**
     * Este metodo se encarga de mostrar el libro con mayor precio,
     * entre todos los libros de ambas biblotecas.
     * @param bib
     * @param libro 
     */
    public void Libro_mayor_precio(Bibloteca bib[],Libros libro[],int numero){
        int count=0,auxiliar=0;

        for (int i=0;i<libro.length;i++){
            if (auxiliar<bib[numero].getLibro(i).getPrecio()){
                auxiliar=(int) bib[numero].getLibro(i).getPrecio();
                count=auxiliar;
                count=i;
            }
        }
        System.out.println("Libro con mayor precio: ("+bib[numero].getLibro(count).getTitulo()+"), de la Bibloteca: ("+bib[numero].getNombre()+
                ")\nCon un precio de: "+bib[numero].getLibro(count).getPrecio()+" USD");
    }
    
    /**
     * Lo mismo que el anterior metodo, pero este mostrara el libro con menor precio.
     * @param bib
     * @param libro 
     */
    public void Libro_menor_precio(Bibloteca bib[],Libros libro[],int numero){
        int count=0,auxiliar=99;

        for (int i=0;i<libro.length;i++){
            if (auxiliar>bib[numero].getLibro(i).getPrecio()){
                auxiliar=(int) bib[numero].getLibro(i).getPrecio();
                count=auxiliar;
                count=i;
            }
        }
        System.out.println("Libro con menor precio: ("+bib[numero].getLibro(count).getTitulo()+"), de la Bibloteca: ("+bib[numero].getNombre()+
                ")\nCon un precio de: "+bib[numero].getLibro(count).getPrecio()+" USD");
    }
    
    /**
     * Este es el menu principal, mostrara esas 4 opciones,
     * si tu seleccionas la opcion 1 o 2, ejecutara el metodo correspondiente antes creado, ejemplo(mostrar_libros_Cuspide),etc.
     * Si seleccionas la opcion 3 ejecutara el metodo (pedir_libro) y si seleccionas la opcion (volver atras),
     * volveras al primer menu mostrado (Menu).
     * @param bib
     * @param libro 
     */
    public void Menu(Bibloteca bib[],Libros libro[]){
        Crear_libro(bib, libro);
        int opcion;
        
        do{
            System.out.println("\n\t..::MENU::..");
            System.out.println("1. Ver libros de Bibloteca (Cuspide)");
            System.out.println("2. Ver libros de Bibloteca (Norma)");
            System.out.println("3. Pedir un prestamo");
            System.out.println("4. Mas...");
            System.out.println("5. Salir");
            System.out.print("Ingrese opcion: ");
            opcion=entrada.nextInt();
            System.out.println("");
            
            switch(opcion){
                case 1:
                    Libros_Cuspide(bib, libro);
                    break;
                case 2:
                    Libros_Norma(bib, libro);
                    break;
                case 3:
                    Pedir_libro(bib, libro);
                    break;
                case 4:
                    Precios(bib,libro);
                    break;
                case 5: break;
                default: System.out.println("(Error de opcion)");
            }
        }while(opcion!=5);
    }

    /**
     * Este metodo se encarga de mostrar los libros con mayor y menor precio de la bibloteca indicada.
     * @param bib
     * @param libro
     */
    public void Precios(Bibloteca bib[],Libros libro[]) {
        int opcion;
        do{
            System.out.println("\n\t..::MENU::..");
            System.out.println("1. Ver libros con mayor precio (Cuspide)");
            System.out.println("2. Ver libros con menor precio (Cuspide)");
            System.out.println("3. Ver libros con mayor precio (Norma)");
            System.out.println("4. Ver libros con menor precio (Norma)");
            System.out.println("5. Volver Atras");
            System.out.print("Ingrese opcion: ");
            opcion=entrada.nextInt();

            switch(opcion){
                case 1:
                    Libro_mayor_precio(bib,libro,0);
                    break;
                case 2:
                    Libro_menor_precio(bib,libro,0);
                    break;
                case 3:
                    Libro_mayor_precio(bib,libro,1);
                    break;
                case 4:
                    Libro_menor_precio(bib,libro,1);
                    break;
                case 5: break;
                default: System.out.println("(Error de opcion)");
            }

        }while(opcion!=5);


    }

    /**
     * En este metodo he creado un menu de libros, una vez seleccionado uno de ellos
     * mostrara su cantidad de prestamo disponible, y pedira ingresar la cantidad de prestamos que quieres realizar del mismo.
     * Si tu numero ingresado excede el numero de prestamo disponible del libro, no podras realizar el prestamo porque
     * es un numero mayor al prestamo disponible del libro seleccionado.
     * @param bib
     * @param libro 
     */
    public void Pedir_libro(Bibloteca bib[], Libros libro[]){
        int opcion;
        do{
            System.out.println("\n\t..::MENU DE LIBROS::..");
            System.out.println("1. Necronomicon, por (H.P. Lovecraft)");
            System.out.println("2. It, por (Stephen King)");
            System.out.println("3. Dune, por (Frank Herbert)");
            System.out.println("4. El camino de los reyes, por (Brandon Sanderson)");
            System.out.println("5. Mas alla del bien y el mal, por (Friedrich Nietzsche)");
            System.out.println("6. El Gran Diseño, por (Stephen Hawking)");
            System.out.println("7. The Call of the Cthulhu, por (H.P. Lovecraft)");
            System.out.println("8. El Resplandor, por (Stephen King)");
            System.out.println("9. Volver atras");
            System.out.print("Ingrese opcion: ");
            opcion=entrada.nextInt();
            
            switch(opcion){
                case 1:
                    Necronomicon(bib);
                    break;
                case 2:
                    It(bib);
                    break;
                case 3:
                    Dune(bib);
                    break;
                case 4:
                    Camino_de_los_reyes(bib);
                    break;
                case 5:
                    Mas_alla_del_bien_y_el_mal(bib);
                    break;
                case 6:
                    El_Gran_Diseño(bib);
                    break;
                case 7:
                    The_Call_of_the_Cthulhu(bib);
                    break;
                case 8:
                    El_Resplandor(bib);
                    break;
                case 9: break;
                default: System.out.println("(Error de opcion)");
            }
            
        }while(opcion!=9);
        
    }

    private static void El_Resplandor(Bibloteca[] bib) {
        int numero;
        if (bib[1].getLibro(3).getCantPrestamo()==0){
            System.out.println("No puede pedir prestamo de libro: ("+ bib[1].getLibro(3).getTitulo()+"), por que no tiene prestamo disponible");
        }else{
            System.out.println("Hay prestamo disponible para el libro: ("+ bib[1].getLibro(3).getTitulo()+
                    ")\nPrestamos disponibles: "+ bib[1].getLibro(3).getCantPrestamo());
            System.out.println("");
            System.out.print("Ingrese cuantos prestamos necesita: ");
            entrada.nextLine();
            String p1=entrada.nextLine();
            if (p1.matches("^[0-9]$")){
                numero=Integer.parseInt(p1);
                if (numero==0){
                    System.out.println("(Tiene que ser un numero mayor a 0(Cero))");
                }else if (numero> bib[1].getLibro(3).getCantPrestamo()){
                    System.out.println("(No puede pedir prestamo mayor del mostrado en el libro)");
                }else if (numero<= bib[1].getLibro(3).getCantPrestamo()){
                    bib[1].getLibro(3).resta_prestamo(numero);
                    System.out.println("Felicidades, prestamo exitoso del libro: ("+ bib[1].getLibro(3).getTitulo()+")");
                }
            }else{
                System.out.println("(Solo numeros)");
            }
        }
    }

    private static void The_Call_of_the_Cthulhu(Bibloteca[] bib) {
        int numero;
        if (bib[1].getLibro(2).getCantPrestamo()==0){
            System.out.println("No puede pedir prestamo de libro: ("+ bib[1].getLibro(2).getTitulo()+"), por que no tiene prestamo disponible");
        }else{
            System.out.println("Hay prestamo disponible para el libro: ("+ bib[1].getLibro(2).getTitulo()+
                    ")\nPrestamos disponibles: "+ bib[1].getLibro(2).getCantPrestamo());
            System.out.println("");
            System.out.print("Ingrese cuantos prestamos necesita: ");
            entrada.nextLine();
            String p1=entrada.nextLine();
            if (p1.matches("^[0-9]$")){
                numero=Integer.parseInt(p1);
                if (numero==0){
                    System.out.println("(Tiene que ser un numero mayor a 0(Cero))");
                }else if (numero> bib[1].getLibro(2).getCantPrestamo()){
                    System.out.println("(No puede pedir prestamo mayor del mostrado en el libro)");
                }else if (numero<= bib[1].getLibro(2).getCantPrestamo()){
                    bib[1].getLibro(0).resta_prestamo(numero);
                    System.out.println("Felicidades, prestamo exitoso del libro: ("+ bib[1].getLibro(2).getTitulo()+")");
                }
            }else{
                System.out.println("(Solo numeros)");
            }
        }
    }

    private static void El_Gran_Diseño(Bibloteca[] bib) {
        int numero;
        if (bib[1].getLibro(1).getCantPrestamo()==0){
            System.out.println("No puede pedir prestamo de libro: ("+ bib[1].getLibro(1).getTitulo()+"), por que no tiene prestamo disponible");
        }else{
            System.out.println("Hay prestamo disponible para el libro: ("+ bib[1].getLibro(1).getTitulo()+
                    ")\nPrestamos disponibles: "+ bib[1].getLibro(1).getCantPrestamo());
            System.out.println("");
            System.out.print("Ingrese cuantos prestamos necesita: ");
            entrada.nextLine();
            String p1=entrada.nextLine();
            if (p1.matches("^[0-9]$")){
                numero=Integer.parseInt(p1);
                if (numero==0){
                    System.out.println("(Tiene que ser un numero mayor a 0(Cero))");
                }else if (numero> bib[1].getLibro(1).getCantPrestamo()){
                    System.out.println("(No puede pedir prestamo mayor del mostrado en el libro)");
                }else if (numero<= bib[1].getLibro(1).getCantPrestamo()){
                    bib[1].getLibro(1).resta_prestamo(numero);
                    System.out.println("Felicidades, prestamo exitoso del libro: ("+ bib[1].getLibro(1).getTitulo()+")");
                }
            }else{
                System.out.println("(Solo numeros)");
            }
        }
    }

    private static void Mas_alla_del_bien_y_el_mal(Bibloteca[] bib) {
        int numero;
        if (bib[1].getLibro(0).getCantPrestamo()==0){
            System.out.println("No puede pedir prestamo de libro: ("+ bib[1].getLibro(0).getTitulo()+"), por que no tiene prestamo disponible");
        }else{
            System.out.println("Hay prestamo disponible para el libro: ("+ bib[1].getLibro(0).getTitulo()+
                    ")\nPrestamos disponibles: "+ bib[1].getLibro(0).getCantPrestamo());
            System.out.println("");
            System.out.print("Ingrese cuantos prestamos necesita: ");
            entrada.nextLine();
            String p1=entrada.nextLine();
            if (p1.matches("^[0-9]$")){
                numero=Integer.parseInt(p1);
                if (numero==0){
                    System.out.println("(Tiene que ser un numero mayor a 0(Cero))");
                }else if (numero> bib[1].getLibro(0).getCantPrestamo()){
                    System.out.println("(No puede pedir prestamo mayor del mostrado en el libro)");
                }else if (numero<= bib[1].getLibro(0).getCantPrestamo()){
                    bib[1].getLibro(0).resta_prestamo(numero);
                    System.out.println("Felicidades, prestamo exitoso del libro: ("+ bib[1].getLibro(0).getTitulo()+")");
                }
            }else{
                System.out.println("(Solo numeros)");
            }
        }
    }

    private static void Camino_de_los_reyes(Bibloteca[] bib) {
        int numero;
        if (bib[0].getLibro(3).getCantPrestamo()==0){
            System.out.println("No puede pedir prestamo de libro: ("+ bib[0].getLibro(3).getTitulo()+"), por que no tiene prestamo disponible");
        }else{
            System.out.println("Hay prestamo disponible para el libro: ("+ bib[0].getLibro(3).getTitulo()+
                    ")\nPrestamos disponibles: "+ bib[0].getLibro(3).getCantPrestamo());
            System.out.println("");
            System.out.print("Ingrese cuantos prestamos necesita: ");
            entrada.nextLine();
            String p1=entrada.nextLine();
            if (p1.matches("^[0-9]$")){
                numero=Integer.parseInt(p1);
                if (numero==0){
                    System.out.println("(Tiene que ser un numero mayor a 0(Cero))");
                }else if (numero> bib[0].getLibro(3).getCantPrestamo()){
                    System.out.println("(No puede pedir prestamo mayor del mostrado en el libro)");
                }else if (numero<= bib[0].getLibro(3).getCantPrestamo()){
                    bib[0].getLibro(1).resta_prestamo(numero);
                    System.out.println("Felicidades, prestamo exitoso del libro: ("+ bib[0].getLibro(3).getTitulo()+")");
                }
            }else{
                System.out.println("(Solo numeros)");
            }
        }
    }

    private static void Dune(Bibloteca[] bib) {
        int numero;
        if (bib[0].getLibro(2).getCantPrestamo()==0){
            System.out.println("No puede pedir prestamo de libro: ("+ bib[0].getLibro(2).getTitulo()+"), por que no tiene prestamo disponible");
        }else{
            System.out.println("Hay prestamo disponible para el libro: ("+ bib[0].getLibro(2).getTitulo()+
                    ")\nPrestamos disponibles: "+ bib[0].getLibro(2).getCantPrestamo());
            System.out.println("");
            System.out.print("Ingrese cuantos prestamos necesita: ");
            entrada.nextLine();
            String p1=entrada.nextLine();
            if (p1.matches("^[0-9]$")){
                numero=Integer.parseInt(p1);
                if (numero==0){
                    System.out.println("(Tiene que ser un numero mayor a 0(Cero))");
                }else if (numero> bib[0].getLibro(2).getCantPrestamo()){
                    System.out.println("(No puede pedir prestamo mayor del mostrado en el libro)");
                }else if (numero<= bib[0].getLibro(2).getCantPrestamo()){
                    bib[0].getLibro(2).resta_prestamo(numero);
                    System.out.println("Felicidades, prestamo exitoso del libro: ("+ bib[0].getLibro(2).getTitulo()+")");
                }
            }else{
                System.out.println("(Solo numeros)");
            }
        }
    }

    private static void It(Bibloteca[] bib) {
        int numero;
        if (bib[0].getLibro(1).getCantPrestamo()==0){
            System.out.println("No puede pedir prestamo de libro: ("+ bib[0].getLibro(1).getTitulo()+"), por que no tiene prestamo disponible");
        }else{
            System.out.println("Hay prestamo disponible para el libro: ("+ bib[0].getLibro(1).getTitulo()+
                    ")\nPrestamos disponibles: "+ bib[0].getLibro(1).getCantPrestamo());
            System.out.println("");
            System.out.print("Ingrese cuantos prestamos necesita: ");
            entrada.nextLine();
            String p1=entrada.nextLine();
            if (p1.matches("^[0-9]$")){
                numero=Integer.parseInt(p1);
                if (numero==0){
                    System.out.println("(Tiene que ser un numero mayor a 0(Cero))");
                }else if (numero> bib[0].getLibro(1).getCantPrestamo()){
                    System.out.println("(No puede pedir prestamo mayor del mostrado en el libro)");
                }else if (numero<= bib[0].getLibro(1).getCantPrestamo()){
                    bib[0].getLibro(1).resta_prestamo(numero);
                    System.out.println("Felicidades, prestamo exitoso del libro: ("+ bib[0].getLibro(1).getTitulo()+")");
                }
            }else{
                System.out.println("(Solo numeros)");
            }
        }
    }

    private static void Necronomicon(Bibloteca[] bib) {
        int numero;
        if (bib[0].getLibro(0).getCantPrestamo()==0){
            System.out.println("No puede pedir prestamo de libro: ("+ bib[0].getLibro(0).getTitulo()+"), por que no tiene prestamo disponible");
        }else{
            System.out.println("Hay prestamo disponible para el libro: ("+ bib[0].getLibro(0).getTitulo()+
                    ")\nPrestamos disponibles: "+ bib[0].getLibro(0).getCantPrestamo());
            System.out.println("");
            System.out.print("Ingrese cuantos prestamos necesita: ");
            entrada.nextLine();
            String p1=entrada.nextLine();
            if (p1.matches("^[0-9]$")){
                numero=Integer.parseInt(p1);
                if (numero==0){
                    System.out.println("(Tiene que ser un numero mayor a 0(Cero))");
                }else if (numero> bib[0].getLibro(0).getCantPrestamo()){
                    System.out.println("(No puede pedir prestamo mayor del mostrado en el libro)");
                }else if (numero<= bib[0].getLibro(0).getCantPrestamo()){
                    bib[0].getLibro(0).resta_prestamo(numero);
                    System.out.println("Felicidades, prestamo exitoso del libro: ("+ bib[0].getLibro(0).getTitulo()+")");
                }
            }else{
                System.out.println("(Solo numeros)");
            }
        }
    }

}






















