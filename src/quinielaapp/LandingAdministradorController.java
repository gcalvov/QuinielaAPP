/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quinielaapp;

import cl.Equipo;
import java.io.IOException;
import java.net.URL;
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
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellEditEvent;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.stage.Stage;
import javax.swing.plaf.basic.BasicTreeUI;

/**
 * FXML Controller class
 *
 * @author Gabriel
 */
public class LandingAdministradorController implements Initializable {

    @FXML
    private TableView<Equipo> tableView;
    @FXML
    private TableColumn<Equipo, String> isoColumn;
    @FXML
    private TableColumn<Equipo, String> nombreColumn;
    @FXML
    private TableColumn<Equipo, String> rankingColumn;

    @FXML
    Button btnSalir;

    @FXML
    private TextField txtISO;
    @FXML
    private TextField txtNombre;
    @FXML
    private TextField txtRanking;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        isoColumn.setCellValueFactory(new PropertyValueFactory<Equipo, String>("iso"));
        nombreColumn.setCellValueFactory(new PropertyValueFactory<Equipo, String>("nombre"));
        rankingColumn.setCellValueFactory(new PropertyValueFactory<Equipo, String>("rankinFIFA"));

        tableView.setItems(getEquipos());

        tableView.setEditable(true);
        nombreColumn.setCellFactory(TextFieldTableCell.forTableColumn());
        isoColumn.setCellFactory(TextFieldTableCell.forTableColumn());
        rankingColumn.setCellFactory(TextFieldTableCell.forTableColumn());

        tableView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

    }

    // Metodo para borrar lineas
    public void deleteEquipo() {
        ObservableList<Equipo> selectedRows, allTeams;
        allTeams = tableView.getItems();
        selectedRows = tableView.getSelectionModel().getSelectedItems();

        for (Equipo x : selectedRows) {
            allTeams.remove(x);
        }
    }

    public ObservableList<Equipo> getEquipos() {
        ObservableList<Equipo> listaEquipos = FXCollections.observableArrayList();
        listaEquipos.add(new Equipo("CRC", "Costa Rica", "12"));
        listaEquipos.add(new Equipo("BRA", "Brazil", "1"));
        listaEquipos.add(new Equipo("BEL", "Belgica", "3"));
        listaEquipos.add(new Equipo("CRC", "Costa Rica", "12"));
        listaEquipos.add(new Equipo("BRA", "Brazil", "1"));
        listaEquipos.add(new Equipo("BEL", "Belgica", "3"));
        listaEquipos.add(new Equipo("CRC", "Costa Rica", "12"));
        listaEquipos.add(new Equipo("BRA", "Brazil", "1"));
        listaEquipos.add(new Equipo("BEL", "Belgica", "3"));

        return listaEquipos;
    }

    public void salirDelSistema(ActionEvent event) throws IOException {
        System.exit(0);
    }

    public void cambiarDatos(CellEditEvent celdaCambiar) {
        Equipo equipoSeleccionado = tableView.getSelectionModel().getSelectedItem();
        equipoSeleccionado.setNombre(celdaCambiar.getNewValue().toString());
        equipoSeleccionado.setIso(celdaCambiar.getNewValue().toString());
        equipoSeleccionado.setRankinFIFA(celdaCambiar.getNewValue().toString());
    }

    public void nuevoEquipo() {
        Equipo equipoNuevo = new Equipo(txtISO.getText(), txtNombre.getText(), txtRanking.getText());
        // tomar todos los items de la tabla
        tableView.getItems().add(equipoNuevo);
    }

}
