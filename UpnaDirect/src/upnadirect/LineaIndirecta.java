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
public class LineaIndirecta implements Aseguradora {
    
    public double calcularOferta(Cliente cliente, Bien bien) {
        double oferta = bien.getValor() * 0.03;
        if ((bien.getTipo().equals("vehiculo") && bien.getValor() < 20000) ||
            (bien.getTipo().equals("vivienda") && bien.getValor() < 150000)) {
            oferta = bien.getValor() * 0.04;
        } else if (bien.getTipo().equals("vehículo") && bien.getValor() >= 20000 && cliente.getEdad() > 60) {
            oferta = bien.getValor() * 0.06;
        }
        return oferta;
    }

    public double calcularComision(double importe) {
        if (importe <= 1000) {
            return (int) (importe * 0.01);
        } else {
            return (int) (importe * 0.04);
        }
    }
    
    public String getNombre()   {
        return "Linea Indirecta";
    }
}
