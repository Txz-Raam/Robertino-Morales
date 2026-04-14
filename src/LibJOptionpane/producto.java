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
public class producto {
    String Nombre;
    double Precio;
    
    public producto(String Nombre, double precio){
        this.Nombre = Nombre;
        this.Precio = Precio;
    }
    void Precio (){
        if(Precio>=10000){
            JOptionPane.showMessageDialog(null,"El Producto es caro....");
        }
        else{
            JOptionPane.showMessageDialog(null,"El Producto es accesible....");
        }
    }
        
}
