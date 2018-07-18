/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl;

/**
 *
 * @author Gabriel
 */
public class Equipo {
    private String iso;
    private String nombre;
    private int rankinFIFA;
    // Bandera;

    public Equipo() {
    }

    public Equipo(String iso, String nombre, int rankinFIFA) {
        this.iso = iso;
        this.nombre = nombre;
        this.rankinFIFA = rankinFIFA;
    }

    public String getIso() {
        return iso;
    }

    public String getNombre() {
        return nombre;
    }

    public int getRankinFIFA() {
        return rankinFIFA;
    }

    public void setIso(String iso) {
        this.iso = iso;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRankinFIFA(int rankinFIFA) {
        this.rankinFIFA = rankinFIFA;
    }

    @Override
    public String toString() {
        return "Equipo{" + "iso=" + iso + ", nombre=" + nombre + ", rankinFIFA=" + rankinFIFA + '}';
    }
    
    
    
    
    
}
