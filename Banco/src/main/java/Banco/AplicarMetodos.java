
package Banco;

import java.util.Scanner;

public class AplicarMetodos {

    static Scanner entrada=new Scanner(System.in);

    /**
     * Creo los clientes, uno en cada banco.
     *
     * @param cliente
     * @param bna
     * @param bs
     */
    public void Crear_cliente(Cliente cliente,BancoNaciónArgentina bna,BancoSantander bs){
        bna.ingresarCliente(new Cliente("Pablo", "pab41", "4568", "BNA"));
        bs.ingresarCliente(new Cliente("Cue", "cue21", "2384", "BS"));
    }

    /**
     * Muestro los clientes accediendo primero al banco al cual pertenece, y luego
     * muestro los datos del cliente.
     * @param cliente
     * @param bna
     * @param bs
     */
    public void Mostrar_clientes(Cliente cliente,BancoNaciónArgentina bna,BancoSantander bs){
        System.out.println("\t\n..::BANCO NACION ARGENTINA::.."+"\n");
        System.out.println(bna.getClienteBNA(cliente).toString());
        
        System.out.println("\t\n..::BANCO SANTANDER RIO::.."+"\n");
        System.out.println(bs.getClienteBS(cliente).toString());
    }

    /**
     * Menu Principal donde este ejercicio se basara en todo.
     * He creado otros metodos con otros menus donde tambien mostrara otras opciones a seleccionar.
     * Si nosotros accedemos a la primera o segunda opcion, nos ejecutara el metodo de ese banco en particular.
     *
     * @param cliente
     * @param bna
     * @param bs
     */
    public void Menu(Cliente cliente,BancoNaciónArgentina bna,BancoSantander bs){
        Crear_cliente(cliente, bna, bs);
        int opcion;
        do{
            System.out.println("\n\t..::MENU::..");
            System.out.println("1. Acceder a Banco Santander");
            System.out.println("2. Acceder a Banco Nacion Argentina");
            System.out.println("3. Ver Clientes");
            System.out.println("4. Salir");
            System.out.print("Ingrese opcion: ");
            opcion=entrada.nextInt();

            switch(opcion){
                case 1:
                    BancoS(cliente,bs);
                    break;
                case 2:
                    BancoNA(cliente,bna);
                    break;
                case 3:
                    Mostrar_clientes(cliente,bna,bs);
                    break;
                case 4:
                    break;
                default:
                    System.out.println("(Error de opcion)");
            }

        }while(opcion!=4);

    }

    /**
     * Tanto este Banco (BNA) como (BS) aplican lo mismo, por lo tanto solo explicare uno de ellos.
     * Este metodo se encargara de pedir los datos de la cuenta del cliente,
     * cada opcion que queramos realizar nos pedira verificacion de nuestra cuenta con nuestros datos de cuenta
     * en el banco correspondiente.
     *
     * @param cliente
     * @param bna
     */
    public void BancoNA(Cliente cliente,BancoNaciónArgentina bna){
        int opcion;
        double monto=0;
        String user,pass;
        System.out.print("Ingrese nombre de usuario: ");
        entrada.nextLine();
        user=entrada.nextLine();
        System.out.print("Ingrese contraseña: ");
        pass=entrada.nextLine();
            if(bna.getClienteBNA(cliente).getUsuario().equals(user) && bna.getClienteBNA(cliente).getContraseña().equals(pass)){
                do{
                    System.out.println("\t\n..::MENU DE OPERACIONES::..");
                    System.out.println("1. Ingresar dinero a cuenta");
                    System.out.println("2. Retirar dinero");
                    System.out.println("3. Consultar saldo");
                    System.out.println("4. Cambiar Contraseña");
                    System.out.println("5. Volver atras");
                    System.out.print("Ingrese opcion: ");
                    opcion=entrada.nextInt();

                    switch(opcion){
                        case 1:
                            monto = IngresarDineroCuentaBNA(cliente, bna, monto, pass);
                            break;
                        case 2:
                            monto = RetirarDineroBNA(cliente, bna, monto, pass);
                            break;
                        case 3:
                            System.out.print("Ingrese contraseña: ");
                            entrada.nextLine();
                            pass=entrada.nextLine();
                            if(bna.getClienteBNA(cliente).getContraseña().equals(pass)){
                                System.out.println("Saldo: "+bna.consultar_dinero(monto));
                            }else{
                                System.out.println("(Error, algunos de los datos ingresados son incorrectos)");
                            }
                            break;
                        case 4:
                            CambiarContraseñaBNA(cliente,bna,pass);
                            break;
                        case 5:
                            break;
                        default:
                            System.out.println("(Error de opcion)");
                    }

                }while(opcion!=5);

            }else{
                System.out.println("(Error, algunos de los datos ingresados son incorrectos)");
            }

    }

