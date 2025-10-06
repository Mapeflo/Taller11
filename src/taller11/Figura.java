/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller11;

/**
 *
 * @author marya
 */
public abstract class Figura {
    
    String nombreFigura;

    public Figura(String nombreFigura) {
        this.nombreFigura = nombreFigura;
    }
    
    public abstract double calcularArea();
    
    public void mostrarArea(){
        System.out.println("Nombre de la figura: " + nombreFigura);
        System.out.println("El area de la figura es: " + calcularArea());
    }   
}
    
