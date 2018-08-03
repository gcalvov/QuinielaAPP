/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestores;

import cl.*;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Gabriel
 */
public class GestorMundiales extends Gestor {

    public void setMundial(LocalDate fecha, String paisOrganizador, boolean estado) {

        ArrayList<Grupo> gruposMundial = new ArrayList();

        Mundial mundialX = new Mundial(fecha, paisOrganizador, estado, gruposMundial);

        cl.setMundial(mundialX);

        //Prueba
        System.out.println("Registro Exitoso!");
        System.out.println(mundialX.toString());
    }


    public ArrayList<String> listarMundiales() {
        ArrayList<String> mundiales = new ArrayList();
        ArrayList<Mundial> listaMundiales = cl.getListaMundiales();
        if (listaMundiales.isEmpty()) {
            mundiales.add("No hay mundiales");
        } else {
            for (Mundial x : listaMundiales) {
                mundiales.add(x.getPaisOrganizador());
            }
        }

        return mundiales;
    }
    

}