    public void BancoS(Cliente cliente,BancoSantander bs){
        int opcion;
        double monto=0;
        String user,pass;

        System.out.print("Ingrese nombre de usuario: ");
        entrada.nextLine();
        user=entrada.nextLine();
        System.out.print("Ingrese contraseña: ");
        pass=entrada.nextLine();
        if(bs.getClienteBS(cliente).getUsuario().equals(user) && bs.getClienteBS(cliente).getContraseña().equals(pass)){
            do{
                System.out.println("\t\n..::MENU DE OPERACIONES::..");
                System.out.println("1. Ingresar dinero a cuenta");
                System.out.println("2. Retirar dinero");
                System.out.println("3. Consultar saldo");
                System.out.println("4. Cambiar Contraseña");
                System.out.println("5. Volver atras");
                System.out.print("Ingrese opcion: ");
                opcion=entrada.nextInt();

                switch(opcion){
                    case 1:
                        monto = IngresarDineroCUentaBS(cliente, bs, monto);
                        break;
                    case 2:
                        monto = RetirarDineroBS(cliente, bs, monto);
                        break;
                    case 3:
                        System.out.print("Ingrese contraseña: ");
                        entrada.nextLine();
                        pass=entrada.nextLine();
                        if(bs.getClienteBS(cliente).getContraseña().equals(pass)){
                            System.out.println("Saldo: "+bs.consultar_dinero(monto));
                        }else{
                            System.out.println("(Error, algunos de los datos ingresados son incorrectos)");
                        }
                        break;
                    case 4:
                        CambiarContraseña(cliente, bs, pass);
                        break;
                    case 5:
                        break;
                    default:
                        System.out.println("(Error de opcion)");
                }
            }while(opcion!=5);

        }else{
            System.out.println("(Error, algunos de los datos ingresados son incorrectos)");
        }
    }

    private static void CambiarContraseñaBNA(Cliente cliente,BancoNaciónArgentina bna, String pass) {
        System.out.print("Ingrese contraseña: ");
        entrada.nextLine();
        pass=entrada.nextLine();
        if (bna.getClienteBNA(cliente).getContraseña().equals(pass)) {
            System.out.println("\t..::CAMBIAR CONTRASEÑA::..\n");
            System.out.print("Ingrese contraseña actual: ");
            pass =entrada.nextLine();
            if(bna.getClienteBNA(cliente).getContraseña().equals(pass)){
                System.out.print("Ingrese nueva contraseña: ");
                pass =entrada.nextLine();
                bna.getClienteBNA(cliente).setContraseña(pass);
                System.out.println("(Contraseña actualizada con exito)");
            }else{
                System.out.println("(La contraseña es incorrecta)");
            }
        } else {
            System.out.println("(Error, algunos de los datos ingresados son incorrectos)");
        }
    }

