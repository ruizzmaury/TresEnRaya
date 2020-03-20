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
public class Tablero {

    private static final Scanner sc = new Scanner(System.in);

    private static String[][] tablero = {{"[]", "[]", "[]"},
    {"[]", "[]", "[]"},
    {"[]", "[]", "[]"}};

    public Tablero() {
    }

    private int[][] casilla;

    public static String[][] getTablero() {
        return tablero;
    }

    public void setTablero(String[][] tablero) {
        this.tablero = tablero;
    }

    public Tablero(int[][] casilla) {
        this.casilla = casilla;
    }

    public int[][] getCasilla() {
        return casilla;
    }

    public void setCasilla(int[][] casilla) {
        this.casilla = casilla;
    }

    public static void crearTablero() {

        for (int x = 0; x < tablero.length; x++) {
            for (int y = 0; y < tablero.length; y++) {
                System.out.print(tablero[y][x]);
            }
            System.out.println("\n");
        }
    }

    public static boolean ganarPartida(String tipoFicha) {
        int x = 0;
        int y = 0;
        
        for (x = 0; x < tablero.length; x++) {
            y = 0;

            if ((tipoFicha.equals(tablero[y][x]))
                    && (tipoFicha.equals(tablero[y+1][x]))
                    && (tipoFicha.equals(tablero[y+2][x]))) {
                
                System.out.println("El jugador " + tipoFicha + " ha ganado!!");
                return true;
            }
        }
        
        for (y = 0; y < tablero.length; y++) {
            x = 0;

            if ((tipoFicha.equals(tablero[y][x]))
                    && (tipoFicha.equals(tablero[y][x + 1]))
                    && (tipoFicha.equals(tablero[y][x + 2]))) {
                
                System.out.println("El jugador " + tipoFicha + " ha ganado!!");
                return true;
            }
        }
        x = 0;
        y = 0;
        if ((tipoFicha.equals(tablero[x][x]))
                && (tipoFicha.equals(tablero[x + 1][x + 1]))
                && (tipoFicha.equals(tablero[x + 2][x + 2]))) {
            
            System.out.println("El jugador " + tipoFicha + " ha ganado!!");
            return true;
        }

        if ((tipoFicha.equals(tablero[0][2]))
                && (tipoFicha.equals(tablero[1][1]))
                && (tipoFicha.equals(tablero[2][0]))) {
            
            System.out.println("El jugador " + tipoFicha + " ha ganado!!");
            return true;
        }

        return false;
    }

}
