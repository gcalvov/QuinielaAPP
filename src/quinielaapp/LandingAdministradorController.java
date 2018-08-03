/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quinielaapp;

import cl.*;
import gestores.*;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellEditEvent;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Gabriel
 */
public class LandingAdministradorController implements Initializable {

    //Aqui defino el tableViewEquipos para los equipos
    @FXML
    private TableView<Equipo> tableViewEquipos;
    @FXML
    private TableColumn<Equipo, String> isoColumn;
    @FXML
    private TableColumn<Equipo, String> nombreColumn;
    @FXML
    private TableColumn<Equipo, String> rankingColumn;

    //Aqui defino el tableViewCronomgrama para setear resultados
    @FXML
    private TableView<CronogramaUI> tableViewCronograma;
    @FXML
    private TableColumn<CronogramaUI, String> columnaEquipo1;
    @FXML
    private TableColumn<CronogramaUI, String> columnaEquipo2;
    @FXML
    private TableColumn<CronogramaUI, String> columnaFecha;
    @FXML
    private TableColumn<CronogramaUI, String> columnaFase;
    @FXML
    private TableColumn<CronogramaUI, TextField> columnaGoles1;
    @FXML
    private TableColumn<CronogramaUI, TextField> columnaGoles2;

    // Aqui defino los botones
    @FXML
    private Button btnSalir;

    @FXML
    private Button btnActualizar;

    @FXML
    private Button btnRegistrar;
    @FXML
    private Button btnAnhadirEquipoMundial;
    @FXML
    private Button btnRegistrarMundial;

    // Aqui defino labels
    @FXML
    private Label lblAnhadirEquiposMundial;
    @FXML
    private Label lblListaEquipos;

    @FXML
    private TextField txtISO;
    @FXML
    private TextField txtNombre;
    @FXML
    private TextField txtRanking;
    @FXML
    private TextField txtPais;
    @FXML
    private TextField txtGrupo1;
    @FXML
    private TextField txtGrupo2;
    @FXML
    private TextField txtGrupo3;
    @FXML
    private TextField txtGrupo4;
    @FXML
    private TextField txtGrupo5;
    @FXML
    private TextField txtGrupo6;
    @FXML
    private TextField txtGrupo7;
    @FXML
    private TextField txtGrupo8;
    @FXML
    private TextField txtNombreLiga;

    //Aqui defino DatePickers
    @FXML
    private DatePicker dateMundial;
    @FXML
    private DatePicker dateLiga;

    // Esto es para agrupar los radio buttons
    private ToggleGroup actividadMundialesGroup;
    private ToggleGroup actividadLigaGroup;

    @FXML
    private RadioButton rbtnMundialActivo;
    @FXML
    private RadioButton rbtnMundialInactivo;
    @FXML
    private RadioButton rbtnLigaActivo;
    @FXML
    private RadioButton rbtnLigaInactivo;

    // Aqui defino los equipos que van a ir dentro del choiceBox
    @FXML
    private ComboBox comboBoxEquipos;

    // Aqui listo mundiales que van en el choiceBox
    @FXML
    private ComboBox comboBoxlistaMundiales;
    @FXML
    private ComboBox comboBoxlistaMundiales2;
    @FXML
    private ComboBox comboBoxlistaMundiales3;

    // Aqui defino los grupos;
    @FXML
    private ListView lviewGrupo1;
    @FXML
    private ListView lviewGrupo2;
    @FXML
    private ListView lviewGrupo3;
    @FXML
    private ListView lviewGrupo4;
    @FXML
    private ListView lviewGrupo5;
    @FXML
    private ListView lviewGrupo6;
    @FXML
    private ListView lviewGrupo7;
    @FXML
    private ListView lviewGrupo8;

