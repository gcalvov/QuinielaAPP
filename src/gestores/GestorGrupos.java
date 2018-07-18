/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestores;

import cl.*;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Gabriel
 */
public class GestorGrupos extends Gestor {
    
    public void setGrupo(String codigo, String nombre, String pequipo1, String pequipo2, String pequipo3, String pequipo4) {
        Equipo equipo1 = new Equipo();
        equipo1.setNombre(pequipo1);
        Equipo equipo2 = new Equipo();
        equipo2.setNombre(pequipo2);
        Equipo equipo3 = new Equipo();
        equipo3.setNombre(pequipo3);
        Equipo equipo4 = new Equipo();
        equipo4.setNombre(pequipo4);
        ArrayList<Equipo> equiposGrupo= new ArrayList();
        
        equiposGrupo.add(equipo1);
        equiposGrupo.add(equipo2);
        equiposGrupo.add(equipo3);
        equiposGrupo.add(equipo4);
        
        Grupo grupoX = new Grupo(codigo, nombre, equiposGrupo);
        
        cl.setOnFile(grupoX.toString(), "grupos.txt");
        

    }
    
    public ArrayList<String> getGrupo() throws IOException{
    return cl.getLista("grupos.txt");
    }
    
}
