/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO;

/**
 *
 * @author LABO B 7
 */
public class Chango {
    // Atributos
    String nombre;
    int edad;

    // Constructor
    public Chango(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Métodos
    void jugando() {
        System.out.println(nombre + " está jugando Free fire...");
    }

    void hablando() {
        System.out.println(nombre + " está hablando y distrayendo a los demas...");
    }
    
    void concentrado() {
        System.out.println(nombre + " está concentrado intentondo estudiar...");
    }
    
    void practicando() {
        System.out.println(nombre + " está practicando un ejercio de matematica...");
    }

}
