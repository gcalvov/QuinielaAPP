/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl;

import java.time.LocalDate;

/**
 *
 * @author Gabriel
 */
public class Partido {

    private Equipo equipo1;
    private Equipo equipo2;
    private int golesEquipo1;
    private int golesEquipo2;
    private LocalDate fecha;

    public Partido() {
    }

    public Partido(Equipo equipo1, Equipo equipo2) {
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
    }

    public Partido(Equipo equipo1, Equipo equipo2, LocalDate fecha) {
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.fecha = fecha;
    }

    public Equipo getEquipo1() {
        return equipo1;
    }

    public Equipo getEquipo2() {
        return equipo2;
    }

    public int getGolesEquipo1() {
        return golesEquipo1;
    }

    public int getGolesEquipo2() {
        return golesEquipo2;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setEquipo1(Equipo equipo1) {
        this.equipo1 = equipo1;
    }

    public void setEquipo2(Equipo equipo2) {
        this.equipo2 = equipo2;
    }

    public void setGolesEquipo1(int golesEquipo1) {
        this.golesEquipo1 = golesEquipo1;
    }

    public void setGolesEquipo2(int golesEquipo2) {
        this.golesEquipo2 = golesEquipo2;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Partido{" + "equipo1=" + equipo1 + ", equipo2=" + equipo2 + ", golesEquipo1=" + golesEquipo1 + ", golesEquipo2=" + golesEquipo2 + ", fecha=" + fecha + '}';
    }

}
