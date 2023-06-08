package org.example;

import lombok.experimental.UtilityClass;

import java.util.Scanner;

/**
 * Esto proyecto es del juego de piedra, papel o tijeras.
 */

@UtilityClass
public class Game {

    private Scanner entrada=new Scanner(System.in);

    public void Play(){
        String stone = "\uD83D\uDDFF";
        String paper = "\uD83D\uDCC4";
        String scissors = "✂️";
        int puntoP1=0;
        int puntoP2=0;

        System.out.println("\n\t..::GAME OF STONE, PAPER OR SCISSORS::..\n");
        System.out.println("First start the Player 1\n");
        do{
            System.out.println("Turn of Player 1");
            System.out.println("Selection one choice to play:");
            System.out.println("(1/"+stone+"),(2/"+paper+"),(3/"+scissors+")");
            System.out.print("Option: ");
            int opcion=entrada.nextInt();

            if(opcion==1){ // Player 1
                System.out.println("Turn of Player 2");
                System.out.println("Selection one choice to play:");
                System.out.println("(1/"+stone+"),(2/"+paper+"),(3/"+scissors+")");
                System.out.print("Option: ");
                opcion=entrada.nextInt();
                System.out.println();
                if(opcion==1){ // Player 2
                    System.out.println("Tie");
                    System.out.println(stone+" - "+stone);
                }else if(opcion==2){ // Player 2
                    System.out.println();
                    puntoP2++;
                    System.out.println("Point to Player 2: "+puntoP2);
                    System.out.println(stone+" - "+paper);
                }else if(opcion==3){ // Player 2
                    System.out.println();
                    puntoP1++;
                    System.out.println("Point to Player 1: "+puntoP1);
                    System.out.println(stone+" - "+scissors);
                }
            }else if(opcion==2){ // Player 1
                System.out.println();
                System.out.println("Turn of Player 2");
                System.out.println("Selection one choice to play:");
                System.out.println("(1/"+stone+"),(2/"+paper+"),(3/"+scissors+")");
                System.out.print("Option: ");
                opcion=entrada.nextInt();
                if(opcion==2){ // Player 2
                    System.out.println();
                    System.out.println("Tie");
                    System.out.println(paper+" - "+paper);
                }else if(opcion==1){ // Player 2
                    System.out.println();
                    puntoP1++;
                    System.out.println("Point to Player 1: "+puntoP1);
                    System.out.println(paper+" - "+stone);
                }else if(opcion==3){ // Player 2
                    System.out.println();
                    puntoP2++;
                    System.out.println("Point to Player 2: "+puntoP2);
                    System.out.println(paper+" - "+scissors);
                }
            }else if(opcion==3){
                System.out.println();
                System.out.println("Turn of Player 2");
                System.out.println("Selection one choice to play:");
                System.out.println("(1/"+stone+"),(2/"+paper+"),(3/"+scissors+")");
                System.out.print("Option: ");
                opcion=entrada.nextInt();
                if(opcion==3){ // Player 2
                    System.out.println();
                    System.out.println("Tie");
                    System.out.println(scissors+" - "+scissors);
                }else if(opcion==1){ // Player 2
                    System.out.println();
                    puntoP2++;
                    System.out.println("Point to Player 2: "+puntoP2);
                    System.out.println(scissors+" - "+stone);
                }else if(opcion==2){ // Player 2
                    System.out.println();
                    puntoP1++;
                    System.out.println("Point to Player 1: "+puntoP1);
                    System.out.println(scissors+" - "+paper);
                }
            }
            if(puntoP1==3){
                System.out.println("Player 1 Win!");
                System.out.println("Result of game:");
                System.out.println("Player 1: "+puntoP1+" - Player 2: "+puntoP2);
                System.out.println();
            }else if(puntoP2==3)
                System.out.println("Player 2 Win!");
            System.out.println("Result of game:");
            System.out.println("Player 1: "+puntoP1+" - Player 2: "+puntoP2);
            System.out.println();
        }while(puntoP1!=3 && puntoP2!=3);
    }

}
