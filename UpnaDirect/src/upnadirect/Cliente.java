/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upnadirect;

/**
 *
 * @author alumno
 */
public class Cliente {
    private int anioNacimiento;
    private double salario;

    public Cliente(int anioNacimiento, double salario) {
        this.anioNacimiento = anioNacimiento;
        this.salario = salario;
    }

    public int getEdad() {
        return 2024 - anioNacimiento;
    }

    public double getSalario() {
        return salario;
    }
    
    public boolean validarCliente() {
        return (anioNacimiento > 1900 && anioNacimiento <= 2024) && salario > 0;
    }
}
