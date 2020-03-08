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
    private static final Tablero t = new Tablero();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("Jugador1 elige ficha: \n"
                + " - Pulsa 1 para O \n"
                + " - Pulsa 2 para X \n"
                + "Al segundo jugador se le asignará la otra ficha...");

        int opcion = sc.nextInt();

        t.crearTablero();

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
        boolean finaljuego = false;

        while (!finaljuego) {
            System.out.print("El jugador " + primero.toString() + " pone pieza");
            System.out.print("Donde quieres ponerla? \n"
                    + "Introduce fila y columna\n");
            
            System.out.print("Fila (x) : ");
            int x = sc.nextInt();
            System.out.print("Fila (y) : ");
            int y = sc.nextInt();

            if (x < t.getTablero().length && y < t.getTablero().length) {
                primero.ponerFicha(x, y, t);
            } else {
                System.out.println("Introduce un valores del 0 al 2");
            }

            System.out.print("El jugador " + segundo.toString() + " pone pieza");
            System.out.print("Donde quieres ponerla? \n"
                    + "Introduce fila y columna\n");
            
            System.out.print("Fila (x) : ");
            int x1 = sc.nextInt();
            System.out.print("Fila (y) : ");
            int y1 = sc.nextInt();

            if (x < t.getTablero().length && y < t.getTablero().length) {
                segundo.ponerFicha(x1, y1, t);
            } else {
                System.out.println("Introduce un valores del 0 al 2");
            }

        }
    }

}
