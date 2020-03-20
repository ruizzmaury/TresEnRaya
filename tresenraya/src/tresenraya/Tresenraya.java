/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tresenraya;

import java.util.Scanner;

/**
 *
 * @author mauri
 */
public class Tresenraya {

    private static final Scanner sc = new Scanner(System.in);
    static boolean finaljuego = false;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("Jugador1 elige ficha: \n"
                + " - Pulsa 1 para O \n"
                + " - Pulsa 2 para X \n"
                + "Al segundo jugador se le asignará la otra ficha...\n");

        System.out.print("Elige ficha: ");

        int opcion = sc.nextInt();

        Tablero.crearTablero();

        switch (opcion) {
            case 1:
                Jugador jugadorOO = new Jugador("O");
                Jugador jugadorOX = new Jugador("X");
                faseGame(jugadorOO, jugadorOX);
                break;
            case 2:
                Jugador jugadorXX = new Jugador("X");
                Jugador jugadorXO = new Jugador("O");
                faseGame(jugadorXX, jugadorXO);
                break;
        }

    }

    public static void faseGame(Jugador primero, Jugador segundo) {
        

        while (!finaljuego) {
            for (int i = 0; i < 2; i++) {
                switch(i){
                        case 0: System.out.print("El jugador " + primero.toString() + " pone pieza\n");break;
                        case 1: System.out.print("El jugador " + segundo.toString() + " pone pieza\n");break;
                    }
             
                System.out.print("Donde quieres ponerla? \n"
                        + "Introduce fila y columna\n");

                System.out.print("Fila (x) : ");
                int x = sc.nextInt();
                System.out.print("Columna (y) : ");
                int y = sc.nextInt();

                if (x < Tablero.getTablero().length && y < Tablero.getTablero().length) {
                    switch(i){
                        case 0: primero.ponerFicha(x, y);
                        if(finaljuego){
                            return;
                        }
                        break;
                        case 1: segundo.ponerFicha(x, y);
                        if(finaljuego){
                            return;
                        }
                        break;
                    }
                    
                } else {
                    System.out.println("Introduce un valores del 0 al 2");
                }
            }

        }
    }

}
