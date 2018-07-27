/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Gabriel
 */
public class CL {

    public CL() {
    }

    private ArrayList<Equipo> listaEquipos;

    public String setEquipos(Equipo equipoNuevo) {
        if (listaEquipos == null) {
            listaEquipos = new ArrayList();
            Equipo nuevoEquipo1 = new Equipo("DEU", "Alemania", 1);
            Equipo nuevoEquipo2 = new Equipo("BRA", "Brasil", 2);
            Equipo nuevoEquipo3 = new Equipo("BEL", "Bélgica", 3);
            Equipo nuevoEquipo4 = new Equipo("DOM", "Portugal", 4);
            Equipo nuevoEquipo5 = new Equipo("ARG", "Argentina", 5);
            Equipo nuevoEquipo6 = new Equipo("CHE", "Suiza", 6);
            Equipo nuevoEquipo7 = new Equipo("FRA", "Francia", 7);
            Equipo nuevoEquipo8 = new Equipo("DOM", "Polonia", 8);
            Equipo nuevoEquipo9 = new Equipo("CHL", "Chile", 9);
            Equipo nuevoEquipo10 = new Equipo("ESP", "España", 10);
            Equipo nuevoEquipo11 = new Equipo("DOM", "Perú", 11);
            Equipo nuevoEquipo12 = new Equipo("DNK", "Dinamarca", 12);
            Equipo nuevoEquipo13 = new Equipo("IDN", "Inglaterra", 12);
            Equipo nuevoEquipo14 = new Equipo("VAT", "Uruguay", 14);
            Equipo nuevoEquipo15 = new Equipo("DOM", "México", 15);
            Equipo nuevoEquipo16 = new Equipo("COL", "Colombia", 16);
            Equipo nuevoEquipo17 = new Equipo("DOM", "Países Bajos", 17);
            Equipo nuevoEquipo18 = new Equipo("GAB", "Gales", 18);
            Equipo nuevoEquipo19 = new Equipo("HMD", "Italia", 19);
            Equipo nuevoEquipo20 = new Equipo("HRV", "Croacia", 20);
            Equipo nuevoEquipo21 = new Equipo("TUN", "Túnez", 21);
            Equipo nuevoEquipo22 = new Equipo("ISL", "Islandia", 22);
            Equipo nuevoEquipo23 = new Equipo("KOR", "Costa Rica", 23);
            Equipo nuevoEquipo24 = new Equipo("SWE", "Suecia", 24);
            Equipo nuevoEquipo25 = new Equipo("ECU", "EEUU", 25);
            Equipo nuevoEquipo26 = new Equipo("AUT", "Austria", 26);
            Equipo nuevoEquipo27 = new Equipo("SEN", "Senegal", 27);
            Equipo nuevoEquipo28 = new Equipo("SVK", "Eslovaquia", 28);
            Equipo nuevoEquipo29 = new Equipo("BVT", "Irlanda del Norte", 29);
            Equipo nuevoEquipo30 = new Equipo("ROU", "Rumanía", 30);
            Equipo nuevoEquipo31 = new Equipo("DOM", "República de Irlanda", 31);
            Equipo nuevoEquipo32 = new Equipo("DOM", "Paraguay", 32);
            Equipo nuevoEquipo33 = new Equipo("VAT", "Venezuela", 33);
            Equipo nuevoEquipo34 = new Equipo("SRB", "Serbia", 34);
            Equipo nuevoEquipo35 = new Equipo("VAT", "Ucrania", 35);
            Equipo nuevoEquipo36 = new Equipo("AUS", "Australia", 36);
            Equipo nuevoEquipo37 = new Equipo("REU", "RI de Irán", 37);
            Equipo nuevoEquipo38 = new Equipo("VAT", "Turquía", 38);
            Equipo nuevoEquipo39 = new Equipo("DOM", "RD del Congo", 38);
            Equipo nuevoEquipo40 = new Equipo("BIH", "Bosnia y Herzegovina", 40);
            Equipo nuevoEquipo41 = new Equipo("DOM", "Marruecos", 41);
            Equipo nuevoEquipo42 = new Equipo("ERI", "Escocia", 42);
            Equipo nuevoEquipo43 = new Equipo("DOM", "Montenegro", 43);
            Equipo nuevoEquipo44 = new Equipo("GRC", "Grecia", 44);
            Equipo nuevoEquipo45 = new Equipo("EGY", "Egipto", 45);
            Equipo nuevoEquipo46 = new Equipo("DOM", "República Checa", 46);
            Equipo nuevoEquipo47 = new Equipo("GHA", "Ghana", 47);
            Equipo nuevoEquipo48 = new Equipo("DOM", "Nigeria", 48);
            Equipo nuevoEquipo49 = new Equipo("BGR", "Bulgaria", 49);
            Equipo nuevoEquipo50 = new Equipo("CMR", "Camerún", 49);
            Equipo nuevoEquipo51 = new Equipo("HUN", "Hungría", 51);
            Equipo nuevoEquipo52 = new Equipo("BFA", "Burkina Faso", 52);
            Equipo nuevoEquipo53 = new Equipo("DOM", "Noruega", 53);
            Equipo nuevoEquipo54 = new Equipo("HMD", "Jamaica", 54);
            Equipo nuevoEquipo55 = new Equipo("DOM", "Panamá", 55);
            Equipo nuevoEquipo56 = new Equipo("SVN", "Eslovenia", 56);
            Equipo nuevoEquipo57 = new Equipo("DOM", "República de Corea", 57);
            Equipo nuevoEquipo58 = new Equipo("ALB", "Albania", 58);
            Equipo nuevoEquipo59 = new Equipo("BLR", "Bolivia", 59);
            Equipo nuevoEquipo60 = new Equipo("ECU", "Ecuador", 60);
            Equipo nuevoEquipo61 = new Equipo("HMD", "Japón", 61);
            Equipo nuevoEquipo62 = new Equipo("HND", "Honduras", 62);
            Equipo nuevoEquipo63 = new Equipo("FIN", "Finlandia", 63);
            Equipo nuevoEquipo64 = new Equipo("DOM", "Mali", 64);
            Equipo nuevoEquipo65 = new Equipo("CPV", "Cabo Verde", 65);
            Equipo nuevoEquipo66 = new Equipo("DZA", "Argelia", 66);
            Equipo nuevoEquipo67 = new Equipo("ATG", "Arabia Saudí", 67);
            Equipo nuevoEquipo68 = new Equipo("KOR", "Costa de Marfil", 68);
            Equipo nuevoEquipo69 = new Equipo("GIN", "Guinea", 68);
            Equipo nuevoEquipo70 = new Equipo("ROU", "Rusia", 70);
            Equipo nuevoEquipo71 = new Equipo("ABW", "ARY de Macedonia", 71);
            Equipo nuevoEquipo72 = new Equipo("SLV", "El Salvador", 72);
            Equipo nuevoEquipo73 = new Equipo("SYR", "Siria", 73);
            Equipo nuevoEquipo74 = new Equipo("LKA", "Sudáfrica", 74);
            Equipo nuevoEquipo75 = new Equipo("REU", "RP China", 75);
            Equipo nuevoEquipo76 = new Equipo("ZMB", "Zambia", 76);
            Equipo nuevoEquipo77 = new Equipo("SLV", "Emiratos Árabes Unidos", 77);
            Equipo nuevoEquipo78 = new Equipo("BLR", "Bielorrusia", 78);
            Equipo nuevoEquipo79 = new Equipo("DOM", "Líbano", 79);
            Equipo nuevoEquipo80 = new Equipo("CAN", "Canadá", 79);
            Equipo nuevoEquipo81 = new Equipo("CUW", "Curazao", 81);
            Equipo nuevoEquipo82 = new Equipo("VAT", "Uganda", 82);
            Equipo nuevoEquipo83 = new Equipo("COM", "Congo", 83);
            Equipo nuevoEquipo84 = new Equipo("DOM", "Omán", 84);
            Equipo nuevoEquipo85 = new Equipo("GAB", "Gabón", 85);
            Equipo nuevoEquipo86 = new Equipo("DOM", "Luxemburgo", 85);
            Equipo nuevoEquipo87 = new Equipo("CYP", "Chipre", 87);
            Equipo nuevoEquipo88 = new Equipo("BEN", "Benín", 88);
            Equipo nuevoEquipo89 = new Equipo("IDN", "Irak", 89);
            Equipo nuevoEquipo90 = new Equipo("HMD", "Islas Feroe", 90);
            Equipo nuevoEquipo91 = new Equipo("TTO", "Trinidad y Tobago", 91);
            Equipo nuevoEquipo92 = new Equipo("DOM", "República Kirguisa", 92);
            Equipo nuevoEquipo93 = new Equipo("HMD", "Israel", 93);
            Equipo nuevoEquipo94 = new Equipo("EST", "Estonia", 94);
            Equipo nuevoEquipo95 = new Equipo("VAT", "Uzbekistán", 95);
            Equipo nuevoEquipo96 = new Equipo("GEO", "Georgia", 96);
            Equipo nuevoEquipo97 = new Equipo("IND", "India", 97);
            Equipo nuevoEquipo98 = new Equipo("DOM", "Qatar", 98);
            Equipo nuevoEquipo99 = new Equipo("DOM", "Palestina", 99);
            Equipo nuevoEquipo100 = new Equipo("ARM", "Armenia", 100);

        }

        boolean registrar = true;
        String log = "";
        for (Equipo x : listaEquipos) {
            if (x.equals(equipoNuevo)) {
                log = "El equipo ya se encuentra registrado";
                registrar = false;
            }
        }
        if (registrar) {
            listaEquipos.add(equipoNuevo);
        }
        return log;
    }

