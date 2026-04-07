/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practico.n2;

import java.util.Scanner;

/**
 *
 * @author LABO B 7
 */
public class Ejercicio_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Ejercicio_1
        Scanner SC = new Scanner (System.in);
        System.out.println("Ingresa tu edad:");
        int edad = SC.nextInt();
        
        if (edad>18){
            System.out.println("Acceso Permitido");
        }
        else{
            System.out.println("Acceso Denegado");
        }
    }
    
}
