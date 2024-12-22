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
public interface Aseguradora {
    double calcularComision(double importe);   
    double calcularOferta(Cliente cliente, Bien bien);
    String getNombre();
}