    public String[] listarEquipos() {

        String[] miLista;

        int tamanho = listaEquipos.size();
        int i = 0;

        miLista = new String[tamanho];

        for (Equipo dato : listaEquipos) {
            miLista[i] = dato.getNombre();
            i++;
        }
        return miLista;
    }

    public ArrayList<String> getLista(String pfile) throws IOException {
        ArrayList<String> data = new ArrayList<>();
        try {
            File path = new File(pfile);
            FileReader reader = new FileReader(path);
            BufferedReader buffer = new BufferedReader(reader);
            String datos;
            while ((datos = buffer.readLine()) != null) {
                data.add(datos);
            }
            reader.close();
            return data;

        } catch (IOException e) {
            throw e;
        }

    }

    public void setOnFile(String dato, String pfile) {
        try {
            File path = new File(pfile);
            FileWriter output = new FileWriter(path, true);
            BufferedWriter writer = new BufferedWriter(output);

            writer.write(dato);
            writer.newLine();
            writer.close();

        } catch (Exception e) {
            e.getStackTrace();
        }

    }

    public void refreshFile(ArrayList<String> list, String pfile) {
        try {
            File path = new File(pfile);
            FileWriter output = new FileWriter(path, false);
            BufferedWriter writer = new BufferedWriter(output);
            for (String x : list) {
                writer.write(x);
                writer.newLine();
            }
            writer.close();

        } catch (Exception e) {
            e.getStackTrace();
        }

    }

    public void deleteFromFile(String search, String pfile) throws IOException {
        ArrayList<String> listaDatos = getLista(pfile);

        for (int i = 0; i < listaDatos.size(); i++) {
            if (listaDatos.get(i).equals(search)) {
                listaDatos.remove(i);
                refreshFile(listaDatos, pfile);

            }
        }
    }

    public boolean buscarFromFile(String pnombre, String pfile) throws IOException {
        boolean encontrado = false;
        ArrayList<String> data = getLista(pfile);
        for (String x : data) {
            if (x.equals(pnombre)) {
                encontrado = true;
            }
        }
        return encontrado;
    }

    public void updateToFile(String search, String update, String pfile) throws IOException {
        ArrayList<String> listaDatos = getLista(pfile);

        for (int i = 0; i < listaDatos.size(); i++) {
            if (listaDatos.get(i).equals(search)) {
                listaDatos.set(i, update);
                refreshFile(listaDatos, pfile);
            }
        }
    }
}