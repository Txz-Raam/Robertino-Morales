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
    double altura;
    

    // Constructor
    public Chango(String nombre, int edad, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }

    // Métodos
    void jugando() {
        System.out.println(nombre + " esta jugando Free fire...");
    }

    void hablando() {
        System.out.println(nombre + " esta hablando y distrayendo a los demas...");
    }
    
    void concentrado() {
        System.out.println(nombre + " esta concentrado intentondo estudiar...");
    }
    
    void practicando() {
        System.out.println(nombre + " esta practicando un ejercio de matematica...");
    }

}