    @FXML
    private ListView lviewCronograma1;
    @FXML
    private ListView lviewCronograma2;
    @FXML
    private ListView lviewCronograma3;
    @FXML
    private ListView lviewCronograma4;
    @FXML
    private ListView lviewCronograma5;
    @FXML
    private ListView lviewCronograma6;
    @FXML
    private ListView lviewCronograma7;
    @FXML
    private ListView lviewCronograma8;

    @FXML
    private ListView lViewLigas;

    // Aqui defino las listas para 
    @Override
    public void initialize(URL url, ResourceBundle rb) {

        //Aqui se anhaden los valores a las columnas de los equipos
        isoColumn.setCellValueFactory(new PropertyValueFactory<Equipo, String>("iso"));
        nombreColumn.setCellValueFactory(new PropertyValueFactory<Equipo, String>("nombre"));
        rankingColumn.setCellValueFactory(new PropertyValueFactory<Equipo, String>("rankinFIFA"));

        tableViewEquipos.setItems(getEquipos());

        tableViewEquipos.setEditable(true);

        btnActualizar.setVisible(false);
        btnRegistrarMundial.setVisible(false);

        //Aqui agrupo los radio buttons dentro de un toggleGroup
        actividadMundialesGroup = new ToggleGroup();
        this.rbtnMundialActivo.setToggleGroup(actividadMundialesGroup);
        this.rbtnMundialInactivo.setToggleGroup(actividadMundialesGroup);
        rbtnMundialActivo.setSelected(true);

        //Aqui agrupo los radio buttons dentro de otro toggleGroup
        actividadLigaGroup = new ToggleGroup();
        this.rbtnLigaActivo.setToggleGroup(actividadLigaGroup);
        this.rbtnLigaInactivo.setToggleGroup(actividadLigaGroup);
        rbtnLigaInactivo.setSelected(true);

        //Aqui relleno los equipos que van dentro del ChoiceBox 
        GestorEquipos miGestor = new GestorEquipos();
        ArrayList<Equipo> listaEquipos = miGestor.getListaEquipos();
        for (Equipo x : listaEquipos) {
            comboBoxEquipos.getItems().add(x.getIso() + ", " + x.getNombre());
        }
    }

    public void nuevoEquipo() {
        Equipo equipoNuevo = new Equipo(txtISO.getText(), txtNombre.getText(), Integer.parseInt(txtRanking.getText()));
        // tomar todos los items de la tabla
        tableViewEquipos.getItems().add(equipoNuevo);
        txtISO.setText("");
        txtNombre.setText("");
        txtRanking.setText("");

    }

    // Metodo para borrar lineas
    public void deleteEquipo() {
        ObservableList<Equipo> selectedRows, allTeams;
        allTeams = tableViewEquipos.getItems();
        selectedRows = tableViewEquipos.getSelectionModel().getSelectedItems();

        for (Equipo x : selectedRows) {
            allTeams.remove(x);
        }
    }

    public void actualizarEquipo() {
        btnActualizar.setVisible(false);
        btnRegistrar.setVisible(true);
        Equipo selectedRow = tableViewEquipos.getSelectionModel().getSelectedItem();

        Equipo equipoActualizado = new Equipo(txtISO.getText(), txtNombre.getText(), Integer.parseInt(txtRanking.getText()));

        tableViewEquipos.getItems().remove(selectedRow);
        tableViewEquipos.getItems().add(equipoActualizado);

        txtISO.setText("");
        txtNombre.setText("");
        txtRanking.setText("");

    }

    public void cancelarEquipos() {
        txtISO.setText("");
        txtNombre.setText("");
        txtRanking.setText("");
    }

    public ObservableList<Equipo> getEquipos() {

        GestorEquipos miGestor = new GestorEquipos();
        ArrayList<Equipo> listaEquipos = miGestor.getListaEquipos();

        ObservableList<Equipo> lista = FXCollections.observableArrayList();

        for (Equipo x : listaEquipos) {
            lista.add(x);
        }

        return lista;
    }

