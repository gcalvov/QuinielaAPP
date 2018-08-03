/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestores;

import cl.Liga;
import cl.Mundial;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Gabriel
 */
public class GestorLigas extends Gestor{
    
        public void setLiga(String pais, String nombre, LocalDate FechaCreacion, boolean estatus, boolean privada) {
        ArrayList<Mundial> listaMundiales = new ArrayList();
        listaMundiales = cl.getListaMundiales();
        for (Mundial x : listaMundiales) {
            if (x.getPaisOrganizador().equals(pais)) {
                Liga ligaNueva = new Liga(nombre, FechaCreacion, estatus, privada);
                x.getListaLigas().add(ligaNueva);
            }
        }

    }

    public ArrayList<String> getLigas(String pais) {
        ArrayList<Mundial> listaMundiales = new ArrayList();
        listaMundiales = cl.getListaMundiales();
        ArrayList<String> listaLigas = new ArrayList();
        for (Mundial x : listaMundiales) {
            if (x.getPaisOrganizador().equals(pais)) {
                listaLigas = x.getListaLigasString();
            }
        }
        return listaLigas;
    }
    
}
