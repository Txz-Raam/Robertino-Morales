/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matriz;

/**
 *
 * @author LABO B 7
 */
public class demoMatriz {
    public static void main(String[] args) {
        String[][]arena = new String [5][5];
        //Colocamos un barbaro en fila 1, columna 3
        arena [1][3] = "ramiro";
        arena [2][1] = "mara";
        arena [3][3] = "max";
        arena [3][2] = "eli";
        arena [4][4] = "lujan";
        //Para acceder a esa posición:
        
        for (int i = 0; i < arena.length; i++) {
            //Columnas
            for (int j = 0; j < arena.length; j++) {
                System.out.print(" | "+arena[i][j]+" | ");
            }
            System.out.println();
        }
    }
    
}
