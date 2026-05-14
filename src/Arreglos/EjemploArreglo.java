/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arreglos;

/**
 *
 * @author LABO B 7
 */
import javax.swing.JOptionPane;
public class EjemploArreglo {
    public static void main(String[] args) {
        
        String [] nombres = new String [5];
        
        nombres [0] = "Fer";
        nombres [1] = "Martin";
        nombres [2] = "Yago";
        nombres [3] = "Ramiro";
        nombres [4] = "Mariel";
        
        
        
        for (int i = 0; i < nombres.length; i++) {
            JOptionPane.showMessageDialog(null, nombres[i]);
        }
    }
}
