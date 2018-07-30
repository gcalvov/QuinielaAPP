/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestores;

import cl.*;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Gabriel
 */
public class GestorMundiales extends Gestor {

    public void setMundial(LocalDate fecha, String paisOrganizador, boolean estado) {

        ArrayList<Grupo> gruposMundial = new ArrayList();

        Mundial mundialX = new Mundial(fecha, paisOrganizador, estado, gruposMundial);

        cl.setMundial(mundialX);

        //Prueba
        System.out.println("Registro Exitoso!");
        System.out.println(mundialX.toString());
    }

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

    public void setMundialRandom(LocalDate fecha, String pais, boolean estado) {
        cl.registrarMundialRandom(fecha, pais, estado);

    }

    public ArrayList<String> listarMundiales() {
        ArrayList<String> mundiales = new ArrayList();
        ArrayList<Mundial> listaMundiales = cl.getListaMundiales();
        if (listaMundiales.isEmpty()) {
            mundiales.add("No hay mundiales");
        } else {
            for (Mundial x : listaMundiales) {
                mundiales.add(x.getPaisOrganizador());
            }
        }

        return mundiales;
    }

    public ArrayList<String> getCronograma(String pais) {
        ArrayList<String> lista = cl.listarCronogramaMundial(pais);
        return lista;
    }

    public void setCronograma(String pais) {
        ArrayList<Partido> listaPartidos = new ArrayList();
        ArrayList<Mundial> listaMundiales = new ArrayList();
        listaMundiales = cl.getListaMundiales();
        for (Mundial x : listaMundiales) {
            if (x.getPaisOrganizador().equals(pais)) {
                ArrayList<Partido> partidos = new ArrayList();
                ArrayList<Grupo> gruposMundial = x.getListaGrupos();
                int i = 0;
                for (Grupo y : gruposMundial) {
                    System.out.println("TotalEquipos" + y.getEquipos().size());
                    Equipo equipo1 = y.getEquipos().get(0);
                    Equipo equipo2 = y.getEquipos().get(1);
                    Equipo equipo3 = y.getEquipos().get(2);
                    Equipo equipo4 = y.getEquipos().get(3);
                    Partido partido1 = new Partido(equipo1, equipo2, x.getAnho().plusDays(1+i));
                    Partido partido2 = new Partido(equipo3, equipo4, x.getAnho().plusDays(1+i));
                    Partido partido3 = new Partido(equipo1, equipo3, x.getAnho().plusDays(5+i));
                    Partido partido4 = new Partido(equipo2, equipo4, x.getAnho().plusDays(5+i));
                    Partido partido5 = new Partido(equipo1, equipo4, x.getAnho().plusDays(10+i));
                    Partido partido6 = new Partido(equipo2, equipo3, x.getAnho().plusDays(10+i));
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
        }
    }

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
