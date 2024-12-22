/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upnadirect;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Consola {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TecnicoComercial tecnico = new TecnicoComercial();
        
        Cliente cliente = null;
        do  {
            System.out.print("Año de nacimiento: ");
            int anioNacimiento = scanner.nextInt();

            System.out.print("Salario anual: ");
            double salario = scanner.nextDouble();

            cliente = new Cliente(anioNacimiento, salario);
            if (!cliente.validarCliente()) {
                        System.out.println("Error: Los datos del cliente no son válidos. Intente nuevamente.");
            }
        } while (!cliente.validarCliente());
        
        Bien bien = null;
        do {
            System.out.print("Tipo de bien (vehiculo/vivienda): ");
            String tipo = scanner.next();

            System.out.print("Valor del bien: ");
            double valor = scanner.nextDouble();

            bien = new Bien(tipo, valor);
        } while (!bien.validarBien());

        String mejorOferta = tecnico.calcularMejorOferta(cliente, bien);
        System.out.println("Mejor oferta: " + mejorOferta);

    }
}
