/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller11;

/**
 *
 * @author marya
 */
public class Gerente extends Empleado {
    
    double valorHora;
    double numeroHoras;
    double bonificacion;

    public Gerente(double valorHora, double numeroHoras, double bonificacion, String nombre) {
        super(nombre);
        this.valorHora = valorHora;
        this.numeroHoras = numeroHoras;
        this.bonificacion = bonificacion;
    }
    @Override
    public double calcularSalario(){
        double salarioTotal = (valorHora*numeroHoras)+bonificacion;
        System.out.println("El salario del gerente es: " + salarioTotal);
      return salarioTotal;  
    }
    
    
    
    
    
    
    
    
    
}