    public void salirDelSistema(ActionEvent event) throws IOException {
        Parent tableViewParent = FXMLLoader.load(getClass().getResource("Login.fxml"));
        Scene tableViewScene = new Scene(tableViewParent);

        //Esta linea toma la informacion del Stage
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        window.setScene(tableViewScene);
        window.show();
    }

    public void modificarEquipo(CellEditEvent celdaCambiar) {
        btnActualizar.setVisible(true);
        btnRegistrar.setVisible(false);

        Equipo selectedRow = tableViewEquipos.getSelectionModel().getSelectedItem();
        txtISO.setText(selectedRow.getIso());
        txtNombre.setText(selectedRow.getNombre());
        txtRanking.setText(String.valueOf(selectedRow.getRankinFIFA()));
    }

    // Este metodo añade equipos dentro de un grupo:
    public void anhadirEquiposMundial() {
        if (lviewGrupo1.getItems().size() < 4) {
            lviewGrupo1.getItems().add(comboBoxEquipos.getSelectionModel().getSelectedItem());
            comboBoxEquipos.getItems().remove(comboBoxEquipos.getSelectionModel().getSelectedItem());
        } else {
            if (lviewGrupo2.getItems().size() < 4) {
                lviewGrupo2.getItems().add(comboBoxEquipos.getSelectionModel().getSelectedItem());
                comboBoxEquipos.getItems().remove(comboBoxEquipos.getSelectionModel().getSelectedItem());
            } else {
                if (lviewGrupo3.getItems().size() < 4) {
                    lviewGrupo3.getItems().add(comboBoxEquipos.getSelectionModel().getSelectedItem());
                    comboBoxEquipos.getItems().remove(comboBoxEquipos.getSelectionModel().getSelectedItem());
                } else {
                    if (lviewGrupo4.getItems().size() < 4) {
                        lviewGrupo4.getItems().add(comboBoxEquipos.getSelectionModel().getSelectedItem());
                        comboBoxEquipos.getItems().remove(comboBoxEquipos.getSelectionModel().getSelectedItem());
                    } else {
                        if (lviewGrupo5.getItems().size() < 4) {
                            lviewGrupo5.getItems().add(comboBoxEquipos.getSelectionModel().getSelectedItem());
                            comboBoxEquipos.getItems().remove(comboBoxEquipos.getSelectionModel().getSelectedItem());
                        } else {
                            if (lviewGrupo6.getItems().size() < 4) {
                                lviewGrupo6.getItems().add(comboBoxEquipos.getSelectionModel().getSelectedItem());
                                comboBoxEquipos.getItems().remove(comboBoxEquipos.getSelectionModel().getSelectedItem());
                            } else {
                                if (lviewGrupo7.getItems().size() < 4) {
                                    lviewGrupo7.getItems().add(comboBoxEquipos.getSelectionModel().getSelectedItem());
                                    comboBoxEquipos.getItems().remove(comboBoxEquipos.getSelectionModel().getSelectedItem());
                                } else {
                                    if (lviewGrupo8.getItems().size() < 3) {
                                        lviewGrupo8.getItems().add(comboBoxEquipos.getSelectionModel().getSelectedItem());
                                        comboBoxEquipos.getItems().remove(comboBoxEquipos.getSelectionModel().getSelectedItem());
                                    } else {
                                        if (lviewGrupo8.getItems().size() < 4) {
                                            lviewGrupo8.getItems().add(comboBoxEquipos.getSelectionModel().getSelectedItem());
                                            comboBoxEquipos.getItems().remove(comboBoxEquipos.getSelectionModel().getSelectedItem());
                                            comboBoxEquipos.setVisible(false);
                                            btnAnhadirEquipoMundial.setVisible(false);
                                            lblListaEquipos.setText("Grupos llenos!");
                                            lblAnhadirEquiposMundial.setVisible(false);
                                            btnRegistrarMundial.setVisible(true);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public void cancelarRegistroMundial() {
        comboBoxEquipos.getItems().clear();
        //Aqui relleno los equipos que van dentro del ChoiceBox 

        GestorEquipos miGestor = new GestorEquipos();
        ArrayList<Equipo> listaEquipos = miGestor.getListaEquipos();
        for (Equipo x : listaEquipos) {
            comboBoxEquipos.getItems().add(x.getIso() + ", " + x.getNombre());
        }
        lviewGrupo1.getItems().clear();
        lviewGrupo2.getItems().clear();
        lviewGrupo3.getItems().clear();
        lviewGrupo4.getItems().clear();
        lviewGrupo5.getItems().clear();
        lviewGrupo6.getItems().clear();
        lviewGrupo7.getItems().clear();
        lviewGrupo8.getItems().clear();

        txtPais.setText("");
        dateMundial.setValue(null);
        comboBoxEquipos.setVisible(true);
        btnAnhadirEquipoMundial.setVisible(true);
        lblListaEquipos.setText("Lista de equipos:");
        lblAnhadirEquiposMundial.setVisible(true);
        btnRegistrarMundial.setVisible(false);

    }

    public void registrarMundial() {

        String pais;
        LocalDate fecha;
        boolean estatus;

        pais = txtPais.getText();
        fecha = dateMundial.getValue();
        if (rbtnMundialActivo.isSelected()) {
            estatus = true;
        } else {
            estatus = false;
        }

        GestorMundiales miGestorMundial = new GestorMundiales();
        miGestorMundial.setMundial(fecha, pais, estatus);

        //Prueba!
        System.out.println("Tamano " + lviewGrupo1.getItems().size());
        System.out.println("Tamano " + lviewGrupo2.getItems().size());
        System.out.println("Tamano " + lviewGrupo3.getItems().size());
        System.out.println("Tamano " + lviewGrupo4.getItems().size());
        System.out.println("Tamano " + lviewGrupo5.getItems().size());
        System.out.println("Tamano " + lviewGrupo6.getItems().size());
        System.out.println("Tamano " + lviewGrupo7.getItems().size());
        System.out.println("Tamano " + lviewGrupo8.getItems().size());

        //set grupo 1
        ObservableList<String> listaEquipos1 = lviewGrupo1.getItems();
        ArrayList<String> equipos1 = new ArrayList();
        for (String e : listaEquipos1) {
            equipos1.add(e.toString().substring(5));
        }

        GestorGrupos miGestorGrupos = new GestorGrupos();

        miGestorGrupos.setGrupoMundial(pais, txtGrupo1.getText(), txtGrupo1.getText(), equipos1);

        //set grupo 2
        ObservableList<String> listaEquipos2 = lviewGrupo2.getItems();
        ArrayList<String> equipos2 = new ArrayList();
        for (String e : listaEquipos2) {
            equipos2.add(e.substring(5));
        }
        miGestorGrupos.setGrupoMundial(pais, txtGrupo2.getText(), txtGrupo2.getText(), equipos2);

        //set grupo 3
        ObservableList<String> listaEquipos3 = lviewGrupo3.getItems();
        ArrayList<String> equipos3 = new ArrayList();
        for (String e : listaEquipos3) {
            equipos3.add(e.substring(5));
        }
        miGestorGrupos.setGrupoMundial(pais, txtGrupo3.getText(), txtGrupo3.getText(), equipos3);

        //set grupo 4
        ObservableList<String> listaEquipos4 = lviewGrupo4.getItems();
        ArrayList<String> equipos4 = new ArrayList();
        for (String e : listaEquipos4) {
            equipos4.add(e.substring(5));
        }
        miGestorGrupos.setGrupoMundial(pais, txtGrupo4.getText(), txtGrupo4.getText(), equipos4);

        //set grupo 5
        ObservableList<String> listaEquipos5 = lviewGrupo5.getItems();
        ArrayList<String> equipos5 = new ArrayList();
        for (String e : listaEquipos5) {
            equipos5.add(e.substring(5));
        }
        miGestorGrupos.setGrupoMundial(pais, txtGrupo5.getText(), txtGrupo5.getText(), equipos5);

        //set grupo 6
        ObservableList<String> listaEquipos6 = lviewGrupo6.getItems();
        ArrayList<String> equipos6 = new ArrayList();
        for (String e : listaEquipos6) {
            equipos6.add(e.substring(5));
        }
        miGestorGrupos.setGrupoMundial(pais, txtGrupo6.getText(), txtGrupo6.getText(), equipos6);

        //set grupo 7
        ObservableList<String> listaEquipos7 = lviewGrupo7.getItems();
        ArrayList<String> equipos7 = new ArrayList();
        for (String e : listaEquipos7) {
            equipos7.add(e.substring(5));
        }
        miGestorGrupos.setGrupoMundial(pais, txtGrupo7.getText(), txtGrupo7.getText(), equipos7);

        //set grupo 8
        ObservableList<String> listaEquipos8 = lviewGrupo8.getItems();
        ArrayList<String> equipos8 = new ArrayList();
        for (String e : listaEquipos8) {
            equipos8.add(e.substring(5));
        }
        miGestorGrupos.setGrupoMundial(pais, txtGrupo8.getText(), txtGrupo8.getText(), equipos8);

        GestorCronogramas miGestorCrono = new GestorCronogramas();
        miGestorCrono.setCronograma(pais);

        //miGestor.setCronograma(pais);
        cancelarRegistroMundial();

    }

    public void rellenarMundiales() {
        GestorMundiales miGestor = new GestorMundiales();
        ArrayList<String> mundiales = miGestor.listarMundiales();
        comboBoxlistaMundiales.getItems().clear();
        comboBoxlistaMundiales2.getItems().clear();
        comboBoxlistaMundiales3.getItems().clear();

        for (String x : mundiales) {
            comboBoxlistaMundiales.getItems().add(x);
            comboBoxlistaMundiales2.getItems().add(x);
            comboBoxlistaMundiales3.getItems().add(x);
        }

    }

    public void rellenarCronograma() {
        GestorCronogramas miGestor = new GestorCronogramas();
        String pais;

        lviewCronograma1.getItems().clear();
        lviewCronograma2.getItems().clear();
        lviewCronograma3.getItems().clear();
        lviewCronograma4.getItems().clear();
        lviewCronograma5.getItems().clear();;
        lviewCronograma6.getItems().clear();
        lviewCronograma7.getItems().clear();
        lviewCronograma8.getItems().clear();

        pais = comboBoxlistaMundiales2.getSelectionModel().getSelectedItem().toString();

        ArrayList<String> partidos = new ArrayList();

        partidos = miGestor.getCronograma(pais);

        for (int i = 0; i < 6; i++) {
            lviewCronograma1.getItems().add(partidos.get(i));
            lviewCronograma2.getItems().add(partidos.get(i + 6));
            lviewCronograma3.getItems().add(partidos.get(i + 12));
            lviewCronograma4.getItems().add(partidos.get(i + 18));
            lviewCronograma5.getItems().add(partidos.get(i + 24));
            lviewCronograma6.getItems().add(partidos.get(i + 30));
            lviewCronograma7.getItems().add(partidos.get(i + 36));
            lviewCronograma8.getItems().add(partidos.get(i + 42));
        }

    }

    public void registrarLiga() {
        String nombreLiga;
        LocalDate fechaCreacion;
        boolean estatus;
        String mundial;

        nombreLiga = txtNombreLiga.getText();
        fechaCreacion = dateLiga.getValue();

        if (rbtnLigaActivo.isSelected()) {
            estatus = true;
        } else {
            estatus = false;
        }

        mundial = comboBoxlistaMundiales.getSelectionModel().getSelectedItem().toString();

        GestorLigas miGestor = new GestorLigas();
        miGestor.setLiga(mundial, nombreLiga, fechaCreacion, estatus, false);
        lViewLigas.getItems().clear();
        ArrayList<String> ligas = new ArrayList();
        ligas = miGestor.getLigas(mundial);
        for (String x : ligas) {
            lViewLigas.getItems().add(x);
        }

    }

    public void cancelarRegistroLiga() {
        txtNombreLiga.setText("");
        dateLiga.setValue(null);
        comboBoxlistaMundiales.getItems().clear();

    }

    public void llenarInformacion() {
        tableViewCronograma.getItems().removeAll();
        ObservableList<CronogramaUI> lista = FXCollections.observableArrayList();
        String pais;

        pais = comboBoxlistaMundiales3.getSelectionModel().getSelectedItem().toString();

        GestorCronogramas miGestor = new GestorCronogramas();

        ArrayList<String> cronograma = miGestor.getCronogramaCompleto(pais);

        for (String x : cronograma) {
            String codigo = x.substring(0, x.indexOf(")"));
            String equipo1 = x.substring(x.indexOf(")") + 1, x.indexOf(" -"));
            String equipo2 = x.substring(x.indexOf("- ") + 2, x.indexOf("/"));
            String date = x.substring(x.indexOf("/") + 1, x.indexOf(",fase:"));
            String fase = x.substring(x.indexOf(",fase:") + 6);
            CronogramaUI partidoX = new CronogramaUI(codigo, equipo1, equipo2, date, fase, "", "");
            lista.add(partidoX);
        }

        columnaFecha.setCellValueFactory(new PropertyValueFactory<CronogramaUI, String>("fecha"));
        columnaEquipo1.setCellValueFactory(new PropertyValueFactory<CronogramaUI, String>("equipo1"));
        columnaEquipo2.setCellValueFactory(new PropertyValueFactory<CronogramaUI, String>("equipo2"));
        columnaFase.setCellValueFactory(new PropertyValueFactory<CronogramaUI, String>("fase"));
        columnaGoles1.setCellValueFactory(new PropertyValueFactory<CronogramaUI, TextField>("golesEquipo1"));
        columnaGoles2.setCellValueFactory(new PropertyValueFactory<CronogramaUI, TextField>("golesEquipo2"));

        tableViewCronograma.setItems(lista);

    }

    public void cambioResultadoEquipo1(CellEditEvent edittedCell) {
        CronogramaUI partidoX = tableViewCronograma.getSelectionModel().getSelectedItem();
        partidoX.setGolesEquipo1(edittedCell.getNewValue().toString());
    }

    public void cambioResultadoEquipo2(CellEditEvent edittedCell) {
        CronogramaUI partidoX = tableViewCronograma.getSelectionModel().getSelectedItem();
        partidoX.setGolesEquipo2(edittedCell.getNewValue().toString());
    }

    public void guardarResultadosMundial() {
        ObservableList<CronogramaUI> cronoX = tableViewCronograma.getItems();
        GestorCronogramas miGestor = new GestorCronogramas();
        String pais = comboBoxlistaMundiales3.getSelectionModel().getSelectedItem().toString();

        for (CronogramaUI x : cronoX) {
            if (x.getGolesEquipo1().getText().equals("") || x.getGolesEquipo1().getText().equals("")) {
            } else {
                int codigo = Integer.parseInt(x.getCodigo());
                int goles1 = Integer.parseInt(x.getGolesEquipo1().getText());
                int goles2 = Integer.parseInt(x.getGolesEquipo2().getText());
                //prueba
                System.out.println("Codigo" + codigo + "/" + goles1 + "-" + goles2);

                miGestor.actualizarResultadosCronograma(pais, codigo, goles1, goles2);
            }

        }

    }

}
