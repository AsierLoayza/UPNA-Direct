/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upnadirect;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alumno
 */
public class AseguradoraTest {
    
     @Test
    public void testOfertaMafro() {
        Cliente cliente = new Cliente(2000, 15000);
        Bien bien = new Bien("vehículo", 30000);
        Mafro mafro = new Mafro();
        double oferta = mafro.calcularOferta(cliente, bien);
        assertEquals(900, oferta, 0.01);
    }

    @Test
    public void testOfertaLineaIndirecta() {
        Cliente cliente = new Cliente(2005, 15000);
        Bien bien = new Bien("vehículo", 30000);
        LineaIndirecta lineaIndirecta = new LineaIndirecta();
        double oferta = lineaIndirecta.calcularOferta(cliente, bien);
        assertEquals(900, oferta, 0.01);
    }

    @Test
    public void testOfertaAdasles() {
        Cliente cliente = new Cliente(1960, 40000);
        Bien bien = new Bien("vivienda", 250000);
        Adasles adasles = new Adasles();
        double oferta = adasles.calcularOferta(cliente, bien);
        assertEquals(5000, oferta, 0.01);
    }
}
