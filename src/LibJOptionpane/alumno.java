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
public class alumno {
    String Nombre;
    double Nota;
    
    public alumno(String Nombre, double Nota){
        this.Nombre = Nombre;
        this.Nota = Nota;
    }
    void Aprobado (){
        if(Nota>=6){
            JOptionPane.showMessageDialog(null,"El alumno aprobo....");
        }
        else{
            JOptionPane.showMessageDialog(null,"El alumno Reprobo....");   
        }
    }    
}
