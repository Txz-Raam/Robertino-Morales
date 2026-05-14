/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matriz;

/**
 *
 * @author LABO B 7
 */
public class tablaMundial {
    //Tabla del Mundial
    //Durante el Mundial, las selecciones juegan distintos partidos y se registran sus resultados en tablas.
    //En esta actividad utilizaremos una matriz para representar una tabla de posiciones sencilla.
    //Consigna
    //Crear una matriz de tipo String con 8 filas y 2 columnas.La matriz deberá almacenar:
    public static void main(String[] args) {
        String[][]arena = new String [8][2];
      
        arena [0][0] = "Argentina";
        arena [0][1] = "2";
        arena [1][0] = "Brasil";
        arena [1][1] = "1";
        arena [2][0] = "Espania";
        arena [2][1] = "3";
        arena [3][0] = "Mexico";
        arena [3][1] = "0";
        arena [4][0] = "Francia";
        arena [4][1] = "4";
        arena [5][0] = "Alemania";
        arena [5][1] = "2";
        arena [6][0] = "Japon";
        arena [6][1] = "1";
        arena [7][0] = "Portugal";
        arena [7][1] = "5";
       
        System.out.println("Seleccion Goles:");
        for (int i = 0; i < arena.length; i++) {
            //Columnas
            for (int j = 0; j < arena[i].length; j++) {
                System.out.print(" ["+arena[i][j]+"] ");
            }
            System.out.println();
        }
    }
}
