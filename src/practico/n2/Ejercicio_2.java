/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practico.n2;

import java.util.Scanner;

/**
 *
 * @author LABO B 7
 */
public class Ejercicio_2 {
    public static void main(String[] args) {
        //Ejecicio_2
        Scanner SC = new Scanner (System.in);
        System.out.println("Ingresa un numero");
        int num = SC.nextInt();
        
        if (num>0){
            System.out.println("El numero es positivo");
        }
        else if (num==0){
            System.out.println("El numero es neutro");
        }
        else {
            System.out.println("el numero es negativo");
        }
    }
}
