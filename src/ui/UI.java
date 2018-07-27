/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import gestores.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;

/**
 *
 * @author Gabriel
 */
public class UI {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;

    public static void main(String[] args) throws IOException {
        // Este metodo inicia el programa, genera el menu principal

        int opc;
        boolean noSalir = true;

        do {
            mostrarMenu();
            opc = leerOpcion();
            noSalir = ejecutarAccion(opc);
        } while (noSalir);

    }

    static void mostrarMenu() {

        out.println();
        out.println("1.  Registro de equipos");
        out.println("2.  Lista de equipos");
        out.println("3.  Registro de grupo");
        out.println("4.  Listar grupos");
        out.println("5.  Registro de mundial");
        out.println("6.  Lista de mundiales");
        out.println("0.  Salir");
        out.println();

    }

    static int leerOpcion() throws java.io.IOException {

        int opcion;

        out.print("Seleccione su opcion: ");
        opcion = Integer.parseInt(in.readLine());
        out.println();

        return opcion;
    }

    static boolean ejecutarAccion(int popcion) throws java.io.IOException {

        boolean noSalir = true;

        switch (popcion) {
            case 1:
                registrarEquipo();
                break;

            case 2:
                listarEquipos();
                break;
            case 3:
                registrarGrupo();
                break;

            case 4:
                listarGrupos();
                break;

            case 5:
                registrarMundiales();
                break;

            case 6:
                listarMundiales();
                break;

            case 0:
                noSalir = false;
                break;

            default:
                out.println("************************");
                out.println("Opcion invalida");
                out.println("************************");
                out.println();
                break;
        }
        return noSalir;
    }

    public static void registrarEquipo() throws IOException {
        String iso;
        String nombre;
        int rankinFIFA;
        String log = "";

        out.println("Ingrese el codigo iso del equipo:");
        iso = in.readLine();
        out.println("Ingrese el nombre del equipo:");
        nombre = in.readLine();
        out.println("Ingrese el rankinFIFA del equipo:");
        rankinFIFA = Integer.parseInt(in.readLine());

        GestorEquipos miGestor = new GestorEquipos();
        log = miGestor.registrarEquipos(iso, nombre, rankinFIFA);

        out.println(log);

    }

    public static void listarEquipos() {
        GestorEquipos miGestor = new GestorEquipos();

        out.println();
        out.println("*****************");
        out.println("Lista de registros");
        out.println("*****************");
        for (String dato : miGestor.listarEquipos()) {
            out.println("-  " + dato);
        }
        out.println("*****************");
        out.println();

    }

    public static void registrarGrupo() throws IOException {
        String codigo;
        String nombre;
        String equipo1, equipo2, equipo3, equipo4;

        out.println("Ingrese el código del grupo:");
        codigo = in.readLine();

        out.println("Ingrese el nombre del grupo:");
        nombre = in.readLine();

        out.println("Ingrese el nombre del equipo 1:");
        equipo1 = in.readLine();
        out.println("Ingrese el nombre del equipo 2:");
        equipo2 = in.readLine();
        out.println("Ingrese el nombre del equipo 3:");
        equipo3 = in.readLine();
        out.println("Ingrese el nombre del equipo 4:");
        equipo4 = in.readLine();

        GestorGrupos miGestor = new GestorGrupos();
        miGestor.setGrupo(codigo, nombre, equipo1, equipo2, equipo3, equipo4);

    }

    public static void listarGrupos() throws IOException {
        GestorGrupos miGestor = new GestorGrupos();
        ArrayList<String> data = miGestor.getGrupo();

        for (String dato : data) {
            out.println(dato);
        }

    }

    public static void registrarMundial() throws IOException {
        int anho;
        String paisOrganizador;
        boolean estado;
        String codGA, codGB, codGC, codGD, codGE, codGF, codGG, codGH;

        out.println("Ingrese el año del mundial:");
        anho = Integer.parseInt(in.readLine());

        out.println("Ingrese el nombre del pais Anfitrion:");
        paisOrganizador = in.readLine();

        out.println("Ingrese el nombre del grupo A:");
        codGA = in.readLine();
        out.println("Ingrese el nombre del grupo B:");
        codGB = in.readLine();
        out.println("Ingrese el nombre del grupo C:");
        codGC = in.readLine();
        out.println("Ingrese el nombre del grupo D:");
        codGD = in.readLine();
        out.println("Ingrese el nombre del grupo E:");
        codGE = in.readLine();
        out.println("Ingrese el nombre del grupo F:");
        codGF = in.readLine();
        out.println("Ingrese el nombre del grupo G:");
        codGG = in.readLine();
        out.println("Ingrese el nombre del grupo H:");
        codGH = in.readLine();

        GestorMundiales miGestor = new GestorMundiales();
        miGestor.setMundial(anho, paisOrganizador, true, codGH, codGH, codGH, codGH, codGH, codGH, codGH, codGH);

    }

    public static void listarMundiales() throws IOException {
        GestorMundiales miGestor = new GestorMundiales();
        ArrayList<String> data = miGestor.getMundial();

        for (String dato : data) {
            out.println(dato);
        }

    }


    private static void registrarMundiales() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
