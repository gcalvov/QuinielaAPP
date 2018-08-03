/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Gabriel
 */
public class Mundial {

    private LocalDate fecha;
    private String paisOrganizador;
    private boolean estado;
    private ArrayList<Grupo> listaGrupos;
    private ArrayList<Cronograma> listaPartidos;
    private ArrayList<Liga> listaLigas;

    public Mundial() {
    }

    public Mundial(LocalDate fecha, String paisOrganizador, boolean estado, ArrayList<Grupo> plistaGrupos) {
        this.fecha = fecha;
        this.paisOrganizador = paisOrganizador;
        this.estado = estado;
        this.listaGrupos = plistaGrupos;
    }

    public void setListaPartidos(ArrayList<Cronograma> listaPartidos) {
        if (listaPartidos == null) {
            listaPartidos = new ArrayList();
        }
        this.listaPartidos = listaPartidos;
    }

    public ArrayList<Liga> getListaLigas() {
        if (listaLigas == null) {
            listaLigas = new ArrayList();
        }
        return listaLigas;
    }

    public ArrayList<String> getListaLigasString() {
        if (listaLigas == null) {
            listaLigas = new ArrayList();
        }
        ArrayList<String> lista = new ArrayList();
        for (Liga x : listaLigas) {
            String estatus;
            String activa;
            if (x.isPrivada()) {
                estatus = "liga privada";
            } else {
                estatus = "liga publica";
            }
            if (x.isEstatus()) {
                activa = "activa";
            } else {
                activa = "inactiva";
            }

            lista.add("- " + x.getNombre() + ", " + estatus + ", " + activa);
        }
        return lista;
    }

    public void setListaLigas(Liga pLigaX) {
        if (listaLigas == null) {
            listaLigas = new ArrayList();
        }
        listaLigas.add(pLigaX);
    }

    public LocalDate getAnho() {
        return fecha;
    }

    public String getPaisOrganizador() {
        return paisOrganizador;
    }

    public boolean isEstado() {
        return estado;
    }

    public ArrayList<Grupo> getListaGrupos() {
        return listaGrupos;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void setPaisOrganizador(String paisOrganizador) {
        this.paisOrganizador = paisOrganizador;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void anhadirGrupo(Grupo grupoX) {
        if (listaGrupos == null) {
            listaGrupos = new ArrayList();
        }
        listaGrupos.add(grupoX);

    }

    public ArrayList<Cronograma> getCronograma() {
        return listaPartidos;
    }

    public ArrayList<String> getListaPartidos() {
        ArrayList<String> lista = new ArrayList();
        for (Cronograma x : listaPartidos) {
            lista.add(x.getEquipo1().getNombre() + " - " + x.getEquipo2().getNombre() + "/" + x.getFecha().toString());
        }
        return lista;
    }

    public ArrayList<String> getListaPartidosCompleto() {
        ArrayList<String> lista = new ArrayList();
        for (Cronograma x : listaPartidos) {
            lista.add(x.getCodigo()+")"+x.getEquipo1().getNombre() + " - " + x.getEquipo2().getNombre() + "/" + x.getFecha().toString()+",fase:"+x.getFase());
        }
        return lista;
    }

    @Override
    public String toString() {
        return "Mundial{" + "fecha=" + fecha + ", paisOrganizador=" + paisOrganizador + ", estado=" + estado + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Mundial other = (Mundial) obj;
        if (!Objects.equals(this.paisOrganizador, other.paisOrganizador)) {
            return false;
        }
        return true;
    }

}
