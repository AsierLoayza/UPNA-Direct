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
public class ClienteTest {
    
    @Test
    public void testClienteValido() {
        Cliente cliente = new Cliente(1990, 25000);
        assertTrue(cliente.validarCliente());
    }

    @Test
    public void testClienteInvalidoPorAnio() {
        Cliente cliente = new Cliente(1899, 25000);
        assertFalse(cliente.validarCliente());
    }

    @Test
    public void testClienteInvalidoPorSalario() {
        Cliente cliente = new Cliente(1990, 0);
        assertFalse(cliente.validarCliente());
    }
}
