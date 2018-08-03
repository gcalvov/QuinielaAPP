/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestores;

import cl.Equipo;
import cl.Grupo;
import cl.Mundial;
import cl.Cronograma;
import static gestores.Gestor.cl;
import java.util.ArrayList;

/**
 *
 * @author Gabriel
 */
public class GestorCronogramas extends Gestor {

    public ArrayList<String> getCronograma(String pais) {
        ArrayList<String> cronogramaMundial = new ArrayList();

        for (Mundial dato : cl.getListaMundiales()) {
            if (dato.getPaisOrganizador().equals(pais)) {
                cronogramaMundial = dato.getListaPartidos();
            }
        }
        return cronogramaMundial;
    }

    public ArrayList<String> getCronogramaCompleto(String pais) {
        ArrayList<String> cronogramaMundial = new ArrayList();

        for (Mundial dato : cl.getListaMundiales()) {
            if (dato.getPaisOrganizador().equals(pais)) {
                cronogramaMundial = dato.getListaPartidosCompleto();
            }
        }
        return cronogramaMundial;
    }

    public void setCronograma(String pais) {
        ArrayList<Cronograma> listaPartidos = new ArrayList();
        Mundial x = cl.buscarMundial(pais);
        ArrayList<Grupo> gruposMundial = x.getListaGrupos();
        int i = 0;
        for (Grupo y : gruposMundial) {
            System.out.println("TotalEquipos" + y.getEquipos().size());
            Equipo equipo1 = y.getEquipos().get(0);
            Equipo equipo2 = y.getEquipos().get(1);
            Equipo equipo3 = y.getEquipos().get(2);
            Equipo equipo4 = y.getEquipos().get(3);
            Cronograma partido1 = new Cronograma((i * (6) + 1), equipo1, equipo2, x.getAnho().plusDays(1 + i), y.getNombreGrupo());
            Cronograma partido2 = new Cronograma((i * (6) + 2), equipo3, equipo4, x.getAnho().plusDays(1 + i), y.getNombreGrupo());
            Cronograma partido3 = new Cronograma((i * (6) + 3), equipo1, equipo3, x.getAnho().plusDays(5 + i), y.getNombreGrupo());
            Cronograma partido4 = new Cronograma((i * (6) + 4), equipo2, equipo4, x.getAnho().plusDays(5 + i), y.getNombreGrupo());
            Cronograma partido5 = new Cronograma((i * (6) + 5), equipo1, equipo4, x.getAnho().plusDays(10 + i), y.getNombreGrupo());
            Cronograma partido6 = new Cronograma((i * (6) + 6), equipo2, equipo3, x.getAnho().plusDays(10 + i), y.getNombreGrupo());
            listaPartidos.add(partido1);
            listaPartidos.add(partido2);
            listaPartidos.add(partido3);
            listaPartidos.add(partido4);
            listaPartidos.add(partido5);
            listaPartidos.add(partido6);
            i++;
        }
        x.setListaPartidos(listaPartidos);
    }

    public void actualizarResultadosCronograma(String pais, int codigo, int goles1, int goles2) {
        Mundial x = cl.buscarMundial(pais);
        for (Cronograma partidosMundial : x.getCronograma()) {
            if (partidosMundial.getCodigo() == codigo) {
                partidosMundial.setGolesEquipo1(goles1);
                partidosMundial.setGolesEquipo2(goles2);
            }
        }
    }

}
