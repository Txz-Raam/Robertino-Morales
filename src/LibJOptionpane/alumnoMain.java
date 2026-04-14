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
public class alumnoMain {
    public static void main(String[] args) {
        String Nombre = JOptionPane.showInputDialog("Ingresa el nombre del alumno: ");
        double Nota = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la nota del alumno: "));
        
        alumno primerAlumno = new alumno(Nombre,Nota);
        primerAlumno.Aprobado();
    
    }
}
