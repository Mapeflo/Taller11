/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller11;

/**
 *
 * @author marya
 */
public abstract class Empleado {
    
    String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }
    
    public abstract double calcularSalario();
    
    public void mostrarDetalles(){
        System.out.println("Nombre del empleado: " + nombre);
        System.out.println("Detalles del empleado: " + calcularSalario());
    }
    
}
