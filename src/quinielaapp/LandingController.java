/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quinielaapp;

import gestores.GestorCronogramas;
import gestores.GestorMundiales;
import java.io.IOException;
import java.net.URL;
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
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 *
 * @author Gabriel
 */
public class LandingController implements Initializable {

    @FXML
    private ComboBox comboBoxMundiales;
    @FXML
    private ComboBox comboBoxMundiales2;

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
    
    //Aqui establezco los componentes para mostrar tabla;
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
    

    public void salirDelSistema(ActionEvent event) throws IOException {
        Parent tableViewParent = FXMLLoader.load(getClass().getResource("Login.fxml"));
        Scene tableViewScene = new Scene(tableViewParent);

        //Esta linea toma la informacion del Stage
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        window.setScene(tableViewScene);
        window.show();
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

        pais = comboBoxMundiales.getSelectionModel().getSelectedItem().toString();

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
    
        public void llenarInformacion() {
        tableViewCronograma.getItems().removeAll();
        ObservableList<CronogramaUI> lista = FXCollections.observableArrayList();
        String pais;

        pais = comboBoxMundiales.getSelectionModel().getSelectedItem().toString();

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

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        GestorMundiales miGestor = new GestorMundiales();
        ArrayList<String> mundiales = miGestor.listarMundiales();
        comboBoxMundiales.getItems().clear();
        comboBoxMundiales2.getItems().clear();

        for (String x : mundiales) {
            comboBoxMundiales.getItems().add(x);
            comboBoxMundiales2.getItems().add(x);
        }
    }

}
