/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matriz;

/**
 *
 * @author LABO B 7
 */
public class clashRoyale {
    //Crear una matriz llamada Arena que sea  3x3 luego:
    //Guardar distintas cartas o elementos.
    //Mostrar toda la matriz en consola.
    //Identificar:
    //fila,
    //columna,
    //posición de cada elemento.
    
    public static void main(String[] args) {
        String[][]arena = new String [3][3];
        //Colocamos un barbaro en fila 1, columna 3
        arena [0][0] = "pekka";
        arena [0][1] = "duende";
        arena [0][2] = "mega caballero";
        
        arena [1][0] = "chancho evo";
        arena [1][1] = "larry";
        arena [1][2] = "Sabueso";
        
        arena [2][0] = "globo";
        arena [2][1] = "bruja";
        arena [2][2] = "flechas";
        //Para acceder a esa posición:
        
        for (int i = 0; i < arena.length; i++) {
            //Columnas
            for (int j = 0; j < arena.length; j++) {
                System.out.print(" ["+arena[i][j]+"] ");
            }
            System.out.println();
        }
    }

}
