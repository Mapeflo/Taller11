/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller11;

/**
 *
 * @author marya
 */
public class Gerente2 extends Empleado2 {

    public Gerente2(String nombre, int edad) {
        super(nombre, edad);
    }
    //Es opcional sobreescribir el metodo concreto, no necesario.
    @Override
    public void mostrarDetalles(){
        System.out.println("Nombre del gerente: " + nombre);
        System.out.println("Edad del gerente: " +  edad);
    }
    
}
