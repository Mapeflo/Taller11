/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller11;

/**
 *
 * @author marya
 */
public class Circulo extends Figura {

   double radio;

    public Circulo(double radio, String nombreFigura) {
        super(nombreFigura);
        this.radio = radio;
    }
   
   @Override
    public double calcularArea(){
        double area = Math.PI*(radio*radio);
        System.out.println("El area del circulo es: " + area);   
        return  area;
    }  
}
