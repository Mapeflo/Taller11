/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller11;

/**
 *
 * @author marya
 */
public class Rectangulo extends Figura {

    double base;
    double altura;

    public Rectangulo(double base, double altura, String nombreFigura) {
        super(nombreFigura);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea (){
        double area = base*altura;
        System.out.println("El area calculada del rectangulo es: " + area);   
        return area;
    } 
}
