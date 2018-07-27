/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl;

import java.util.Objects;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author Gabriel
 */
public class Equipo {
    private SimpleStringProperty iso;
    private SimpleStringProperty nombre;
    private SimpleStringProperty rankinFIFA;
    // Bandera;

    public Equipo() {
    }

    public Equipo(String iso, String nombre, String rankinFIFA) {
        this.iso = new SimpleStringProperty(iso);
        this.nombre = new SimpleStringProperty(nombre);
        this.rankinFIFA = new SimpleStringProperty(rankinFIFA);
    }

    public void setIso(String iso) {
        this.iso = new SimpleStringProperty(iso);
    }

    public void setNombre(String nombre) {
        this.nombre = new SimpleStringProperty(nombre);
    }

    public void setRankinFIFA(String rankinFIFA) {
        this.rankinFIFA = new SimpleStringProperty(rankinFIFA);
    }

    public String getIso() {
        return iso.get();
    }

    public String getNombre() {
        return nombre.get();
    }

    public String getRankinFIFA() {
        return rankinFIFA.get();
    }

  
    

    @Override
    public String toString() {
        return "Equipo{" + "iso=" + iso + ", nombre=" + nombre + ", rankinFIFA=" + rankinFIFA + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
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
        final Equipo other = (Equipo) obj;
        if (!Objects.equals(this.iso, other.iso)) {
            return false;
        }
        return true;
    }


    
    
    
    
    
    
    
}
