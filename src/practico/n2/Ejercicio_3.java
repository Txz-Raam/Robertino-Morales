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
public class Ejercicio_3 {
    public static void main(String[] args) {
        //Ejecicio_3
        Scanner SC = new Scanner (System.in);
        System.out.println("Ingrese su nota para ser clasificada:");
        int nota= SC.nextInt();
                
        if (nota>=9 || nota==10 ){
            System.out.println("Clasificacion:  Exelente");
        }        
        else if (nota>=7 || nota==8 ){
            System.out.println("Clasificacion:  Aprobado");
        }                
        else if (nota>=4 || nota==6 ){
            System.out.println("Clasificacion:  Exelente");
        } 
        else if (nota>=0 || nota==3 ){
            System.out.println("Clasificacion:  Desaprobado");
        }        
    }
    
}
