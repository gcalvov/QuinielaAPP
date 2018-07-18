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
