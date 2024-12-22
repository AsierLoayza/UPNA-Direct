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
public class BienTest {
    @Test
    public void testBienValidoVehiculo() {
        Bien bien = new Bien("vehiculo", 20000);
        assertTrue(bien.validarBien());
    }

    @Test
    public void testBienInvalidoVehiculoPorValor() {
        Bien bien = new Bien("vehiculo", 60000);
        assertFalse(bien.validarBien());
    }

    @Test
    public void testBienValidoVivienda() {
        Bien bien = new Bien("vivienda", 100000);
        assertTrue(bien.validarBien());
    }

    @Test
    public void testBienInvalidoViviendaPorValor() {
        Bien bien = new Bien("vivienda", 40000);
        assertFalse(bien.validarBien());
    }
}
