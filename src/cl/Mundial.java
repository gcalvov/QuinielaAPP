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
public class Mundial {
    private int anho;
    private String paisOrganizador;
    private boolean estado; 
    private ArrayList<Grupo> listaGrupos;
    

    public Mundial() {
    }

    public Mundial(int anho, String paisOrganizador, boolean estado, ArrayList<Grupo> listaGrupos) {
        this.anho = anho;
        this.paisOrganizador = paisOrganizador;
        this.estado = estado;
        this.listaGrupos = listaGrupos;
    }



    public int getAnho() {
        return anho;
    }

    public String getPaisOrganizador() {
        return paisOrganizador;
    }

    public boolean isEstado() {
        return estado;
    }

    public ArrayList<String> getListaGrupos() {
        ArrayList<String> lista = new ArrayList();
        for (Grupo x:listaGrupos){
            lista.add(x.toString());
        
        }
        return lista;
    }
    

    public void setAnho(int anho) {
        this.anho = anho;
    }

    public void setPaisOrganizador(String paisOrganizador) {
        this.paisOrganizador = paisOrganizador;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void setListaGrupos(ArrayList<Grupo> listaGrupos) {
        if (listaGrupos == null) {
            listaGrupos = new ArrayList();
        }
        for (int i = 0; i < listaGrupos.size(); i++) {
            listaGrupos.add(listaGrupos.get(i));
        }
    }
    
    
    @Override
    public String toString() {
        return "Mundial{" + "anho=" + anho + ", paisOrganizador=" + paisOrganizador + ", estado=" + estado + '}';
    }

    
    
}
