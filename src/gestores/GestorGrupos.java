/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestores;

import cl.Equipo;
import cl.Grupo;
import cl.Mundial;
import java.util.ArrayList;

/**
 *
 * @author Gabriel
 */
public class GestorGrupos extends Gestor{
    
        public void setGrupoMundial(String pais, String codGrupo, String nombreGrupo, ArrayList<String> pequipos) {
        ArrayList<Mundial> mundiales = cl.getListaMundiales();
        ArrayList<Equipo> equipos = cl.getListaEquipos();
        ArrayList<Equipo> equiposGrupo = new ArrayList();
        for (Equipo e : equipos) {
            if (e.getNombre().equals(pequipos.get(0))) {
                equiposGrupo.add(e);
            }
            if (e.getNombre().equals(pequipos.get(1))) {
                equiposGrupo.add(e);
            }
            if (e.getNombre().equals(pequipos.get(2))) {
                equiposGrupo.add(e);
            }
            if (e.getNombre().equals(pequipos.get(3))) {
                equiposGrupo.add(e);
            }

        }

        for (Mundial x : mundiales) {
            if (x.getPaisOrganizador().equals(pais)) {
                Grupo grupoX = new Grupo(codGrupo, nombreGrupo, equiposGrupo);
                x.anhadirGrupo(grupoX);
            }
            System.out.println(x.getListaGrupos().toString());
        }

        // Prueba 
    }
    
}
