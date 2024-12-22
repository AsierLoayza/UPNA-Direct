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
public class ConsolaTest {
    
    @Test
    public void testVistaConsola() {
        Consola consola = new Consola();
        
        TecnicoComercial tecnico = new TecnicoComercial();
        Cliente cliente = new Cliente(2005, 15000);
        Bien bien = new Bien("vehiculo", 30000);
        String resultado = consola.ejecutar(tecnico, cliente, bien);
        assertEquals("Linea Indirecta | 900 | 9.0", resultado);
    }    
}
