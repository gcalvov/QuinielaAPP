/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestores;

import cl.*;
import java.util.ArrayList;

/**
 *
 * @author Gabriel
 */
public class GestorEquipos extends Gestor {

    public GestorEquipos() {
    }

    public String registrarEquipos(String iso, String nombre, int rankinFIFA) {
        String log = "";
        Equipo equipoNuevo = new Equipo(iso, nombre, rankinFIFA);
        log = cl.setEquipos(equipoNuevo);
        return log;
    }

    public String[] listarEquipos() {
        return cl.listarEquipos();
    }
    
    public ArrayList<Equipo> getListaEquipos(){
    return cl.getListaEquipos();
    }

}
