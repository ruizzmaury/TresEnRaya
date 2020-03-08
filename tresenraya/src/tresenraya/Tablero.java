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
public class Tablero {

    private String[][] tablero = {  {"[]", "[]", "[]"}, 
                                    {"[]", "[]", "[]"}, 
                                    {"[]", "[]", "[]"}  };

    public Tablero() {
    }
    
    
    private int[][] casilla;

    public String[][] getTablero() {
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

    public void posicionarFicha(String tipoFicha, int fila, int columna) {
        tablero[columna][fila] = tipoFicha;

    }

    public void crearTablero() {
        
        for (int x = 0; x < tablero.length; x++) {
            for (int y = 0; y < tablero.length; y++) {
                System.out.print(tablero[y][x]);
            }
            System.out.println("\n");
        }
    }
    
    public void ganarPartida(){
        
    }

}
