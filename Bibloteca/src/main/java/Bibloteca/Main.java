
package Bibloteca;

public class Main {
    static AplicarMetodos metodo=new AplicarMetodos();
    static Bibloteca bib[]=new Bibloteca[2];
    static Libros libro[]=new Libros[4];
    
    /**
     * Ejecutar el Metedo Menu.
     *
     * @param args 
     */
    public static void main(String[] args) {

        metodo.Menu(bib, libro);
    }

    
}
