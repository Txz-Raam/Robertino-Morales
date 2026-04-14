/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO;

/**
 *
 * @author LABO B 7
 */
public class Auto {
    String marca;
    String modelo;
    int velocidad;

    // Constructor

        public Auto(String marca, String modelo ) {
            this.marca = marca;
            this.modelo = modelo;
            
        }
    
    

    // Métodos
    void Acelerar () {
        velocidad+= 100;
        System.out.println("El auto marca "+marca+" esta Acelerando a: "+velocidad+"km/h.");
    }
    void Frenar () {
        velocidad-= 30;
        if(velocidad < 20){
        System.out.println("El auto marca "+marca+" esta Acelerando a: "+velocidad+ "km/h");
    }
        
    }
}
