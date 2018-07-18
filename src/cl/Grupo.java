/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl;

import java.util.ArrayList;

/**
 *
 * @author Gabriel
 */
public class Grupo {

    private String codigo;
    private String nombreGrupo;
    private ArrayList<Equipo> listaEquipos;

    public Grupo() {
    }

    public Grupo(String codigo, String nombre, ArrayList<Equipo> equiposAsociados) {
        this.codigo = codigo;
        this.nombreGrupo = nombre;
        setListaEquipos(equiposAsociados);
    }

    public void setListaEquipos(ArrayList<Equipo> equiposAsociados) {
        if (listaEquipos == null) {
            listaEquipos = new ArrayList();
        }
        for (int i = 0; i < equiposAsociados.size(); i++) {
            listaEquipos.add(equiposAsociados.get(i));
        }
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombreGrupo() {
        return nombreGrupo;
    }

    public ArrayList<String> getListaEquipos() {
        ArrayList<String> lista = new ArrayList();
        for (Equipo x:listaEquipos){
            lista.add(x.toString());
        
        }
        return lista;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombreGrupo(String nombreGrupo) {
        this.nombreGrupo = nombreGrupo;
    }

    @Override
    public String toString() {
        return "Grupo{" + "codigo=" + codigo + ", nombreGrupo=" + nombreGrupo + ", listaEquipos=" + getListaEquipos().toString() + '}';
    }
    
    
    
    

}
