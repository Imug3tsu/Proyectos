
package Bibloteca;

public class Libros {
    private String autor;
    private String titulo;
    private int numPaginas;
    private int idLibro;
    private double precio;
    private int cantPrestamo;
    private int cantPrestado;

    public Libros(String autor, String titulo, int numPaginas, int idLibro, double precio, int cantPrestamo, int cantPrestado) {
        this.autor = autor;
        this.titulo = titulo;
        this.numPaginas = numPaginas;
        this.idLibro = idLibro;
        this.precio = precio;
        this.cantPrestamo = cantPrestamo;
        this.cantPrestado = cantPrestado;
    }

    public int resta_prestamo(int numero){
        return cantPrestamo-=numero;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public void setIdLibro(int idLibro) {
        this.idLibro = idLibro;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCantPrestamo(int cantPrestamo) {
        this.cantPrestamo = cantPrestamo;
    }

    public void setCantPrestado(int cantPrestado) {
        this.cantPrestado = cantPrestado;
    }

    public int getCantPrestamo() {
        return cantPrestamo;
    }

    public int getCantPrestado() {
        return cantPrestado;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public int getIdLibro() {
        return idLibro;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Libro: "+titulo+
                "\nAutor: "+autor+
                "\nNumero de paginas: "+numPaginas+
                "\nid libro: "+idLibro+
                "\nPrecio: "+precio+
                "\nCantidad de prestamo: "+cantPrestamo+
                "\nCantidad de libros ya prestados: "+cantPrestado;
    }
    
    
}
