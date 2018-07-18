/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestores;

import cl.*;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Gabriel
 */
public class GestorMundiales extends Gestor {

    public void setMundial(int anho, String paisOrganizador, boolean estado,
            String pg1, String pg2, String pg3, String pg4, String pg5,
            String pg6, String pg7, String pg8) {
        Grupo grupoA = new Grupo();
        grupoA.setCodigo(pg1);
        Grupo grupoB = new Grupo();
        grupoB.setCodigo(pg2);
        Grupo grupoC = new Grupo();
        grupoC.setCodigo(pg3);
        Grupo grupoD = new Grupo();
        grupoD.setCodigo(pg4);
        Grupo grupoE = new Grupo();
        grupoE.setCodigo(pg5);
        Grupo grupoF = new Grupo();
        grupoF.setCodigo(pg6);
        Grupo grupoG = new Grupo();
        grupoG.setCodigo(pg7);
        Grupo grupoH = new Grupo();
        grupoH.setCodigo(pg8);

        ArrayList<Grupo> gruposMundial = new ArrayList();

        gruposMundial.add(grupoA);
        gruposMundial.add(grupoB);
        gruposMundial.add(grupoC);
        gruposMundial.add(grupoD);
        gruposMundial.add(grupoE);
        gruposMundial.add(grupoF);
        gruposMundial.add(grupoG);
        gruposMundial.add(grupoH);

        Mundial mundialX = new Mundial(anho, paisOrganizador, estado, gruposMundial);

        cl.setOnFile(mundialX.toString(), "mundiales.txt");

    }

    public ArrayList<String> getMundial() throws IOException {
        return cl.getLista("mundiales.txt");
    }

}
