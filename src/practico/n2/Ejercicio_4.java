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
public class Ejercicio_4 {
    public static void main(String[] args) {
        //Ejercicio_4
        Scanner SC = new Scanner (System.in);
        System.out.println("Ingrese un numero");
        int num1= SC.nextInt();
        System.out.println("Ingrese un numero");
        int num2= SC.nextInt();
        System.out.println("Ingrese un numero");
        int num3= SC.nextInt();
        
        if (num1>num2&num1>num3){
            System.out.println("El numero:"+num1+" es el mayor.");
        }
        else if (num2>num1&num2>num3){
            System.out.println("El numero:"+num2+" es el mayor.");
        }
        else if (num3>num2&num3>num1){
            System.out.println("El numero:"+num3+" es el mayor.");
        
        }
    }
}
