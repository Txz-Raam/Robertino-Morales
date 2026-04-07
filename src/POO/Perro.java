/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO;

/**
 *
 * @author LABO B 7
 */
//Crear una clase Perro:
//Atributos: nombre, raza
//Método: ladrar() → "Guau! Guau!"
//Crear 2 objetos y ejecutar el método

public class Perro {
    String raza;

    String nombre;

    public Perro(String raza, String nombre) {
        this.raza = raza;     
        this.nombre = nombre;
    }

    void ladrar() {
        System.out.println(nombre + " dice: Guau! Guau!");
    }

}
