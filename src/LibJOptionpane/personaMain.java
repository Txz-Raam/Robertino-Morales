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
public class personaMain {
    public static void main(String[] args) {
        String Nombre = JOptionPane.showInputDialog("Ingresa el nombre de la persona: ");
        int Edad = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la edad de la persona: "));
        
        persona primerPersona = new persona(Nombre,Edad);
        primerPersona.Legalidad();
    
    }
}
