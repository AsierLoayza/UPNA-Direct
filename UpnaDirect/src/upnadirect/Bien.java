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
public class Bien {
    private String tipo;
    private double valor;

    public Bien(String tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public double getValor() {
        return valor;
    }
    
    public boolean validarBien() {
        if (tipo.equals("vehículo")) {
            return valor <= 50000;
        } else if (tipo.equals("vivienda")) {
            return valor >= 50000;
        }
        return false;
    }
}

