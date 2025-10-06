/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller11;

/**
 *
 * @author marya
 */
public class Vendedor extends Empleado {
    
    double valorHora;
    double numeroHoras;
    double comision; 

    public Vendedor(double valorHora, double numeroHoras, double comision, String nombre) {
        super(nombre);
        this.valorHora = valorHora;
        this.numeroHoras = numeroHoras;
        this.comision = comision;
    }
   
    @Override
    public double calcularSalario(){
        double salarioTotal = (valorHora*numeroHoras)+comision;
        System.out.println("El salario del vendedor: " + salarioTotal);
        return salarioTotal;   
   }
}
    
    
    
    
