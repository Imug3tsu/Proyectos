
package Banco;

/*
Ejercicio de simulador de banco, ingresaremos dinero a la cuenta, retiraremos dinero
de la cuenta, y consultaremos dinero de la misma.
*/


public class Main {
    static AplicarMetodos metodo=new AplicarMetodos();
    static BancoNaciónArgentina bna=new BancoNaciónArgentina("BNA");
    static BancoSantander bs=new BancoSantander("BS");
    static Cliente cliente=new Cliente();

    /**
     * Ejecutar los metodos ya declarados.
     * @param args 
     */
    public static void main(String[] args) {

        metodo.Menu(cliente, bna, bs);

    }

}

