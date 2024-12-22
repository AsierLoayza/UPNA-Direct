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
public class TecnicoComercial {

    private Aseguradora[] aseguradoras = {new Mafro(), new LineaIndirecta(), new Adasles()};

    public String calcularMejorOferta(Cliente cliente, Bien bien) {
        double mejorOferta = Double.MAX_VALUE;
        String mejorAseguradora = "";
        double mejorComision = 0;

        for (Aseguradora aseguradora : aseguradoras) {
            double oferta = aseguradora.calcularOferta(cliente, bien);
            double comision = aseguradora.calcularComision(oferta);

            if (oferta < mejorOferta || (oferta == mejorOferta && comision > mejorComision)) {
                mejorOferta = oferta;
                mejorAseguradora = aseguradora.getNombre();
                mejorComision = comision;
            }
        }

        return mejorAseguradora + " | " + (int) mejorOferta + " | " + mejorComision;
    }    
}
