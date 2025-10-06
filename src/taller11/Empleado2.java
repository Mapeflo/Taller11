/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller11;

/**
 *
 * @author marya
 */
public abstract class Empleado2 {
     
    String nombre;
    int edad;

    public Empleado2(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
     
    public void mostrarDetalles(){
        System.out.println("Nombre del empleado: " + nombre);
        System.out.println("Edad del empleado: " + edad);
    }
}
