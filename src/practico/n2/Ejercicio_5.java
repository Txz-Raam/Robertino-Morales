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
public class Ejercicio_5 {
    public static void main(String[] args) {
        //Ejercico_5
        Scanner SC = new Scanner (System.in);
        System.out.println("Elija el numero del apartado del menu");
        System.out.println("1 = Ver su pefil");
        System.out.println("2 = Editar sus datos");
        System.out.println("3 = Cerrar Seccion");
        int num = SC. nextInt();
        
        if (num==1){
            System.out.println("Elijio ver su perfil.");
        }
        else if (num==2){
            System.out.println("Elijio editar sus datos.");
        }
        else if (num==3){
            System.out.println("Elijio cerrar seccion.");
        }
        

    }
}
