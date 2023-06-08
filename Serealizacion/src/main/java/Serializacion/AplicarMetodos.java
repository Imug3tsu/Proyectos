
package Serializacion;

import java.util.Scanner;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AplicarMetodos {
    static Hombre h=new Hombre();
    static Mujer m=new Mujer();
    static Scanner entrada=new Scanner(System.in);


    /**
     * Metodo en donde se basara todo el proyecto.
     *
     */
    public void Inicio(){
        System.out.println("Creacion de Archivos de texto(.txt)");
        System.out.print("Ingrese direccion de archivo 1: ");
        String ruta1=entrada.nextLine();
        System.out.print("Ingrese direccion de archivo 2: ");
        String ruta2=entrada.nextLine();

        // Creamos los ficheros (Hombre, Mujer) con contenido.

        try(BufferedWriter bfH=new BufferedWriter(new FileWriter(ruta1));
            BufferedWriter bfM=new BufferedWriter(new FileWriter(ruta2))){
            Crear_personas(bfH, bfM);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        int opcion;
        do{
            System.out.println("Mostrar contenido de ambos archivos(Hombre,Mujer)");
            System.out.println("1. Mostrar");
            System.out.println("2. No Mostrar");
            System.out.print("Ingrese opcion: ");
            opcion=entrada.nextInt();

            if (opcion==1){
                System.out.println("");
                // Leemos los archivos creados.

                try(BufferedReader brH=new BufferedReader(new FileReader(ruta1));
                    BufferedReader brM=new BufferedReader(new FileReader(ruta2))){
                    Leer(brH, brM);
                }catch(Exception e){
                    System.out.println(e.getMessage());
                }
                break;
            }else if(opcion==2){
                break;
            }else{
                System.out.println("(Error de opcion)");
                System.out.println("");
            }
        }
        while(opcion!=2);

        System.out.println("");
        System.out.println("Copiar contenido de ambos archivos y pegarlo en el archivo (destino)");
        System.out.print("Ingrese direccion de archivo 1: ");
        entrada.nextLine();
        ruta1=entrada.nextLine();
        System.out.print("Ingrese direccion de archivo 2: ");
        ruta2=entrada.nextLine();
        System.out.print("Ingrese direccion de archivo (destino): ");
        String ruta3=entrada.nextLine();

        /**
         * Aqui copiamos el contenido de los archivos (Hombre,Mujer)
         * y los transcribimos en el archivo destino.
         */
        try(BufferedInputStream biH=new BufferedInputStream(new FileInputStream(ruta1));
            BufferedInputStream biM=new BufferedInputStream(new FileInputStream(ruta2));
            BufferedOutputStream biD=new BufferedOutputStream(new FileOutputStream(ruta3))){
            Destino(biH, biM, biD);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        String texto;
        do{
            System.out.println("SERIALIZACION");
            System.out.println("Realizar serializacion?");
            System.out.println("yes | no: ");
            texto=entrada.nextLine();
            if (texto.equals("yes")){
                /**
                 * Creamos una Variable (File) para trabajar de manera mas eficiente con la
                 * direccion del archivo(destino).
                 * Si el archivo ya existe utilizaremos la clase (MiObjectOutputStream)
                 * para no crear otra cabecera, si el archivo no existe crearemos una con (ObjectOutputStream),
                 * tambien para no crear otra cabecera.
                 */
                File destino=new File(ruta3);

                try{
                    if(destino.exists()){
                        MiObjectOutputStream moos=new MiObjectOutputStream(new FileOutputStream(destino,true));
                        moos.writeObject(destino);
                        moos.close();
                    }else{
                        ObjectOutputStream bos=new ObjectOutputStream(new FileOutputStream(destino));
                        bos.writeObject(destino);
                        bos.close();
                    }
                    System.out.println("(Serializacion exitosa)");
                }catch(IOException e){
                    System.out.println(e.getMessage());
                }
                break;
            }else if(texto.equals("no")){
                break;
            }else{
                System.out.println("(Error de opcion)");
                System.out.println("");
            }
        }while(texto!="no");


    }

    
    /**
     * Creo archivos (Hombre, Mujer) de texto con (BufferedWriter).
     * @param bfH
     * @param bfM
     * @throws IOException 
     */
    public void Crear_personas(BufferedWriter bfH,BufferedWriter bfM) throws IOException{
        System.out.println("\n\t..::CREAR HOMBRE::..");
        System.out.print("Ingrese nombre: ");
        String nombre=entrada.nextLine();
        System.out.print("Ingrese apellido: ");
        String apellido=entrada.nextLine();
        System.out.print("Ingrese edad: ");
        int edad=entrada.nextInt();
        System.out.print("Ingrese sexo: ");
        char sexo=entrada.next().charAt(0);
        h=new Hombre(nombre, apellido, edad, sexo);
        bfH.write("\t\n..::HOMBRE::..");
        bfH.newLine();
        bfH.write("Nombre: "+nombre);
        bfH.newLine();
        bfH.write("Apellido: "+apellido);
        bfH.newLine();
        bfH.write("Edad: "+edad);
        bfH.newLine();
        bfH.write("Sexo: "+sexo);
        bfH.newLine();
        System.out.println("(Hombre creado)");
        System.out.println("");
        
        System.out.println("\n\t..::CREAR MUJER::..");
        System.out.print("Ingrese nombre: ");
        entrada.nextLine();
        nombre=entrada.nextLine();
        System.out.print("Ingrese apellido: ");
        apellido=entrada.nextLine();
        System.out.print("Ingrese edad: ");
        edad=entrada.nextInt();
        System.out.print("Ingrese sexo: ");
        sexo=entrada.next().charAt(0);
        m=new Mujer(nombre, apellido, edad, sexo);
        
        bfM.write("\t\n..::MUJER::..");
        bfM.newLine();
        bfM.write("Nombre: "+nombre);
        bfM.newLine();
        bfM.write("Apellido: "+apellido);
        bfM.newLine();
        bfM.write("Edad: "+edad);
        bfM.newLine();
        bfM.write("Sexo: "+sexo);
        bfM.newLine();
        System.out.println("(Mujer creada)");
        System.out.println("");
    }
    
    /**
     * Leo los archivos anteriores con (BufferedReader).
     * @param brH
     * @param brM
     * @throws IOException 
     */
    public void Leer(BufferedReader brH,BufferedReader brM) throws IOException{
        String mostrar=brH.readLine();
        while(mostrar!=null){
            System.out.println(mostrar);
            mostrar=brH.readLine();
        }
        mostrar=brM.readLine();
        while(mostrar!=null){
            System.out.println(mostrar);
            mostrar=brM.readLine();
        }
    }
    
    /**
     * Este metodo se encarga de leer y copiar el contiendo de los archivos(Hombre, Mujer),
     * para pegar el contenido en el archivo (destino).
     * @param biH
     * @param biM
     * @param biD
     * @throws IOException 
     */
    public void Destino(BufferedInputStream biH,BufferedInputStream biM,BufferedOutputStream biD) throws IOException{
        byte leer1[]=new byte[biH.available()];
        byte leer2[]=new byte[biM.available()];
        biH.read(leer1);
        biM.read(leer2);
        biD.write(leer1);
        biD.write(leer2);
    }
    
    /**
     * Este metodo se encarga de realizar la serializacion del archivo (destino).
     * @param ois 
     */
    public void Serializacion(ObjectInputStream ois){
        try {
            Hombre mostrar=(Hombre)ois.readObject();
            System.out.println(mostrar.toString()+"\n");
        } catch (ClassNotFoundException|IOException ex) {
            Logger.getLogger(AplicarMetodos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
