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
public class auto {
    String Marca;
    String Modelo;
    
    public auto(String Marca,String Modelo){
        this.Marca = Marca;
        this.Modelo = Modelo;
    }
    void arrancar (){
        JOptionPane.showMessageDialog(null,"Arranco la navee....");
    }
}
