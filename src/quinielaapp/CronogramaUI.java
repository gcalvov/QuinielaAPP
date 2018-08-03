/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quinielaapp;

import cl.*;
import java.time.LocalDate;
import javafx.beans.property.SimpleStringProperty;
import javafx.scene.control.TextField;

/**
 *
 * @author Gabriel
 */
public class CronogramaUI {

    private String codigo;
    private String equipo1;
    private String equipo2;
    private TextField golesEquipo1;
    private TextField golesEquipo2;
    private String fecha;
    private String fase;

    public CronogramaUI() {
    }

    public CronogramaUI(String codigo, String equipo1, String equipo2, String fecha, String fase, String golesEquipo1, String golesEquipo2) {
        this.codigo = codigo;
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.fecha = fecha;
        this.fase = fase;
        this.golesEquipo1 = new TextField(golesEquipo1);
        this.golesEquipo2 = new TextField(golesEquipo2);
    }

    public String getCodigo() {
        return codigo;
    }

    public TextField getGolesEquipo1() {
        return golesEquipo1;
    }

    public TextField getGolesEquipo2() {
        return golesEquipo2;
    }

    public String getFecha() {
        return fecha;
    }

    public String getFase() {
        return fase;
    }

    public String getEquipo1() {
        return equipo1;
    }

    public String getEquipo2() {
        return equipo2;
    }

    public void setEquipo1(String equipo1) {
        this.equipo1 = equipo1;
    }

    public void setEquipo2(String equipo2) {
        this.equipo2 = equipo2;
    }

    public void setGolesEquipo1(String golesEquipo1) {
        this.golesEquipo1 = new TextField(golesEquipo1);
    }

    public void setGolesEquipo2(String golesEquipo2) {
        this.golesEquipo2 = new TextField(golesEquipo2);
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setFase(String fase) {
        this.fase = fase;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Partido{" + "equipo1=" + equipo1 + ", equipo2=" + equipo2 + ", golesEquipo1=" + golesEquipo1 + ", golesEquipo2=" + golesEquipo2 + ", fecha=" + fecha + '}';
    }

}
