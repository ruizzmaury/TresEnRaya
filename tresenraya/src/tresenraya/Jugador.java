/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tresenraya;

/**
 *
 * @author mauri
 */
public class Jugador {

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

    public void ponerFicha(int f, int c, Tablero t) {

        for (int x = 0; x < t.getTablero().length; x++) {
            for (int y = 0; y < t.getTablero().length; y++) {

                if (x == f && y == c) {
                    switch (getTipo()) {
                        case "O":
                            t.posicionarFicha("[O]", x, y);
                            y++;      
                            break;
                        case "X":
                            t.posicionarFicha("[X]", x, y);
                            y++;
                            break;
                    }
                }
            }
            System.out.println("\n");
        }
        t.crearTablero();
    }

}
