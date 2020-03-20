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
public class Jugador {

    private static final Scanner sc = new Scanner(System.in);
    private String tipo = "";
    private String nombreJugador;

    public Jugador(String tipo) {
        this.tipo = tipo;
    }

    public Jugador() {
    }

    public String getTipo() {
        return tipo;
    }

    public String toString() {
        nombreJugador = "Jugador " + getTipo();
        return nombreJugador;
    }

    public void ponerFicha(int f, int c) {

        for (int x = 0; x < Tablero.getTablero().length; x++) {
            for (int y = 0; y < Tablero.getTablero().length; y++) {

                if (x == f && y == c) {
                    switch (getTipo()) {
                        case "O":
                            posicionarFicha("[O]", x, y);
                            y++;
                            break;
                        case "X":
                            posicionarFicha("[X]", x, y);
                            y++;
                            break;
                    }
                }
            }
            System.out.println("\n");
        }
        Tablero.crearTablero();
    }

    public void posicionarFicha(String tipoFicha, int fila, int columna) {

        Jugador jugador1 = null;
        Jugador jugador2 = null;

        if ("[O]".equals(tipoFicha)) {

            jugador1 = new Jugador(tipoFicha);
            jugador2 = new Jugador("[X]");

        } else if ("[X]".equals(tipoFicha)) {

            jugador1 = new Jugador(tipoFicha);
            jugador2 = new Jugador("[O]");
        }

        if ("[]".equals(Tablero.getTablero()[columna][fila])) {
            Tablero.getTablero()[columna][fila] = tipoFicha;

            if (Tablero.ganarPartida(tipoFicha)) {
                Tresenraya.finaljuego = true;
            }

        } else {
            System.out.println("Ya hay una ficha, introduce otra posicion \n");
            System.out.print("Fila (x) : ");
            int x1 = sc.nextInt();
            System.out.print("Columna (y) : ");
            int y1 = sc.nextInt();

            if (fila < Tablero.getTablero().length && columna < Tablero.getTablero().length) {
                ponerFicha(x1, y1);
            } else {
                System.out.println("Introduce valores del 0 al 2");
                Tresenraya.faseGame(jugador1, jugador2);
            }

        }
    }

}
