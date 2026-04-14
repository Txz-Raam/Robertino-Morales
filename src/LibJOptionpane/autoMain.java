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
public class autoMain {
    public static void main(String[] args) {
        String Marca = JOptionPane.showInputDialog("Ingresa la marca de tu auto: ");
        String Modelo = JOptionPane.showInputDialog("Ingresa el modelo de tu auto: ");
        
        auto primerAuto = new auto(Marca,Modelo);
        primerAuto.arrancar();
    
    }
}
