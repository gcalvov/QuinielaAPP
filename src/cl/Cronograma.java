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
public class Cronograma {

    private int codigo;
    private Equipo equipo1;
    private Equipo equipo2;
    private int golesEquipo1;
    private int golesEquipo2;
    private LocalDate fecha;
    private String fase;

    public Cronograma() {
    }

    public Cronograma(Equipo equipo1, Equipo equipo2) {
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
    }

    public Cronograma(int codigo, Equipo equipo1, Equipo equipo2, LocalDate fecha, String fase) {
        this.codigo = codigo;
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.fecha = fecha;
        this.fase = fase;
    }

    public int getCodigo() {
        return codigo;
    }

    
    public String getFase() {
        return fase;
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

    public void setFase(String fase) {
        this.fase = fase;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    

    @Override
    public String toString() {
        return "Partido{" + "equipo1=" + equipo1 + ", equipo2=" + equipo2 + ", golesEquipo1=" + golesEquipo1 + ", golesEquipo2=" + golesEquipo2 + ", fecha=" + fecha + '}';
    }
    
    

}
