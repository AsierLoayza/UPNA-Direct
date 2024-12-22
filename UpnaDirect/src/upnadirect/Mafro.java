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
public class Mafro implements Aseguradora{

    public double calcularOferta(Cliente cliente, Bien bien) {
        double oferta = bien.getValor() * 0.03;
        if (bien.getTipo().equals("vehiculo") && cliente.getEdad() < 20) {
            oferta = bien.getValor() * 0.05;
        } else if (bien.getTipo().equals("vivienda") && bien.getValor() > 200000 && cliente.getSalario() < 20000) {
            oferta = bien.getValor() * 0.02;
        }
        return oferta;
    }
    
    public double calcularComision(double importe) {
        if (importe <= 1000) {
            return (int) (importe * 0.01);
        } else {
            return (int) (importe * 0.03);
        }
    }
    
    public String getNombre()   {
        return "Mafro";
    }
}
