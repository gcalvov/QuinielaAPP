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
import java.time.LocalDate;
import java.util.ArrayList;

//de momento estoy haciendo que se generen de manera aleatoria los equipos.
import java.util.Random;

/**
 *
 * @author Gabriel
 */
public class CL {

    public CL() {
    }

    private ArrayList<Equipo> listaEquipos;
    private ArrayList<Mundial> listaMundiales;
    private ArrayList<Usuario> listaUsuarios;
    final int cantGruposMundial = 8;
    final int cantEquiposGrupo = 4;

    public String setEquipos(Equipo equipoNuevo) {
        if (listaEquipos == null) {
            listaEquipos = new ArrayList();
            equiposIniciales();
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
            log = "Registro exitoso";
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

    public ArrayList<Equipo> getListaEquipos() {
        if (listaEquipos == null) {
            listaEquipos = new ArrayList();
            equiposIniciales();
        }
        return listaEquipos;
    }

    public void equiposIniciales() {
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
        Equipo nuevoEquipo23 = new Equipo("CRI", "Costa Rica", 23);
        Equipo nuevoEquipo24 = new Equipo("SWE", "Suecia", 24);
        Equipo nuevoEquipo25 = new Equipo("ECU", "EEUU", 25);
        Equipo nuevoEquipo26 = new Equipo("AUT", "Austria", 26);
        Equipo nuevoEquipo27 = new Equipo("SEN", "Senegal", 27);
        Equipo nuevoEquipo28 = new Equipo("SVK", "Eslovaquia", 28);
        Equipo nuevoEquipo29 = new Equipo("BVT", "Irlanda del Norte", 29);
        Equipo nuevoEquipo30 = new Equipo("ROU", "Rumanía", 30);
        Equipo nuevoEquipo31 = new Equipo("DOM", "República de Irlanda", 31);
        Equipo nuevoEquipo32 = new Equipo("PAR", "Paraguay", 32);
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

        listaEquipos.add(nuevoEquipo1);
        listaEquipos.add(nuevoEquipo2);
        listaEquipos.add(nuevoEquipo3);
        listaEquipos.add(nuevoEquipo4);
        listaEquipos.add(nuevoEquipo5);
        listaEquipos.add(nuevoEquipo6);
        listaEquipos.add(nuevoEquipo7);
        listaEquipos.add(nuevoEquipo8);
        listaEquipos.add(nuevoEquipo9);
        listaEquipos.add(nuevoEquipo10);
        listaEquipos.add(nuevoEquipo11);
        listaEquipos.add(nuevoEquipo12);
        listaEquipos.add(nuevoEquipo13);
        listaEquipos.add(nuevoEquipo14);
        listaEquipos.add(nuevoEquipo15);
        listaEquipos.add(nuevoEquipo16);
        listaEquipos.add(nuevoEquipo17);
        listaEquipos.add(nuevoEquipo18);
        listaEquipos.add(nuevoEquipo19);
        listaEquipos.add(nuevoEquipo20);
        listaEquipos.add(nuevoEquipo21);
        listaEquipos.add(nuevoEquipo22);
        listaEquipos.add(nuevoEquipo23);
        listaEquipos.add(nuevoEquipo24);
        listaEquipos.add(nuevoEquipo25);
        listaEquipos.add(nuevoEquipo26);
        listaEquipos.add(nuevoEquipo27);
        listaEquipos.add(nuevoEquipo28);
        listaEquipos.add(nuevoEquipo29);
        listaEquipos.add(nuevoEquipo30);
        listaEquipos.add(nuevoEquipo31);
        listaEquipos.add(nuevoEquipo32);
        listaEquipos.add(nuevoEquipo33);
        listaEquipos.add(nuevoEquipo34);
        listaEquipos.add(nuevoEquipo35);
        listaEquipos.add(nuevoEquipo36);
        listaEquipos.add(nuevoEquipo37);
        listaEquipos.add(nuevoEquipo38);
        listaEquipos.add(nuevoEquipo39);
        listaEquipos.add(nuevoEquipo40);
        listaEquipos.add(nuevoEquipo41);
        listaEquipos.add(nuevoEquipo42);
        listaEquipos.add(nuevoEquipo43);
        listaEquipos.add(nuevoEquipo44);
        listaEquipos.add(nuevoEquipo45);
        listaEquipos.add(nuevoEquipo46);
        listaEquipos.add(nuevoEquipo47);
        listaEquipos.add(nuevoEquipo48);
        listaEquipos.add(nuevoEquipo49);
        listaEquipos.add(nuevoEquipo50);
        listaEquipos.add(nuevoEquipo51);
        listaEquipos.add(nuevoEquipo52);
        listaEquipos.add(nuevoEquipo53);
        listaEquipos.add(nuevoEquipo54);
        listaEquipos.add(nuevoEquipo55);
        listaEquipos.add(nuevoEquipo56);
        listaEquipos.add(nuevoEquipo57);
        listaEquipos.add(nuevoEquipo58);
        listaEquipos.add(nuevoEquipo59);
        listaEquipos.add(nuevoEquipo60);
        listaEquipos.add(nuevoEquipo61);
        listaEquipos.add(nuevoEquipo62);
        listaEquipos.add(nuevoEquipo63);
        listaEquipos.add(nuevoEquipo64);
        listaEquipos.add(nuevoEquipo65);
        listaEquipos.add(nuevoEquipo66);
        listaEquipos.add(nuevoEquipo67);
        listaEquipos.add(nuevoEquipo68);
        listaEquipos.add(nuevoEquipo69);
        listaEquipos.add(nuevoEquipo70);
        listaEquipos.add(nuevoEquipo71);
        listaEquipos.add(nuevoEquipo72);
        listaEquipos.add(nuevoEquipo73);
        listaEquipos.add(nuevoEquipo74);
        listaEquipos.add(nuevoEquipo75);
        listaEquipos.add(nuevoEquipo76);
        listaEquipos.add(nuevoEquipo77);
        listaEquipos.add(nuevoEquipo78);
        listaEquipos.add(nuevoEquipo79);
        listaEquipos.add(nuevoEquipo80);
        listaEquipos.add(nuevoEquipo81);
        listaEquipos.add(nuevoEquipo82);
        listaEquipos.add(nuevoEquipo83);
        listaEquipos.add(nuevoEquipo84);
        listaEquipos.add(nuevoEquipo85);
        listaEquipos.add(nuevoEquipo86);
        listaEquipos.add(nuevoEquipo87);
        listaEquipos.add(nuevoEquipo88);
        listaEquipos.add(nuevoEquipo89);
        listaEquipos.add(nuevoEquipo90);
        listaEquipos.add(nuevoEquipo91);
        listaEquipos.add(nuevoEquipo92);
        listaEquipos.add(nuevoEquipo93);
        listaEquipos.add(nuevoEquipo94);
        listaEquipos.add(nuevoEquipo95);
        listaEquipos.add(nuevoEquipo96);
        listaEquipos.add(nuevoEquipo97);
        listaEquipos.add(nuevoEquipo98);
        listaEquipos.add(nuevoEquipo99);
        listaEquipos.add(nuevoEquipo100);
    }

    public void registrarMundialRandom(LocalDate fecha, String pais, boolean estado) {

        //Carga los grupos de momento ya que no tenemos base de datos.
        if (listaEquipos == null) {
            listaEquipos = new ArrayList();
            equiposIniciales();
        }

        if (listaMundiales == null) {
            listaMundiales = new ArrayList();
        }

        //  generea un numero random para anhadir equipos aleatoriamente.
        Random rand = new Random();

        //almacena los equipos de un mundial
        ArrayList<Equipo> equiposMundial = new ArrayList();
        ArrayList<Grupo> gruposMundial = new ArrayList();

        int counter = 0;
        boolean registrar = true;
        while (counter < (cantGruposMundial * cantEquiposGrupo)) {
            registrar = true;
            Equipo equipoMas = listaEquipos.get(rand.nextInt(listaEquipos.size()));
            for (int i = 0; i < equiposMundial.size(); i++) {
                if (equiposMundial.get(i).equals(equipoMas)) {
                    registrar = false;
                }
            }
            if (registrar) {
                equiposMundial.add(equipoMas);
                counter++;
            }
        }

        for (int i = 0; i < cantGruposMundial; i++) {
            String codigo = "COD " + String.valueOf((char) (i + 65));
            String nombre = String.valueOf((char) (i + 65));
            ArrayList<Equipo> equiposGrupo = new ArrayList();
            Equipo equipo1 = equiposMundial.get(i * cantEquiposGrupo);
            Equipo equipo2 = equiposMundial.get(i * cantEquiposGrupo + 1);
            Equipo equipo3 = equiposMundial.get(i * cantEquiposGrupo + 2);
            Equipo equipo4 = equiposMundial.get(i * cantEquiposGrupo + 3);
            equiposGrupo.add(equipo1);
            equiposGrupo.add(equipo2);
            equiposGrupo.add(equipo3);
            equiposGrupo.add(equipo4);

            Grupo grupoX = new Grupo(codigo, nombre, equiposGrupo);
            gruposMundial.add(grupoX);
        }

        Mundial mundialRandom = new Mundial(fecha, pais, estado, gruposMundial);

        listaMundiales.add(mundialRandom);

    }

    public void setMundial(Mundial mundialNuevo) {
        if (listaMundiales == null) {
            listaMundiales = new ArrayList();
        }
        listaMundiales.add(mundialNuevo);
    }

    public ArrayList<Mundial> getListaMundiales() {
        if (listaMundiales == null) {
            listaMundiales = new ArrayList();
        }
        return listaMundiales;
    }

    public ArrayList<String> listarEquiposMundial() {

        ArrayList<String> informacionMundial = new ArrayList();

        for (Mundial dato : listaMundiales) {
            informacionMundial.add("Año: " + dato.getAnho() + ", Mundial: " + dato.getPaisOrganizador());
            for (Grupo x : dato.getListaGrupos()) {
                informacionMundial.add("Grupo " + x.getNombreGrupo() + "\n" + x.getListaEquiposAsociados());
            }

        }
        return informacionMundial;
    }

    public ArrayList<String> listarCronogramaMundial(String pais) {
        ArrayList<String> cronogramaMundial = new ArrayList();

        for (Mundial dato : listaMundiales) {
            if (dato.getPaisOrganizador().equals(pais)) {
                cronogramaMundial = dato.getListaPartidos();
            }
        }
        return cronogramaMundial;
    }

    public void setUsuario(Usuario usuarioX) {
        if (listaUsuarios == null) {
            listaUsuariosIniciales();
        }
        listaUsuarios.add(usuarioX);
    }

    public ArrayList<Usuario> getUsuarios() {
        if (listaUsuarios == null) {
            listaUsuariosIniciales();
        }
        return listaUsuarios;
    }

    public void listaUsuariosIniciales() {
        if (listaUsuarios == null) {
            listaUsuarios = new ArrayList();
        }

        Usuario usuario1 = new Usuario("admin@gmail.com", "123", "admin", "Admin", "N/A", "N/A", "N/A");
        Usuario usuario2 = new Usuario("gcalvo@gmail.com", "123", "usuario", "Gabriel", "Calvo", "Gato101", "gcalvo88");
        Usuario usuario3 = new Usuario("leyla@gmail.com", "123", "usuario", "Leyla", "Castro", "Leylinha", "LeylaCR");
        Usuario usuario4 = new Usuario("Juan@gmail.com", "123", "usuario", "Juan", "Perez", "Juancho100", "JuanitoPerez");
        Usuario usuario5 = new Usuario("lvargas@gmail.com", "123", "usuario", "Lorena", "Vargas", "laDiosa", "lore1987");
        Usuario usuario6 = new Usuario("pedro@gmail.com", "123", "usuario", "Pedro", "Picapiedra", "picaPica", "Pica2000");

        listaUsuarios.add(usuario1);
        listaUsuarios.add(usuario2);
        listaUsuarios.add(usuario3);
        listaUsuarios.add(usuario4);
        listaUsuarios.add(usuario5);

    }

    public boolean verificarExistenciaUsuario(String correo) {
        if (listaUsuarios == null) {
            listaUsuariosIniciales();
        }

        boolean encontrado = false;

        for (Usuario x : listaUsuarios) {
            if (x.getCorreo().equals(correo)) {
                encontrado = true;
            }
        }
        return encontrado;
    }

    public boolean darAccesoUsuario(String correo, String contrasenha) {
        if (listaUsuarios == null) {
            listaUsuariosIniciales();
        }

        boolean acceso = false;

        for (Usuario x : listaUsuarios) {
            if (x.getCorreo().equals(correo) && x.getContrasenha().equals(contrasenha)) {
                acceso = true;
            }
        }
        return acceso;
    }
}