    private static double RetirarDineroBNA(Cliente cliente, BancoNaciónArgentina bna, double monto, String pass) {
        System.out.print("Ingrese contraseña: ");
        entrada.nextLine();
        pass=entrada.nextLine();
        double retirar;
        if(bna.getClienteBNA(cliente).getContraseña().equals(pass)){
            System.out.print("Ingrese monto a retirar: ");
            retirar=entrada.nextDouble();
            if (bna.getMonto()==0){
                System.out.println("(No puede retirar dinero porque su cuenta esta vacia)");
            }else if(bna.getMonto()>=retirar){
                bna.retirarDinero(retirar);
                monto -=retirar;
                System.out.println("(Retiro de dinero con exito)");
            }else if(retirar > bna.getMonto()){
                System.out.println("");
                System.out.println("(No puede retirar dinero de cuenta porque excede el mismo)");
                System.out.println("Monto actual: "+ bna.consultar_dinero(monto));
            }
        }else{
            System.out.println("(Error, algunos de los datos ingresados son incorrectos)");
        }
        return monto;
    }

    private static double IngresarDineroCuentaBNA(Cliente cliente, BancoNaciónArgentina bna, double monto, String pass) {
        System.out.print("Ingrese contraseña: ");
        entrada.nextLine();
        pass=entrada.nextLine();
        double ingresar;
        if(bna.getClienteBNA(cliente).getContraseña().equals(pass)){
            System.out.print("Ingrese monto a cargar en cuenta: ");
            ingresar=entrada.nextDouble();
            bna.ingresarDinero(ingresar);
            monto +=ingresar;
            System.out.println("(Carga de saldo con exito)");
        }else{
            System.out.println("(Error, algunos de los datos ingresados son incorrectos)");
        }
        return monto;
    }

    //--------------------------------------------------------------------------------------------------

    private static double RetirarDineroBS(Cliente cliente, BancoSantander bs, double monto) {
        double retirar;
        String pass;
        System.out.print("Ingrese contraseña: ");
        entrada.nextLine();
        pass=entrada.nextLine();
        if(bs.getClienteBS(cliente).getContraseña().equals(pass)){
            System.out.print("Ingrese monto a retirar: ");
            retirar=entrada.nextDouble();
            if(bs.getMonto()==0){
                System.out.println("(No puede retirar dinero porque su cuenta esta vacia)");
            }else if(bs.getMonto()>=retirar){
                bs.retirarDinero(retirar);
                monto -=retirar;
                System.out.println("(Retiro de dinero con exito)");
            }else if(retirar> bs.getMonto()){
                System.out.println("");
                System.out.println("(No puede retirar dinero de cuenta porque excede el mismo)");
                System.out.println("Monto actual: ("+ bs.consultar_dinero(monto)+")");
            }
        }else{
            System.out.println("(Error, algunos de los datos ingresados son incorrectos)");
        }
        return monto;
    }

    private static double IngresarDineroCUentaBS(Cliente cliente, BancoSantander bs, double monto) {
        String pass;
        double ingresar;
        System.out.print("Ingrese contraseña: ");
        entrada.nextLine();
        pass = entrada.nextLine();
        if(bs.getClienteBS(cliente).getContraseña().equals(pass)){
            System.out.print("Ingrese monto a cargar en cuenta: ");
            ingresar=entrada.nextDouble();
            bs.ingresarDinero(ingresar);
            monto +=ingresar;
            System.out.println("(Carga de saldo con exito)");
        }else{
            System.out.println("(Error, algunos de los datos ingresados son incorrectos)");
        }
        return monto;
    }

    private static void CambiarContraseña(Cliente cliente, BancoSantander bs, String pass) {
        System.out.print("Ingrese contraseña: ");
        entrada.nextLine();
        pass=entrada.nextLine();
        if(bs.getClienteBS(cliente).getContraseña().equals(pass)){
            System.out.println("\t..::CAMBIAR CONTRASEÑA::..\n");
            System.out.print("Ingrese contraseña actual: ");
            pass =entrada.nextLine();
            if(bs.getClienteBS(cliente).getContraseña().equals(pass)){
                System.out.print("Ingrese nueva contraseña: ");
                pass =entrada.nextLine();
                bs.getClienteBS(cliente).setContraseña(pass);
                System.out.println("(Contraseña actualizada con exito)");
            }else{
                System.out.println("(La contraseña es incorrecta)");
            }
        }else{
            System.out.println("(Error, algunos de los datos ingresados son incorrectos)");
        }
    }

}
