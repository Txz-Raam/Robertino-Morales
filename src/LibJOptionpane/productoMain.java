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
public class productoMain {
    public static void main(String[] args) {
        String Nombre = JOptionPane.showInputDialog("Ingresa el nombre del producto: ");
        double Precio = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el precio del producto: "));
        
        producto primerPrecio = new producto(Nombre,Precio);
        primerPrecio.Precio();
    
    }
}
