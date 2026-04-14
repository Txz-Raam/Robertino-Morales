/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LibJOptionpane;

import javax.swing.JOptionPane;

/**
 *
 * @author LABO B 7
 */
public class persona {
    String Nombre;
    int Edad;
    
    public persona(String Nombre,int Edad){
        this.Nombre = Nombre;
        this.Edad = Edad;
    }
    void Legalidad (){
        if(Edad>=18){
            JOptionPane.showMessageDialog(null,Nombre+" es mayor de edad....");
        }
        else{
            JOptionPane.showMessageDialog(null,Nombre+" es menor de edad....");   
        }
    }    
}
